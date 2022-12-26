package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Comparator;
/* loaded from: classes7.dex */
final class avr implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f739b;

    public avr(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.f739b = objArr;
    }

    Object readResolve() {
        avq avqVar = new avq(this.a);
        avqVar.i(this.f739b);
        return avqVar.h();
    }
}
