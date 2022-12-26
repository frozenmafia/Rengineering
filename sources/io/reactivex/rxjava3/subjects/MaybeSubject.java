package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
/* loaded from: classes7.dex */
public final class MaybeSubject<T> extends SwipeRefreshLayout.AnonymousClass8<T> implements IdlingRegistry<T> {
    static final MaybeDisposable[] ag$a = new MaybeDisposable[0];
    static final MaybeDisposable[] ah$a = new MaybeDisposable[0];
    T HaptikSDK$c;
    Throwable valueOf;
    final AtomicBoolean values = new AtomicBoolean();
    final AtomicReference<MaybeDisposable<T>[]> toString = new AtomicReference<>(ag$a);

    MaybeSubject() {
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSubscribe(dataStart datastart) {
        if (this.toString.get() == ah$a) {
            datastart.dispose();
        }
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        ExceptionHelper.valueOf(t, "onSuccess called with a null value.");
        if (this.values.compareAndSet(false, true)) {
            this.HaptikSDK$c = t;
            for (MaybeDisposable<T> maybeDisposable : this.toString.getAndSet(ah$a)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onError(Throwable th) {
        ExceptionHelper.valueOf(th, "onError called with a null Throwable.");
        if (this.values.compareAndSet(false, true)) {
            this.valueOf = th;
            for (MaybeDisposable<T> maybeDisposable : this.toString.getAndSet(ah$a)) {
                maybeDisposable.downstream.onError(th);
            }
            return;
        }
        endMetadataList.valueOf(th);
    }

    @Override // o.IdlingRegistry
    public void onComplete() {
        if (this.values.compareAndSet(false, true)) {
            for (MaybeDisposable<T> maybeDisposable : this.toString.getAndSet(ah$a)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        MaybeDisposable<T> maybeDisposable = new MaybeDisposable<>(idlingRegistry, this);
        idlingRegistry.onSubscribe(maybeDisposable);
        if (ag$a(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                ah$a(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th = this.valueOf;
        if (th != null) {
            idlingRegistry.onError(th);
            return;
        }
        Object obj = (T) this.HaptikSDK$c;
        if (obj == null) {
            idlingRegistry.onComplete();
        } else {
            idlingRegistry.onSuccess(obj);
        }
    }

    boolean ag$a(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable<T>[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.toString.get();
            if (maybeDisposableArr == ah$a) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!this.toString.compareAndSet(maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void ah$a(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.toString.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (maybeDisposableArr[i2] == maybeDisposable) {
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
                maybeDisposableArr2 = ag$a;
            } else {
                MaybeDisposable[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i);
                System.arraycopy(maybeDisposableArr, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!this.toString.compareAndSet(maybeDisposableArr, maybeDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements dataStart {
        private static final long serialVersionUID = -7650903191002190468L;
        final IdlingRegistry<? super T> downstream;

        MaybeDisposable(IdlingRegistry<? super T> idlingRegistry, MaybeSubject<T> maybeSubject) {
            this.downstream = idlingRegistry;
            lazySet(maybeSubject);
        }

        @Override // o.dataStart
        public void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.ah$a(this);
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
