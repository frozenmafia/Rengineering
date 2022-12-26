package o;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
/* loaded from: classes7.dex */
public final class pad<T> implements IdlingResource.ResourceCallback<T> {
    final IdlingResource.ResourceCallback<? super T> toString;
    final AtomicReference<dataStart> valueOf;

    public pad(AtomicReference<dataStart> atomicReference, IdlingResource.ResourceCallback<? super T> resourceCallback) {
        this.valueOf = atomicReference;
        this.toString = resourceCallback;
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onSubscribe(dataStart datastart) {
        DisposableHelper.replace(this.valueOf, datastart);
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        this.toString.onSuccess(t);
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onError(Throwable th) {
        this.toString.onError(th);
    }
}
