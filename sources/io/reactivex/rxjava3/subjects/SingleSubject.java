package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.endMetadataList;
import o.onTransitionToIdle;
/* loaded from: classes7.dex */
public final class SingleSubject<T> extends onTransitionToIdle<T> implements IdlingResource.ResourceCallback<T> {
    static final SingleDisposable[] ag$a = new SingleDisposable[0];
    static final SingleDisposable[] values = new SingleDisposable[0];
    T HaptikSDK$a;
    Throwable toString;
    final AtomicBoolean valueOf = new AtomicBoolean();
    final AtomicReference<SingleDisposable<T>[]> ah$a = new AtomicReference<>(ag$a);

    SingleSubject() {
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onSubscribe(dataStart datastart) {
        if (this.ah$a.get() == values) {
            datastart.dispose();
        }
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        ExceptionHelper.valueOf(t, "onSuccess called with a null value.");
        if (this.valueOf.compareAndSet(false, true)) {
            this.HaptikSDK$a = t;
            for (SingleDisposable<T> singleDisposable : this.ah$a.getAndSet(values)) {
                singleDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onError(Throwable th) {
        ExceptionHelper.valueOf(th, "onError called with a null Throwable.");
        if (this.valueOf.compareAndSet(false, true)) {
            this.toString = th;
            for (SingleDisposable<T> singleDisposable : this.ah$a.getAndSet(values)) {
                singleDisposable.downstream.onError(th);
            }
            return;
        }
        endMetadataList.valueOf(th);
    }

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        SingleDisposable<T> singleDisposable = new SingleDisposable<>(resourceCallback, this);
        resourceCallback.onSubscribe(singleDisposable);
        if (ag$a(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                toString(singleDisposable);
                return;
            }
            return;
        }
        Throwable th = this.toString;
        if (th != null) {
            resourceCallback.onError(th);
        } else {
            resourceCallback.onSuccess((T) this.HaptikSDK$a);
        }
    }

    boolean ag$a(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable<T>[] singleDisposableArr2;
        do {
            singleDisposableArr = this.ah$a.get();
            if (singleDisposableArr == values) {
                return false;
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!this.ah$a.compareAndSet(singleDisposableArr, singleDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void toString(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.ah$a.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (singleDisposableArr[i2] == singleDisposable) {
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
                singleDisposableArr2 = ag$a;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!this.ah$a.compareAndSet(singleDisposableArr, singleDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements dataStart {
        private static final long serialVersionUID = -7650903191002190468L;
        final IdlingResource.ResourceCallback<? super T> downstream;

        SingleDisposable(IdlingResource.ResourceCallback<? super T> resourceCallback, SingleSubject<T> singleSubject) {
            this.downstream = resourceCallback;
            lazySet(singleSubject);
        }

        @Override // o.dataStart
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.toString(this);
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
