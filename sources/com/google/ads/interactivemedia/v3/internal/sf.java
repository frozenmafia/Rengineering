package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class sf implements ud {
    protected final ud[] a;

    public sf(ud[] udVarArr) {
        this.a = udVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ud
    public final long bm() {
        long j = Long.MAX_VALUE;
        for (ud udVar : this.a) {
            long bm = udVar.bm();
            if (bm != Long.MIN_VALUE) {
                j = Math.min(j, bm);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ud
    public final long c() {
        long j = Long.MAX_VALUE;
        for (ud udVar : this.a) {
            long c = udVar.c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ud
    public final void l(long j) {
        for (ud udVar : this.a) {
            udVar.l(j);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ud
    public final boolean o(long j) {
        ud[] udVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long c = c();
            if (c == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (ud udVar : this.a) {
                long c2 = udVar.c();
                boolean z3 = c2 != Long.MIN_VALUE && c2 <= j;
                if (c2 == c || z3) {
                    z |= udVar.o(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ud
    public final boolean p() {
        for (ud udVar : this.a) {
            if (udVar.p()) {
                return true;
            }
        }
        return false;
    }
}
