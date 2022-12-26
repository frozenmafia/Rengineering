package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bde implements bcv {
    private final bcq a;

    /* renamed from: b  reason: collision with root package name */
    private final int f802b;

    private bde(bcq bcqVar, int i) {
        this.a = bcqVar;
        this.f802b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bde c(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                return new bde(new bcq("HmacSha512"), 3);
            }
            return new bde(new bcq("HmacSha384"), 2);
        }
        return new bde(new bcq("HmacSha256"), 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcv
    public final bcw a(byte[] bArr) throws GeneralSecurityException {
        KeyPair q = bic.q(this.f802b);
        byte[] p = bic.p((ECPrivateKey) q.getPrivate(), bic.s(this.f802b, 1, bArr));
        byte[] v = bic.v(bic.u(this.f802b).getCurve(), 1, ((ECPublicKey) q.getPublic()).getW());
        byte[] y = bic.y(v, bArr);
        byte[] d = bdd.d(b());
        bcq bcqVar = this.a;
        return new bcw(bcqVar.e(p, y, d, bcqVar.a()), v);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcv
    public final byte[] b() throws GeneralSecurityException {
        int i = this.f802b - 1;
        if (i != 0) {
            return i != 1 ? bdd.e : bdd.d;
        }
        return bdd.c;
    }
}
