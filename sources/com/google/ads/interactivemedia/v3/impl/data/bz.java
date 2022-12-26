package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.bjf;
import com.google.ads.interactivemedia.v3.internal.bnc;
import com.google.ads.interactivemedia.v3.internal.bne;
import java.io.IOException;
/* loaded from: classes4.dex */
final class bz extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public ca read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        return new ca(bncVar.h());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public void write(bne bneVar, ca caVar) throws IOException {
        if (caVar == null) {
            bneVar.g();
        } else {
            bneVar.k(caVar.getName());
        }
    }
}
