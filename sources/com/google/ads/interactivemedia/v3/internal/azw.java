package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class azw implements Comparable {
    private final byte[] a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        azw azwVar = (azw) obj;
        int length = this.a.length;
        int length2 = azwVar.a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i];
            byte b3 = azwVar.a[i];
            if (b2 != b3) {
                return b2 - b3;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azw) {
            return Arrays.equals(this.a, ((azw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return bic.h(this.a);
    }
}
