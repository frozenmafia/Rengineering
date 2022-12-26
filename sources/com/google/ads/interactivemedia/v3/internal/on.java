package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class on extends ux {
    private byte[] a;

    public on(cx cxVar, db dbVar, s sVar, int i, byte[] bArr) {
        super(cxVar, dbVar, sVar, i, bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ux
    protected final void a(byte[] bArr, int i) {
        this.a = Arrays.copyOf(bArr, i);
    }

    public final byte[] b() {
        return this.a;
    }
}
