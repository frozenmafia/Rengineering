package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* loaded from: classes4.dex */
final class op extends ul {

    /* renamed from: b  reason: collision with root package name */
    private final List f1198b;
    private final long c;

    public op(long j, List list) {
        super(0L, list.size() - 1);
        this.c = j;
        this.f1198b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vb
    public final long a() {
        d();
        px pxVar = (px) this.f1198b.get((int) c());
        return this.c + pxVar.g + pxVar.e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vb
    public final long b() {
        d();
        return this.c + ((px) this.f1198b.get((int) c())).g;
    }
}
