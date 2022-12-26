package o;

import java.io.IOException;
/* loaded from: classes3.dex */
final class getBreakStrategy {
    private static final long[] values = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] ag$a = new byte[8];
    private int toString;
    private int valueOf;

    public void values() {
        this.toString = 0;
        this.valueOf = 0;
    }

    public long ah$a(getExitDir getexitdir, boolean z, boolean z2, int i) throws IOException {
        if (this.toString == 0) {
            if (!getexitdir.toString(this.ag$a, 0, 1, z)) {
                return -1L;
            }
            int ag$a = ag$a(this.ag$a[0] & 255);
            this.valueOf = ag$a;
            if (ag$a == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.toString = 1;
        }
        int i2 = this.valueOf;
        if (i2 > i) {
            this.toString = 0;
            return -2L;
        }
        if (i2 != 1) {
            getexitdir.ah$a(this.ag$a, 1, i2 - 1);
        }
        this.toString = 0;
        return valueOf(this.ag$a, this.valueOf, z2);
    }

    public int valueOf() {
        return this.valueOf;
    }

    public static int ag$a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = values;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & i) > 0L ? 1 : ((jArr[i3] & i) == 0L ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public static long valueOf(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~values[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
