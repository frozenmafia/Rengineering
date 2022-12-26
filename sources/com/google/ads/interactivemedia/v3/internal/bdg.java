package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
final class bdg {
    private bdg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        bie.a(bArr);
        bie.a(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bdg a(byte[] bArr) throws GeneralSecurityException {
        return new bdg(bArr, bic.c(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bdg b(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        bic.n(bic.s(i, 1, bArr2), bic.r(i, bArr));
        return new bdg(bArr, bArr2, null);
    }

    private bdg(byte[] bArr, byte[] bArr2) {
        bie.a(bArr);
        bie.a(bArr2);
    }
}
