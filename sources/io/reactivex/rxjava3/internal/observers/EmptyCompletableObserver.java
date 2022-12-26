package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
/* loaded from: classes7.dex */
public final class EmptyCompletableObserver extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart {
    private static final long serialVersionUID = -7545121636549663526L;

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // o.dataStart
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        endMetadataList.valueOf(new OnErrorNotImplementedException(th));
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass3
    public void onSubscribe(dataStart datastart) {
        DisposableHelper.setOnce(this, datastart);
    }
}
