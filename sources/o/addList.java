package o;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
public abstract class addList<T> implements IdlingResource<T>, dataStart {
    final AtomicReference<dataStart> toString = new AtomicReference<>();

    protected void values() {
    }

    @Override // o.IdlingResource
    public final void onSubscribe(dataStart datastart) {
        if (__assign.valueOf(this.toString, datastart, getClass())) {
            values();
        }
    }

    @Override // o.dataStart
    public final boolean isDisposed() {
        return this.toString.get() == DisposableHelper.DISPOSED;
    }

    @Override // o.dataStart
    public final void dispose() {
        DisposableHelper.dispose(this.toString);
    }
}
