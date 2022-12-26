package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier;
import o.__vector_len;
import o.setProgressBackgroundColor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowableWindowBoundarySupplier$ah$a<T, B> extends __vector_len<B> {
    final FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> toString;
    boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowableWindowBoundarySupplier$ah$a(FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
        this.toString = windowBoundaryMainSubscriber;
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(B b2) {
        if (this.values) {
            return;
        }
        this.values = true;
        dispose();
        this.toString.innerNext(this);
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (this.values) {
            setProgressBackgroundColor.values(th);
            return;
        }
        this.values = true;
        this.toString.innerError(th);
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        if (this.values) {
            return;
        }
        this.values = true;
        this.toString.innerComplete();
    }
}
