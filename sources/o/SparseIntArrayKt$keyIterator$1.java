package o;

import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class SparseIntArrayKt$keyIterator$1 {
    public static final byte[] ag$a = {0, 0, 0, 1};
    public static final float[] valueOf = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object ah$a = new Object();
    private static int[] values = new int[10];

    /* loaded from: classes3.dex */
    public static final class values {
        public final boolean HaptikSDK$a;
        public final float HaptikSDK$b;
        public final int HaptikSDK$c;
        public final int[] ag$a;
        public final int ah$a;
        public final int ah$b;
        public final int invoke;
        public final int toString;
        public final int valueOf;
        public final int values;

        public values(int i, boolean z, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, float f) {
            this.ah$a = i;
            this.HaptikSDK$a = z;
            this.valueOf = i2;
            this.values = i3;
            this.ag$a = iArr;
            this.toString = i4;
            this.HaptikSDK$c = i5;
            this.ah$b = i6;
            this.invoke = i7;
            this.HaptikSDK$b = f;
        }
    }

    public static int values(byte[] bArr, int i) {
        int i2;
        synchronized (ah$a) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = ah$b(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = values;
                        if (iArr.length <= i4) {
                            values = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        values[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = values[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    public static void values(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean ag$a(String str, byte b2) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return MimeTypes.VIDEO_H265.equals(str) && ((b2 & 126) >> 1) == 39;
    }

    public static int ah$a(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int ag$a(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static SparseIntArrayKt$keyIterator$1$ah$a toString(byte[] bArr, int i, int i2) {
        return HaptikSDK$c(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.SparseIntArrayKt$keyIterator$1$ah$a HaptikSDK$c(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SparseIntArrayKt$keyIterator$1.HaptikSDK$c(byte[], int, int):o.SparseIntArrayKt$keyIterator$1$ah$a");
    }

    public static values valueOf(byte[] bArr, int i, int i2) {
        SparseIntArrayKt$valueIterator$1 sparseIntArrayKt$valueIterator$1 = new SparseIntArrayKt$valueIterator$1(bArr, i, i2);
        sparseIntArrayKt$valueIterator$1.ag$a(4);
        int values2 = sparseIntArrayKt$valueIterator$1.values(3);
        sparseIntArrayKt$valueIterator$1.invoke();
        int values3 = sparseIntArrayKt$valueIterator$1.values(2);
        boolean values4 = sparseIntArrayKt$valueIterator$1.values();
        int values5 = sparseIntArrayKt$valueIterator$1.values(5);
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            if (sparseIntArrayKt$valueIterator$1.values()) {
                i3 |= 1 << i4;
            }
        }
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = sparseIntArrayKt$valueIterator$1.values(8);
        }
        int values6 = sparseIntArrayKt$valueIterator$1.values(8);
        int i6 = 0;
        for (int i7 = 0; i7 < values2; i7++) {
            if (sparseIntArrayKt$valueIterator$1.values()) {
                i6 += 89;
            }
            if (sparseIntArrayKt$valueIterator$1.values()) {
                i6 += 8;
            }
        }
        sparseIntArrayKt$valueIterator$1.ag$a(i6);
        if (values2 > 0) {
            sparseIntArrayKt$valueIterator$1.ag$a((8 - values2) * 2);
        }
        int ag$a2 = sparseIntArrayKt$valueIterator$1.ag$a();
        int ag$a3 = sparseIntArrayKt$valueIterator$1.ag$a();
        if (ag$a3 == 3) {
            sparseIntArrayKt$valueIterator$1.invoke();
        }
        int ag$a4 = sparseIntArrayKt$valueIterator$1.ag$a();
        int ag$a5 = sparseIntArrayKt$valueIterator$1.ag$a();
        if (sparseIntArrayKt$valueIterator$1.values()) {
            int ag$a6 = sparseIntArrayKt$valueIterator$1.ag$a();
            int ag$a7 = sparseIntArrayKt$valueIterator$1.ag$a();
            int ag$a8 = sparseIntArrayKt$valueIterator$1.ag$a();
            int ag$a9 = sparseIntArrayKt$valueIterator$1.ag$a();
            ag$a4 -= ((ag$a3 == 1 || ag$a3 == 2) ? 2 : 1) * (ag$a6 + ag$a7);
            ag$a5 -= (ag$a3 == 1 ? 2 : 1) * (ag$a8 + ag$a9);
        }
        sparseIntArrayKt$valueIterator$1.ag$a();
        sparseIntArrayKt$valueIterator$1.ag$a();
        int ag$a10 = sparseIntArrayKt$valueIterator$1.ag$a();
        for (int i8 = sparseIntArrayKt$valueIterator$1.values() ? 0 : values2; i8 <= values2; i8++) {
            sparseIntArrayKt$valueIterator$1.ag$a();
            sparseIntArrayKt$valueIterator$1.ag$a();
            sparseIntArrayKt$valueIterator$1.ag$a();
        }
        sparseIntArrayKt$valueIterator$1.ag$a();
        sparseIntArrayKt$valueIterator$1.ag$a();
        sparseIntArrayKt$valueIterator$1.ag$a();
        sparseIntArrayKt$valueIterator$1.ag$a();
        sparseIntArrayKt$valueIterator$1.ag$a();
        sparseIntArrayKt$valueIterator$1.ag$a();
        if (sparseIntArrayKt$valueIterator$1.values() && sparseIntArrayKt$valueIterator$1.values()) {
            toString(sparseIntArrayKt$valueIterator$1);
        }
        sparseIntArrayKt$valueIterator$1.ag$a(2);
        if (sparseIntArrayKt$valueIterator$1.values()) {
            sparseIntArrayKt$valueIterator$1.ag$a(8);
            sparseIntArrayKt$valueIterator$1.ag$a();
            sparseIntArrayKt$valueIterator$1.ag$a();
            sparseIntArrayKt$valueIterator$1.invoke();
        }
        ag$a(sparseIntArrayKt$valueIterator$1);
        if (sparseIntArrayKt$valueIterator$1.values()) {
            for (int i9 = 0; i9 < sparseIntArrayKt$valueIterator$1.ag$a(); i9++) {
                sparseIntArrayKt$valueIterator$1.ag$a(ag$a10 + 4 + 1);
            }
        }
        sparseIntArrayKt$valueIterator$1.ag$a(2);
        float f = 1.0f;
        if (sparseIntArrayKt$valueIterator$1.values()) {
            if (sparseIntArrayKt$valueIterator$1.values()) {
                int values7 = sparseIntArrayKt$valueIterator$1.values(8);
                if (values7 == 255) {
                    int values8 = sparseIntArrayKt$valueIterator$1.values(16);
                    int values9 = sparseIntArrayKt$valueIterator$1.values(16);
                    if (values8 != 0 && values9 != 0) {
                        f = values8 / values9;
                    }
                } else {
                    float[] fArr = valueOf;
                    if (values7 < fArr.length) {
                        f = fArr[values7];
                    } else {
                        SupportMenuItem.toString("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + values7);
                    }
                }
            }
            if (sparseIntArrayKt$valueIterator$1.values()) {
                sparseIntArrayKt$valueIterator$1.invoke();
            }
            if (sparseIntArrayKt$valueIterator$1.values()) {
                sparseIntArrayKt$valueIterator$1.ag$a(4);
                if (sparseIntArrayKt$valueIterator$1.values()) {
                    sparseIntArrayKt$valueIterator$1.ag$a(24);
                }
            }
            if (sparseIntArrayKt$valueIterator$1.values()) {
                sparseIntArrayKt$valueIterator$1.ag$a();
                sparseIntArrayKt$valueIterator$1.ag$a();
            }
            sparseIntArrayKt$valueIterator$1.invoke();
            if (sparseIntArrayKt$valueIterator$1.values()) {
                ag$a5 *= 2;
            }
        }
        return new values(values3, values4, values5, i3, iArr, values6, ag$a2, ag$a4, ag$a5, f);
    }

    public static SparseIntArrayKt$keyIterator$1$ag$a values(byte[] bArr, int i, int i2) {
        return ah$a(bArr, i + 1, i2);
    }

    public static SparseIntArrayKt$keyIterator$1$ag$a ah$a(byte[] bArr, int i, int i2) {
        SparseIntArrayKt$valueIterator$1 sparseIntArrayKt$valueIterator$1 = new SparseIntArrayKt$valueIterator$1(bArr, i, i2);
        int ag$a2 = sparseIntArrayKt$valueIterator$1.ag$a();
        int ag$a3 = sparseIntArrayKt$valueIterator$1.ag$a();
        sparseIntArrayKt$valueIterator$1.invoke();
        return new SparseIntArrayKt$keyIterator$1$ag$a(ag$a2, ag$a3, sparseIntArrayKt$valueIterator$1.values());
    }

    public static int values(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        FingerprintManagerCompat.ah$a(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            ag$a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            ag$a(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            ag$a(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                if ((bArr[i5] & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                        ag$a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            zArr[2] = bArr[i4] == 0;
            return i2;
        }
    }

    public static void ag$a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static int ah$b(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static void valueOf(SparseIntArrayKt$valueIterator$1 sparseIntArrayKt$valueIterator$1, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((sparseIntArrayKt$valueIterator$1.ah$a() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    private static void toString(SparseIntArrayKt$valueIterator$1 sparseIntArrayKt$valueIterator$1) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!sparseIntArrayKt$valueIterator$1.values()) {
                    sparseIntArrayKt$valueIterator$1.ag$a();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        sparseIntArrayKt$valueIterator$1.ah$a();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        sparseIntArrayKt$valueIterator$1.ah$a();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void ag$a(SparseIntArrayKt$valueIterator$1 sparseIntArrayKt$valueIterator$1) {
        int ag$a2 = sparseIntArrayKt$valueIterator$1.ag$a();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ag$a2; i2++) {
            if (i2 != 0) {
                z = sparseIntArrayKt$valueIterator$1.values();
            }
            if (z) {
                sparseIntArrayKt$valueIterator$1.invoke();
                sparseIntArrayKt$valueIterator$1.ag$a();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (!sparseIntArrayKt$valueIterator$1.values()) {
                        sparseIntArrayKt$valueIterator$1.invoke();
                    }
                }
            } else {
                int ag$a3 = sparseIntArrayKt$valueIterator$1.ag$a();
                int ag$a4 = sparseIntArrayKt$valueIterator$1.ag$a();
                for (int i4 = 0; i4 < ag$a3; i4++) {
                    sparseIntArrayKt$valueIterator$1.ag$a();
                    sparseIntArrayKt$valueIterator$1.invoke();
                }
                for (int i5 = 0; i5 < ag$a4; i5++) {
                    sparseIntArrayKt$valueIterator$1.ag$a();
                    sparseIntArrayKt$valueIterator$1.invoke();
                }
                i = ag$a3 + ag$a4;
            }
        }
    }
}
