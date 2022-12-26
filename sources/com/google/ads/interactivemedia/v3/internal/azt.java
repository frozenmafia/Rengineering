package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes4.dex */
public final class azt {
    @Deprecated
    public static final azp a(byte[] bArr) throws GeneralSecurityException {
        try {
            bgr d = bgr.d(bArr, boy.a());
            for (bgq bgqVar : d.e()) {
                if (bgqVar.b().g() == bgl.a || bgqVar.b().g() == bgl.f826b || bgqVar.b().g() == bgl.c) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return azp.a(d);
        } catch (bpt unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
