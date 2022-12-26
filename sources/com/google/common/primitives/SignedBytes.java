package com.google.common.primitives;

import java.util.Comparator;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class SignedBytes {
    public static int valueOf(byte b2, byte b3) {
        return b2 - b3;
    }

    public static byte valueOf(long j) {
        byte b2 = (byte) j;
        markViewHoldersUpdated.ag$a(((long) b2) == j, "Out of range: %s", j);
        return b2;
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i = 0; i < min; i++) {
                int valueOf = SignedBytes.valueOf(bArr[i], bArr2[i]);
                if (valueOf != 0) {
                    return valueOf;
                }
            }
            return bArr.length - bArr2.length;
        }
    }
}
