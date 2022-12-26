package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableWindowTimed;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowableWindowTimed$WindowSkipSubscriber$ah$a implements Runnable {
    final boolean ah$a;
    final FlowableWindowTimed.WindowSkipSubscriber<?> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowableWindowTimed$WindowSkipSubscriber$ah$a(FlowableWindowTimed.WindowSkipSubscriber<?> windowSkipSubscriber, boolean z) {
        this.toString = windowSkipSubscriber;
        this.ah$a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.toString.boundary(this.ah$a);
    }
}
