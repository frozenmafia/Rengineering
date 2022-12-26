package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
/* loaded from: classes7.dex */
final class ObservableTimeoutTimed$ag$a<T> implements IdlingResource<T> {
    final IdlingResource<? super T> ah$a;
    final AtomicReference<dataStart> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObservableTimeoutTimed$ag$a(IdlingResource<? super T> idlingResource, AtomicReference<dataStart> atomicReference) {
        this.ah$a = idlingResource;
        this.values = atomicReference;
    }

    @Override // o.IdlingResource
    public void onSubscribe(dataStart datastart) {
        DisposableHelper.replace(this.values, datastart);
    }

    @Override // o.IdlingResource
    public void onNext(T t) {
        this.ah$a.onNext(t);
    }

    @Override // o.IdlingResource
    public void onError(Throwable th) {
        this.ah$a.onError(th);
    }

    @Override // o.IdlingResource
    public void onComplete() {
        this.ah$a.onComplete();
    }
}
