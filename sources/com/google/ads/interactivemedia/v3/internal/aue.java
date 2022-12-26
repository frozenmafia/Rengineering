package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
/* loaded from: classes4.dex */
final class aue extends aug {
    static final aug f(int i) {
        aug augVar;
        aug augVar2;
        aug augVar3;
        if (i < 0) {
            augVar3 = aug.f723b;
            return augVar3;
        } else if (i > 0) {
            augVar2 = aug.c;
            return augVar2;
        } else {
            augVar = aug.a;
            return augVar;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aug
    public final int a() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aug
    public final aug b(int i, int i2) {
        return f(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aug
    public final aug c(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aug
    public final aug d(boolean z, boolean z2) {
        return f(axl.d(z, z2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aug
    public final aug e(boolean z, boolean z2) {
        return f(axl.d(z2, z));
    }
}
