package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes4.dex */
final class awe extends awg {
    final /* synthetic */ Comparator a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awe(Comparator comparator) {
        this.a = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.awg
    public final Map a() {
        return new TreeMap(this.a);
    }
}
