package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.createListVector;
import o.dataStart;
/* loaded from: classes7.dex */
public class TestObserver<T> extends createListVector<T, TestObserver<T>> implements IdlingResource<T>, dataStart, IdlingRegistry<T>, IdlingResource.ResourceCallback<T>, SwipeRefreshLayout.AnonymousClass3 {
    private final IdlingResource<? super T> ah$b;
    private final AtomicReference<dataStart> invoke;

    /* loaded from: classes7.dex */
    enum EmptyObserver implements IdlingResource<Object> {
        INSTANCE;

        @Override // o.IdlingResource
        public void onComplete() {
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
        }

        @Override // o.IdlingResource
        public void onNext(Object obj) {
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public TestObserver(IdlingResource<? super T> idlingResource) {
        this.invoke = new AtomicReference<>();
        this.ah$b = idlingResource;
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        this.ag$a = Thread.currentThread();
        if (datastart == null) {
            this.values.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.invoke.compareAndSet(null, datastart)) {
            datastart.dispose();
            if (this.invoke.get() != DisposableHelper.DISPOSED) {
                List<Throwable> list = this.values;
                list.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + datastart));
            }
        } else {
            this.ah$b.onSubscribe(datastart);
        }
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        if (!this.valueOf) {
            this.valueOf = true;
            if (this.invoke.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.ag$a = Thread.currentThread();
        this.HaptikSDK$c.add(t);
        if (t == null) {
            this.values.add(new NullPointerException("onNext received a null value"));
        }
        this.ah$b.onNext(t);
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        if (!this.valueOf) {
            this.valueOf = true;
            if (this.invoke.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.ag$a = Thread.currentThread();
            if (th == null) {
                this.values.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.values.add(th);
            }
            this.ah$b.onError(th);
        } finally {
            this.toString.countDown();
        }
    }

    @Override // o.IdlingResource
    public void onComplete() {
        if (!this.valueOf) {
            this.valueOf = true;
            if (this.invoke.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.ag$a = Thread.currentThread();
            this.ah$a++;
            this.ah$b.onComplete();
        } finally {
            this.toString.countDown();
        }
    }

    @Override // o.dataStart
    public final void dispose() {
        DisposableHelper.dispose(this.invoke);
    }

    @Override // o.dataStart
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.invoke.get());
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }
}
