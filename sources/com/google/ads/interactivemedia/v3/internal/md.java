package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
/* loaded from: classes4.dex */
public final class md extends mb {
    final mj e;
    final mj f;
    final long g;

    public md(lx lxVar, long j, long j2, long j3, long j4, long j5, List list, long j6, mj mjVar, mj mjVar2, long j7, long j8) {
        super(lxVar, j, j2, j3, j5, list, j6, j7, j8);
        this.e = mjVar;
        this.f = mjVar2;
        this.g = j4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mb
    public final long c(long j) {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        long j2 = this.g;
        if (j2 != -1) {
            return (j2 - this.a) + 1;
        }
        if (j != C.TIME_UNSET) {
            return axg.a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.i)), BigInteger.valueOf(this.f1168b).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
        }
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mb
    public final lx g(ma maVar, long j) {
        List list = this.c;
        long j2 = list != null ? ((me) list.get((int) (j - this.a))).a : (j - this.a) * this.f1168b;
        mj mjVar = this.f;
        s sVar = maVar.f1167b;
        return new lx(mjVar.b(sVar.a, j, sVar.h, j2), 0L, -1L);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final lx i(ma maVar) {
        mj mjVar = this.e;
        if (mjVar != null) {
            s sVar = maVar.f1167b;
            return new lx(mjVar.b(sVar.a, 0L, sVar.h, 0L), 0L, -1L);
        }
        return this.h;
    }
}
