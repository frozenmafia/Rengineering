package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.endMetadataList;
import o.list;
/* loaded from: classes7.dex */
public final class AsyncSubject<T> extends list<T> {
    Throwable ag$a;
    T ah$a;
    final AtomicReference<AsyncDisposable<T>[]> toString = new AtomicReference<>(values);
    static final AsyncDisposable[] values = new AsyncDisposable[0];
    static final AsyncDisposable[] valueOf = new AsyncDisposable[0];

    AsyncSubject() {
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
        if (this.toString.get() == valueOf) {
            return;
        }
        this.ah$a = t;
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        ExceptionHelper.valueOf(th, "onError called with a null Throwable.");
        AsyncDisposable<T>[] asyncDisposableArr = this.toString.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = valueOf;
        if (asyncDisposableArr == asyncDisposableArr2) {
            endMetadataList.valueOf(th);
            return;
        }
        this.ah$a = null;
        this.ag$a = th;
        for (AsyncDisposable<T> asyncDisposable : this.toString.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.onError(th);
        }
    }

    @Override // o.IdlingResource
    public void onComplete() {
        AsyncDisposable<T>[] asyncDisposableArr = this.toString.get();
        AsyncDisposable<T>[] asyncDisposableArr2 = valueOf;
        if (asyncDisposableArr == asyncDisposableArr2) {
            return;
        }
        T t = this.ah$a;
        AsyncDisposable<T>[] andSet = this.toString.getAndSet(asyncDisposableArr2);
        int i = 0;
        if (t == null) {
            int length = andSet.length;
            while (i < length) {
                andSet[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i < length2) {
            andSet[i].complete(t);
            i++;
        }
    }

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        AsyncDisposable<T> asyncDisposable = new AsyncDisposable<>(idlingResource, this);
        idlingResource.onSubscribe(asyncDisposable);
        if (toString(asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                ah$a(asyncDisposable);
                return;
            }
            return;
        }
        Throwable th = this.ag$a;
        if (th != null) {
            idlingResource.onError(th);
            return;
        }
        T t = this.ah$a;
        if (t != null) {
            asyncDisposable.complete(t);
        } else {
            asyncDisposable.onComplete();
        }
    }

    boolean toString(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable<T>[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.toString.get();
            if (asyncDisposableArr == valueOf) {
                return false;
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new AsyncDisposable[length + 1];
            System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
        } while (!this.toString.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void ah$a(AsyncDisposable<T> asyncDisposable) {
        AsyncDisposable<T>[] asyncDisposableArr;
        AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.toString.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (asyncDisposableArr[i2] == asyncDisposable) {
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
                asyncDisposableArr2 = values;
            } else {
                AsyncDisposable[] asyncDisposableArr3 = new AsyncDisposable[length - 1];
                System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i);
                System.arraycopy(asyncDisposableArr, i + 1, asyncDisposableArr3, i, (length - i) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!this.toString.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        AsyncDisposable(IdlingResource<? super T> idlingResource, AsyncSubject<T> asyncSubject) {
            super(idlingResource);
            this.parent = asyncSubject;
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, o.dataStart
        public void dispose() {
            if (super.tryDispose()) {
                this.parent.ah$a(this);
            }
        }

        void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }

        void onError(Throwable th) {
            if (isDisposed()) {
                endMetadataList.valueOf(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
