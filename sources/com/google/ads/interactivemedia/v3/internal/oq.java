package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.List;
/* loaded from: classes4.dex */
final class oq extends vh {
    private int d;

    public oq(bf bfVar, int[] iArr) {
        super(bfVar, iArr);
        this.d = m(bfVar.b(iArr[0]));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final int a() {
        return this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final int b() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j, long j2, List list, vb[] vbVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (s(this.d, elapsedRealtime)) {
            int i = this.f1312b;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (s(i, elapsedRealtime));
            this.d = i;
        }
    }
}
