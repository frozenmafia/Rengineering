package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* loaded from: classes4.dex */
public final class ps implements qh {
    private final qh a;

    /* renamed from: b  reason: collision with root package name */
    private final List f1219b;

    public ps(qh qhVar, List list) {
        this.a = qhVar;
        this.f1219b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qh
    public final wz a() {
        return new rv(this.a.a(), this.f1219b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qh
    public final wz b(qc qcVar, pz pzVar) {
        return new rv(this.a.b(qcVar, pzVar), this.f1219b);
    }
}
