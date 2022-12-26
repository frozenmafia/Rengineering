package o;
/* loaded from: classes3.dex */
public final class SparseIntArrayKt$valueIterator$1 {
    private int ah$a;
    private byte[] toString;
    private int valueOf;
    private int values;

    public SparseIntArrayKt$valueIterator$1(byte[] bArr, int i, int i2) {
        ah$a(bArr, i, i2);
    }

    public void ah$a(byte[] bArr, int i, int i2) {
        this.toString = bArr;
        this.valueOf = i;
        this.values = i2;
        this.ah$a = 0;
        ah$b();
    }

    public void invoke() {
        int i = this.ah$a + 1;
        this.ah$a = i;
        if (i == 8) {
            this.ah$a = 0;
            int i2 = this.valueOf;
            this.valueOf = i2 + (ah$a(i2 + 1) ? 2 : 1);
        }
        ah$b();
    }

    public void ag$a(int i) {
        int i2 = this.valueOf;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.valueOf = i4;
        int i5 = this.ah$a + (i - (i3 * 8));
        this.ah$a = i5;
        if (i5 > 7) {
            this.valueOf = i4 + 1;
            this.ah$a = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.valueOf) {
                if (ah$a(i2)) {
                    this.valueOf++;
                    i2 += 2;
                }
            } else {
                ah$b();
                return;
            }
        }
    }

    public boolean valueOf(int i) {
        int i2 = this.valueOf;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.ah$a + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.values) {
                break;
            } else if (ah$a(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.values;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public boolean values() {
        boolean z = (this.toString[this.valueOf] & (128 >> this.ah$a)) != 0;
        invoke();
        return z;
    }

    public int values(int i) {
        int i2;
        this.ah$a += i;
        int i3 = 0;
        while (true) {
            i2 = this.ah$a;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.ah$a = i4;
            byte[] bArr = this.toString;
            int i5 = this.valueOf;
            i3 |= (bArr[i5] & 255) << i4;
            if (!ah$a(i5 + 1)) {
                r3 = 1;
            }
            this.valueOf = i5 + r3;
        }
        byte[] bArr2 = this.toString;
        int i6 = this.valueOf;
        byte b2 = bArr2[i6];
        if (i2 == 8) {
            this.ah$a = 0;
            this.valueOf = i6 + (ah$a(i6 + 1) ? 2 : 1);
        }
        ah$b();
        return ((-1) >>> (32 - i)) & (((b2 & 255) >> (8 - i2)) | i3);
    }

    public boolean valueOf() {
        int i = this.valueOf;
        int i2 = this.ah$a;
        int i3 = 0;
        while (this.valueOf < this.values && !values()) {
            i3++;
        }
        boolean z = this.valueOf == this.values;
        this.valueOf = i;
        this.ah$a = i2;
        return !z && valueOf((i3 * 2) + 1);
    }

    public int ag$a() {
        return HaptikSDK$a();
    }

    public int ah$a() {
        int HaptikSDK$a = HaptikSDK$a();
        return (HaptikSDK$a % 2 == 0 ? -1 : 1) * ((HaptikSDK$a + 1) / 2);
    }

    private int HaptikSDK$a() {
        int i = 0;
        while (!values()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? values(i) : 0);
    }

    private boolean ah$a(int i) {
        if (2 <= i && i < this.values) {
            byte[] bArr = this.toString;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    private void ah$b() {
        int i;
        int i2 = this.valueOf;
        FingerprintManagerCompat.ah$a(i2 >= 0 && (i2 < (i = this.values) || (i2 == i && this.ah$a == 0)));
    }
}
