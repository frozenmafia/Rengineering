package com.google.ads.interactivemedia.v3.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
/* loaded from: classes4.dex */
final class aex extends aey {
    private final byte[] a;

    public aex(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aey, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.a;
    }
}
