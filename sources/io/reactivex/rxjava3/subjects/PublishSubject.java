package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.endMetadataList;
import o.list;
/* loaded from: classes7.dex */
public final class PublishSubject<T> extends list<T> {
    final AtomicReference<PublishDisposable<T>[]> toString = new AtomicReference<>(ag$a);
    Throwable values;
    static final PublishDisposable[] valueOf = new PublishDisposable[0];
    static final PublishDisposable[] ag$a = new PublishDisposable[0];

    public static <T> PublishSubject<T> ag$a() {
        return new PublishSubject<>();
    }

    PublishSubject() {
    }

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(idlingResource, this);
        idlingResource.onSubscribe(publishDisposable);
        if (values(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                ah$a(publishDisposable);
                return;
            }
            return;
        }
        Throwable th = this.values;
        if (th != null) {
            idlingResource.onError(th);
        } else {
            idlingResource.onComplete();
        }
    }

    boolean values(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = this.toString.get();
            if (publishDisposableArr == valueOf) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!this.toString.compareAndSet(publishDisposableArr, publishDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void ah$a(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.toString.get();
            if (publishDisposableArr == valueOf || publishDisposableArr == ag$a) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (publishDisposableArr[i2] == publishDisposable) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = ag$a;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!this.toString.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        if (this.toString.get() == valueOf) {
            datastart.dispose();
        }
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        ExceptionHelper.valueOf(t, "onNext called with a null value.");
        for (PublishDisposable<T> publishDisposable : this.toString.get()) {
            publishDisposable.onNext(t);
        }
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        ExceptionHelper.valueOf(th, "onError called with a null Throwable.");
        PublishDisposable<T>[] publishDisposableArr = this.toString.get();
        PublishDisposable<T>[] publishDisposableArr2 = valueOf;
        if (publishDisposableArr == publishDisposableArr2) {
            endMetadataList.valueOf(th);
            return;
        }
        this.values = th;
        for (PublishDisposable<T> publishDisposable : this.toString.getAndSet(publishDisposableArr2)) {
            publishDisposable.onError(th);
        }
    }

    @Override // o.IdlingResource
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.toString.get();
        PublishDisposable<T>[] publishDisposableArr2 = valueOf;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.toString.getAndSet(publishDisposableArr2)) {
            publishDisposable.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class PublishDisposable<T> extends AtomicBoolean implements dataStart {
        private static final long serialVersionUID = 3562861878281475070L;
        final IdlingResource<? super T> downstream;
        final PublishSubject<T> parent;

        PublishDisposable(IdlingResource<? super T> idlingResource, PublishSubject<T> publishSubject) {
            this.downstream = idlingResource;
            this.parent = publishSubject;
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        public void onError(Throwable th) {
            if (get()) {
                endMetadataList.valueOf(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // o.dataStart
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.ah$a(this);
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get();
        }
    }
}
