package io.reactivex.internal.operators.maybe;

import o.elevationSupported;
/* loaded from: classes7.dex */
interface MaybeMergeArray$ah$a<T> extends elevationSupported<T> {
    int consumerIndex();

    void drop();

    T peek();

    @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray$ah$a, o.elevationSupported
    T poll();

    int producerIndex();
}
