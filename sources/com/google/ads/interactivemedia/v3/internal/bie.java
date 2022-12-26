package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class bie {
    private final byte[] a;

    private bie(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static bie a(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new bie(bArr, bArr.length);
    }

    public final byte[] b() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bie) {
            return Arrays.equals(((bie) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String h = bic.h(this.a);
        return "Bytes(" + h + ")";
    }
}
