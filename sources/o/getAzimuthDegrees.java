package o;

import java.nio.charset.Charset;
/* loaded from: classes3.dex */
public final class getAzimuthDegrees {
    public byte[] ah$a;
    private int toString;
    private int valueOf;
    private int values;

    public getAzimuthDegrees() {
        this.ah$a = getElevationDegrees.values;
    }

    public getAzimuthDegrees(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public getAzimuthDegrees(byte[] bArr, int i) {
        this.ah$a = bArr;
        this.values = i;
    }

    public void values(byte[] bArr) {
        ag$a(bArr, bArr.length);
    }

    public void valueOf(C$default$setContentDescription c$default$setContentDescription) {
        ag$a(c$default$setContentDescription.ah$a(), c$default$setContentDescription.HaptikSDK$a());
        values(c$default$setContentDescription.valueOf() * 8);
    }

    public void ag$a(byte[] bArr, int i) {
        this.ah$a = bArr;
        this.valueOf = 0;
        this.toString = 0;
        this.values = i;
    }

    public int ah$a() {
        return ((this.values - this.valueOf) * 8) - this.toString;
    }

    public int ag$a() {
        return (this.valueOf * 8) + this.toString;
    }

    public int values() {
        FingerprintManagerCompat.ah$a(this.toString == 0);
        return this.valueOf;
    }

    public void values(int i) {
        int i2 = i / 8;
        this.valueOf = i2;
        this.toString = i - (i2 * 8);
        HaptikSDK$c();
    }

    public void HaptikSDK$b() {
        int i = this.toString + 1;
        this.toString = i;
        if (i == 8) {
            this.toString = 0;
            this.valueOf++;
        }
        HaptikSDK$c();
    }

    public void toString(int i) {
        int i2 = i / 8;
        int i3 = this.valueOf + i2;
        this.valueOf = i3;
        int i4 = this.toString + (i - (i2 * 8));
        this.toString = i4;
        if (i4 > 7) {
            this.valueOf = i3 + 1;
            this.toString = i4 - 8;
        }
        HaptikSDK$c();
    }

    public boolean HaptikSDK$a() {
        boolean z = (this.ah$a[this.valueOf] & (128 >> this.toString)) != 0;
        HaptikSDK$b();
        return z;
    }

    public int valueOf(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.toString += i;
        int i3 = 0;
        while (true) {
            i2 = this.toString;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.toString = i4;
            byte[] bArr = this.ah$a;
            int i5 = this.valueOf;
            this.valueOf = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.ah$a;
        int i6 = this.valueOf;
        byte b2 = bArr2[i6];
        if (i2 == 8) {
            this.toString = 0;
            this.valueOf = i6 + 1;
        }
        HaptikSDK$c();
        return ((-1) >>> (32 - i)) & (((b2 & 255) >> (8 - i2)) | i3);
    }

    public long ag$a(int i) {
        if (i <= 32) {
            return getElevationDegrees.ah$b(valueOf(i));
        }
        return getElevationDegrees.ah$a(valueOf(i - 32), valueOf(32));
    }

    public void ah$a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.ah$a;
            int i4 = this.valueOf;
            int i5 = i4 + 1;
            this.valueOf = i5;
            byte b2 = bArr2[i4];
            int i6 = this.toString;
            bArr[i] = (byte) (b2 << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
        int i8 = this.toString;
        if (i8 + i7 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.ah$a;
            int i10 = this.valueOf;
            this.valueOf = i10 + 1;
            bArr[i3] = (byte) (i9 | ((bArr3[i10] & 255) << i8));
            this.toString = i8 - 8;
        }
        int i11 = this.toString + i7;
        this.toString = i11;
        byte[] bArr4 = this.ah$a;
        int i12 = this.valueOf;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i3]);
        if (i11 == 8) {
            this.toString = 0;
            this.valueOf = i12 + 1;
        }
        HaptikSDK$c();
    }

    public void valueOf() {
        if (this.toString == 0) {
            return;
        }
        this.toString = 0;
        this.valueOf++;
        HaptikSDK$c();
    }

    public void toString(byte[] bArr, int i, int i2) {
        FingerprintManagerCompat.ah$a(this.toString == 0);
        System.arraycopy(this.ah$a, this.valueOf, bArr, i, i2);
        this.valueOf += i2;
        HaptikSDK$c();
    }

    public void ah$a(int i) {
        FingerprintManagerCompat.ah$a(this.toString == 0);
        this.valueOf += i;
        HaptikSDK$c();
    }

    public String toString(int i, Charset charset) {
        byte[] bArr = new byte[i];
        toString(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void toString(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.toString, i2);
        int i3 = this.toString;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.ah$a;
        int i5 = this.valueOf;
        bArr[i5] = (byte) (((androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.ah$a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.ah$a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        toString(i2);
        HaptikSDK$c();
    }

    private void HaptikSDK$c() {
        int i;
        int i2 = this.valueOf;
        FingerprintManagerCompat.ah$a(i2 >= 0 && (i2 < (i = this.values) || (i2 == i && this.toString == 0)));
    }
}
