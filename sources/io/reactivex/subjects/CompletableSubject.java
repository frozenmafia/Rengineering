package io.reactivex.subjects;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.isDraggable;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CompletableSubject extends isDraggable implements SlidingPaneLayout.SavedState {
    Throwable ag$a;
    static final CompletableDisposable[] valueOf = new CompletableDisposable[0];
    static final CompletableDisposable[] ah$a = new CompletableDisposable[0];
    final AtomicBoolean values = new AtomicBoolean();
    final AtomicReference<CompletableDisposable[]> toString = new AtomicReference<>(valueOf);

    CompletableSubject() {
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (this.toString.get() == ah$a) {
            anonymousClass2.dispose();
        }
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.values.compareAndSet(false, true)) {
            this.ag$a = th;
            for (CompletableDisposable completableDisposable : this.toString.getAndSet(ah$a)) {
                completableDisposable.downstream.onError(th);
            }
            return;
        }
        setProgressBackgroundColor.values(th);
    }

    @Override // o.SlidingPaneLayout.SavedState
    public void onComplete() {
        if (this.values.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.toString.getAndSet(ah$a)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    @Override // o.isDraggable
    public void valueOf(SlidingPaneLayout.SavedState savedState) {
        CompletableDisposable completableDisposable = new CompletableDisposable(savedState, this);
        savedState.onSubscribe(completableDisposable);
        if (toString(completableDisposable)) {
            if (completableDisposable.isDisposed()) {
                values(completableDisposable);
                return;
            }
            return;
        }
        Throwable th = this.ag$a;
        if (th != null) {
            savedState.onError(th);
        } else {
            savedState.onComplete();
        }
    }

    boolean toString(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.toString.get();
            if (completableDisposableArr == ah$a) {
                return false;
            }
            int length = completableDisposableArr.length;
            completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
        } while (!this.toString.compareAndSet(completableDisposableArr, completableDisposableArr2));
        return true;
    }

    void values(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.toString.get();
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
                completableDisposableArr2 = valueOf;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!this.toString.compareAndSet(completableDisposableArr, completableDisposableArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -7650903191002190468L;
        final SlidingPaneLayout.SavedState downstream;

        CompletableDisposable(SlidingPaneLayout.SavedState savedState, CompletableSubject completableSubject) {
            this.downstream = savedState;
            lazySet(completableSubject);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.values(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
