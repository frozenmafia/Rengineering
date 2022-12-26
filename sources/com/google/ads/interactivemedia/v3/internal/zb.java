package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes4.dex */
public final class zb implements zz {
    private final byte[] a = new byte[4096];

    @Override // com.google.ads.interactivemedia.v3.internal.zz
    public final /* synthetic */ int a(k kVar, int i, boolean z) {
        return fy.h(this, kVar, i, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zz
    public final void b(s sVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zz
    public final /* synthetic */ void e(ci ciVar, int i) {
        fy.i(this, ciVar, i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zz
    public final void f(long j, int i, int i2, int i3, zy zyVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zz
    public final int h(k kVar, int i, boolean z) throws IOException {
        int a = kVar.a(this.a, 0, Math.min(4096, i));
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zz
    public final void i(ci ciVar, int i) {
        ciVar.G(i);
    }
}
