package o;
/* loaded from: classes5.dex */
public class getNotificationUris {
    /* JADX INFO: Access modifiers changed from: private */
    public static long ah$a(long j, long j2, int i, int i2) {
        return (j2 * (j ^ (j >> i))) + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] toString(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            jArr[i3] = ah$a(jArr[i3 - 1], 1812433253L, 30, i3);
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ag$a(long[] jArr, long[] jArr2, int i) {
        int i2 = (i + 2) % 4;
        int i3 = (i + 3) % 4;
        jArr2[i3] = ((jArr[i3] * 2147483085) + jArr2[i2]) / 2147483647L;
        jArr[i3] = ((jArr[i % 4] * 2147483085) + jArr2[i2]) % 2147483647L;
    }
}
