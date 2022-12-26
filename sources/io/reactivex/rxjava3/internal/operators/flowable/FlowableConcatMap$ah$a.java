package io.reactivex.rxjava3.internal.operators.flowable;

import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
final class FlowableConcatMap$ah$a<T> implements getSidecarVersion {
    final registerConfigurationChangeListener<? super T> ag$a;
    final T ah$a;
    boolean values;

    @Override // o.getSidecarVersion
    public void cancel() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowableConcatMap$ah$a(T t, registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.ah$a = t;
        this.ag$a = registerconfigurationchangelistener;
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        if (j <= 0 || this.values) {
            return;
        }
        this.values = true;
        registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.ag$a;
        registerconfigurationchangelistener.onNext((T) this.ah$a);
        registerconfigurationchangelistener.onComplete();
    }
}
