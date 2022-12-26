package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* loaded from: classes4.dex */
public final class mc extends mb {
    final List e;

    public mc(lx lxVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(lxVar, j, j2, j3, j4, list, j5, j6, j7);
        this.e = list2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mb
    public final long c(long j) {
        return this.e.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mb
    public final lx g(ma maVar, long j) {
        return (lx) this.e.get((int) (j - this.a));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mb
    public final boolean h() {
        return true;
    }
}
