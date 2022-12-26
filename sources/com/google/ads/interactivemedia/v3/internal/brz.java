package com.google.ads.interactivemedia.v3.internal;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* loaded from: classes4.dex */
final class brz extends bsa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public brz(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(m(obj, j));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(l(obj, j));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final void e(Object obj, long j, boolean z) {
        if (bsb.f964b) {
            bsb.I(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            bsb.J(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final void f(Object obj, long j, byte b2) {
        if (bsb.f964b) {
            bsb.I(obj, j, b2);
        } else {
            bsb.J(obj, j, b2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final void g(Object obj, long j, double d) {
        q(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final void h(Object obj, long j, float f) {
        p(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsa
    public final boolean i(Object obj, long j) {
        if (bsb.f964b) {
            return bsb.x(obj, j);
        }
        return bsb.y(obj, j);
    }
}
