package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.BitSet;
/* loaded from: classes4.dex */
final class bmd extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        BitSet bitSet = new BitSet();
        bncVar.i();
        int r = bncVar.r();
        int i = 0;
        while (r != 2) {
            int i2 = r - 1;
            if (i2 == 5 || i2 == 6) {
                int b2 = bncVar.b();
                if (b2 != 0) {
                    if (b2 != 1) {
                        throw new biz("Invalid bitset value " + b2 + ", expected 0 or 1; at path " + bncVar.f());
                    }
                    bitSet.set(i);
                    i++;
                    r = bncVar.r();
                } else {
                    continue;
                    i++;
                    r = bncVar.r();
                }
            } else if (i2 == 7) {
                if (!bncVar.q()) {
                    i++;
                    r = bncVar.r();
                }
                bitSet.set(i);
                i++;
                r = bncVar.r();
            } else {
                throw new biz("Invalid bitset value type: " + ((Object) bnd.a(r)) + "; at path " + bncVar.e());
            }
        }
        bncVar.k();
        return bitSet;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bneVar.b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            bneVar.h(bitSet.get(i) ? 1L : 0L);
        }
        bneVar.d();
    }
}
