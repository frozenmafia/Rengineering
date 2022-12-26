package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class bnb extends bjv {
    @Override // com.google.ads.interactivemedia.v3.internal.bjv
    public final void a(bnc bncVar) throws IOException {
        if (bncVar instanceof bkx) {
            ((bkx) bncVar).n();
            return;
        }
        int i = bncVar.a;
        if (i == 0) {
            i = bncVar.s();
        }
        if (i == 13) {
            bncVar.a = 9;
        } else if (i == 12) {
            bncVar.a = 8;
        } else if (i == 14) {
            bncVar.a = 10;
        } else {
            throw new IllegalStateException("Expected a name but was " + ((Object) bnd.a(bncVar.r())) + bncVar.t());
        }
    }
}
