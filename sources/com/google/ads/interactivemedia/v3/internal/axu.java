package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes4.dex */
final class axu extends axt {
    final AtomicIntegerFieldUpdater a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public axu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.axt
    public final int a(axw axwVar) {
        return this.a.decrementAndGet(axwVar);
    }
}
