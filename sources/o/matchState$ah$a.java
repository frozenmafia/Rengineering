package o;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class matchState$ah$a {
    private static final byte[] toString = {0, 0, 1};
    public int ag$a;
    private boolean ah$a;
    public int valueOf;
    public byte[] values;

    public matchState$ah$a(int i) {
        this.values = new byte[i];
    }

    public void values() {
        this.ah$a = false;
        this.ag$a = 0;
        this.valueOf = 0;
    }

    public boolean values(int i, int i2) {
        if (this.ah$a) {
            int i3 = this.ag$a - i2;
            this.ag$a = i3;
            if (this.valueOf == 0 && i == 181) {
                this.valueOf = i3;
            } else {
                this.ah$a = false;
                return true;
            }
        } else if (i == 179) {
            this.ah$a = true;
        }
        byte[] bArr = toString;
        toString(bArr, 0, bArr.length);
        return false;
    }

    public void toString(byte[] bArr, int i, int i2) {
        if (this.ah$a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.values;
            int length = bArr2.length;
            int i4 = this.ag$a + i3;
            if (length < i4) {
                this.values = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.values, this.ag$a, i3);
            this.ag$a += i3;
        }
    }
}
