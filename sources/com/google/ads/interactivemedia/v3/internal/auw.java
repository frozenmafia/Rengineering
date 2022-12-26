package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* loaded from: classes4.dex */
final class auw extends atx implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;

    /* renamed from: b  reason: collision with root package name */
    final Object f732b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auw(Object obj, Object obj2) {
        this.a = obj;
        this.f732b = obj2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object getValue() {
        return this.f732b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
