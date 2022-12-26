package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import o.Nested;
/* loaded from: classes7.dex */
final class ActionDisposable extends ReferenceDisposable<Nested> {
    private static final long serialVersionUID = -8219729196779211169L;

    ActionDisposable(Nested nested) {
        super(nested);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(Nested nested) {
        try {
            nested.ag$a();
        } catch (Throwable th) {
            throw ExceptionHelper.valueOf(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
