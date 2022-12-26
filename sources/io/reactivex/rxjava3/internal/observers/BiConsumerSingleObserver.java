package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FlatBufferBuilder;
import o.IdlingResource;
import o.addDouble;
import o.dataStart;
import o.endMetadataList;
/* loaded from: classes7.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<dataStart> implements IdlingResource.ResourceCallback<T>, dataStart {
    private static final long serialVersionUID = 4943102778943297569L;
    final addDouble<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(addDouble<? super T, ? super Throwable> adddouble) {
        this.onCallback = adddouble;
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.toString(null, th);
        } catch (Throwable th2) {
            FlatBufferBuilder.ah$a(th2);
            endMetadataList.valueOf(new CompositeException(th, th2));
        }
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onSubscribe(dataStart datastart) {
        DisposableHelper.setOnce(this, datastart);
    }

    @Override // o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.toString(t, null);
        } catch (Throwable th) {
            FlatBufferBuilder.ah$a(th);
            endMetadataList.valueOf(th);
        }
    }

    @Override // o.dataStart
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
