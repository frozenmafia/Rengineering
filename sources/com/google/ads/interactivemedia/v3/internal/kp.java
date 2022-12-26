package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
/* loaded from: classes4.dex */
public final /* synthetic */ class kp implements Comparator {
    public static final /* synthetic */ kp a = new kp();

    private /* synthetic */ kp() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        lp lpVar = (lp) obj;
        lp lpVar2 = (lp) obj2;
        int i = lpVar.c;
        int i2 = lpVar2.c;
        int i3 = i == i2 ? 0 : i < i2 ? -1 : 1;
        return i3 != 0 ? i3 : lpVar.f1158b.compareTo(lpVar2.f1158b);
    }
}
