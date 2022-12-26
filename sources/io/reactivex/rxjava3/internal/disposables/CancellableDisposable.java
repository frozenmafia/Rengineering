package io.reactivex.rxjava3.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import o.FlatBufferBuilder;
import o.addInt;
import o.dataStart;
import o.endMetadataList;
/* loaded from: classes7.dex */
public final class CancellableDisposable extends AtomicReference<addInt> implements dataStart {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(addInt addint) {
        super(addint);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return get() == null;
    }

    @Override // o.dataStart
    public void dispose() {
        addInt andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.ag$a();
        } catch (Throwable th) {
            FlatBufferBuilder.ah$a(th);
            endMetadataList.valueOf(th);
        }
    }
}
