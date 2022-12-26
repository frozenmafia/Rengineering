package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class CompletableSubject extends setSlingshotDistance implements SwipeRefreshLayout.AnonymousClass3 {
    static final CompletableDisposable[] ah$a = new CompletableDisposable[0];
    static final CompletableDisposable[] valueOf = new CompletableDisposable[0];
    Throwable toString;
    final AtomicBoolean ag$a = new AtomicBoolean();
    final AtomicReference<CompletableDisposable[]> values = new AtomicReference<>(ah$a);

    CompletableSubject() {
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onSubscribe(dataStart datastart) {
        if (this.values.get() == valueOf) {
            datastart.dispose();
        }
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onError(Throwable th) {
        ExceptionHelper.valueOf(th, "onError called with a null Throwable.");
        if (this.ag$a.compareAndSet(false, true)) {
            this.toString = th;
            for (CompletableDisposable completableDisposable : this.values.getAndSet(valueOf)) {
                completableDisposable.downstream.onError(th);
            }
            return;
        }
        endMetadataList.valueOf(th);
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onComplete() {
        if (this.ag$a.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.values.getAndSet(valueOf)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        CompletableDisposable completableDisposable = new CompletableDisposable(anonymousClass3, this);
        anonymousClass3.onSubscribe(completableDisposable);
        if (ag$a(completableDisposable)) {
            if (completableDisposable.isDisposed()) {
                valueOf(completableDisposable);
                return;
            }
            return;
        }
        Throwable th = this.toString;
        if (th != null) {
            anonymousClass3.onError(th);
        } else {
            anonymousClass3.onComplete();
        }
    }

    boolean ag$a(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.values.get();
            if (completableDisposableArr == valueOf) {
                return false;
            }
            int length = completableDisposableArr.length;
            completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
        } while (!this.values.compareAndSet(completableDisposableArr, completableDisposableArr2));
        return true;
    }

    void valueOf(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.values.get();
            int length = completableDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (completableDisposableArr[i2] == completableDisposable) {
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
                completableDisposableArr2 = ah$a;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!this.values.compareAndSet(completableDisposableArr, completableDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements dataStart {
        private static final long serialVersionUID = -7650903191002190468L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;

        CompletableDisposable(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, CompletableSubject completableSubject) {
            this.downstream = anonymousClass3;
            lazySet(completableSubject);
        }

        @Override // o.dataStart
        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.valueOf(this);
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
