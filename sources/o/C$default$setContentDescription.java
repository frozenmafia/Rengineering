package o;

import java.nio.charset.Charset;
import java.util.Arrays;
/* renamed from: o.$default$setContentDescription  reason: invalid class name */
/* loaded from: classes3.dex */
public final class C$default$setContentDescription {
    private int ag$a;
    private byte[] valueOf;
    private int values;

    public C$default$setContentDescription() {
        this.valueOf = getElevationDegrees.values;
    }

    public C$default$setContentDescription(int i) {
        this.valueOf = new byte[i];
        this.ag$a = i;
    }

    public C$default$setContentDescription(byte[] bArr) {
        this.valueOf = bArr;
        this.ag$a = bArr.length;
    }

    public C$default$setContentDescription(byte[] bArr, int i) {
        this.valueOf = bArr;
        this.ag$a = i;
    }

    public void valueOf(int i) {
        toString(values() < i ? new byte[i] : this.valueOf, i);
    }

    public void valueOf(byte[] bArr) {
        toString(bArr, bArr.length);
    }

    public void toString(byte[] bArr, int i) {
        this.valueOf = bArr;
        this.ag$a = i;
        this.values = 0;
    }

    public void toString(int i) {
        if (i > values()) {
            this.valueOf = Arrays.copyOf(this.valueOf, i);
        }
    }

    public int ag$a() {
        return this.ag$a - this.values;
    }

    public int HaptikSDK$a() {
        return this.ag$a;
    }

    public void values(int i) {
        FingerprintManagerCompat.toString(i >= 0 && i <= this.valueOf.length);
        this.ag$a = i;
    }

    public int valueOf() {
        return this.values;
    }

    public void HaptikSDK$b(int i) {
        FingerprintManagerCompat.toString(i >= 0 && i <= this.ag$a);
        this.values = i;
    }

    public byte[] ah$a() {
        return this.valueOf;
    }

    public int values() {
        return this.valueOf.length;
    }

    public void HaptikSDK$a(int i) {
        HaptikSDK$b(this.values + i);
    }

    public void values(getAzimuthDegrees getazimuthdegrees, int i) {
        valueOf(getazimuthdegrees.ah$a, 0, i);
        getazimuthdegrees.values(0);
    }

    public void valueOf(byte[] bArr, int i, int i2) {
        System.arraycopy(this.valueOf, this.values, bArr, i, i2);
        this.values += i2;
    }

    public int ah$b() {
        return this.valueOf[this.values] & 255;
    }

    public char invoke() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int extraCallbackWithResult() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        this.values = i + 1;
        return bArr[i] & 255;
    }

    public int ICustomTabsCallback$Default() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        this.values = i2 + 1;
        return (bArr[i2] & 255) | ((b2 & 255) << 8);
    }

    public int aj$a() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        this.values = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b2 & 255);
    }

    public short ak$a() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        this.values = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b2 & 255) << 8));
    }

    public short ak() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        this.values = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (b2 & 255));
    }

    public int onRelationshipValidationResult() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        byte b3 = bArr[i2];
        this.values = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public int getInitSettings() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        byte b3 = bArr[i2];
        this.values = i3 + 1;
        return (bArr[i3] & 255) | (((b2 & 255) << 24) >> 8) | ((b3 & 255) << 8);
    }

    public long onPostMessage() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.values = i4;
        long j3 = bArr[i3];
        this.values = i4 + 1;
        return (bArr[i4] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public long onXdkEvent() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.values = i4;
        long j3 = bArr[i3];
        this.values = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public int getSignupData() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.values = i4;
        byte b4 = bArr[i3];
        this.values = i4 + 1;
        return (bArr[i4] & 255) | ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
    }

    public int HaptikSDK$d() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.values = i4;
        byte b4 = bArr[i3];
        this.values = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b2 & 255) | ((b3 & 255) << 8) | ((b4 & 255) << 16);
    }

    public long isLogoutPending() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.values = i4;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        this.values = i5;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        this.values = i6;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        this.values = i7;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        this.values = i8;
        this.values = i8 + 1;
        return (255 & bArr[i8]) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    public long HaptikSDK$e() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        long j = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        this.values = i4;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        this.values = i5;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        this.values = i6;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        this.values = i7;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        this.values = i8;
        this.values = i8 + 1;
        return ((255 & bArr[i8]) << 56) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((bArr[i7] & 255) << 48);
    }

    public int ak$b() {
        byte[] bArr = this.valueOf;
        int i = this.values;
        int i2 = i + 1;
        this.values = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.values = i3;
        byte b3 = bArr[i2];
        this.values = i3 + 2;
        return (b3 & 255) | ((b2 & 255) << 8);
    }

    public int ICustomTabsCallback() {
        return (extraCallbackWithResult() << 21) | (extraCallbackWithResult() << 14) | (extraCallbackWithResult() << 7) | extraCallbackWithResult();
    }

    public int onNavigationEvent() {
        int signupData = getSignupData();
        if (signupData >= 0) {
            return signupData;
        }
        throw new IllegalStateException("Top bit not zero: " + signupData);
    }

    public int a() {
        int HaptikSDK$d = HaptikSDK$d();
        if (HaptikSDK$d >= 0) {
            return HaptikSDK$d;
        }
        throw new IllegalStateException("Top bit not zero: " + HaptikSDK$d);
    }

    public long onMessageChannelReady() {
        long isLogoutPending = isLogoutPending();
        if (isLogoutPending >= 0) {
            return isLogoutPending;
        }
        throw new IllegalStateException("Top bit not zero: " + isLogoutPending);
    }

    public float HaptikSDK$c() {
        return Float.intBitsToFloat(getSignupData());
    }

    public double HaptikSDK$b() {
        return Double.longBitsToDouble(isLogoutPending());
    }

    public String ag$a(int i) {
        return ag$a(i, addUpdateOp.HaptikSDK$a);
    }

    public String ag$a(int i, Charset charset) {
        String str = new String(this.valueOf, this.values, i, charset);
        this.values += i;
        return str;
    }

    public String ah$a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.values;
        int i3 = (i2 + i) - 1;
        String ag$a = getElevationDegrees.ag$a(this.valueOf, i2, (i3 >= this.ag$a || this.valueOf[i3] != 0) ? i : i - 1);
        this.values += i;
        return ag$a;
    }

    public String extraCallback() {
        return toString((char) 0);
    }

    public String toString(char c) {
        if (ag$a() == 0) {
            return null;
        }
        int i = this.values;
        while (i < this.ag$a && this.valueOf[i] != c) {
            i++;
        }
        byte[] bArr = this.valueOf;
        int i2 = this.values;
        String ag$a = getElevationDegrees.ag$a(bArr, i2, i - i2);
        this.values = i;
        if (i < this.ag$a) {
            this.values = i + 1;
        }
        return ag$a;
    }

    public String HaptikWebView() {
        if (ag$a() == 0) {
            return null;
        }
        int i = this.values;
        while (i < this.ag$a && !getElevationDegrees.HaptikSDK$a(this.valueOf[i])) {
            i++;
        }
        int i2 = this.values;
        if (i - i2 >= 3) {
            byte[] bArr = this.valueOf;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.values = i2 + 3;
            }
        }
        byte[] bArr2 = this.valueOf;
        int i3 = this.values;
        String ag$a = getElevationDegrees.ag$a(bArr2, i3, i - i3);
        this.values = i;
        int i4 = this.ag$a;
        if (i == i4) {
            return ag$a;
        }
        byte[] bArr3 = this.valueOf;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.values = i5;
            if (i5 == i4) {
                return ag$a;
            }
        }
        int i6 = this.values;
        if (bArr3[i6] == 10) {
            this.values = i6 + 1;
        }
        return ag$a;
    }

    public long setDefaultImpl() {
        int i;
        int i2;
        byte b2;
        int i3;
        long j = this.valueOf[this.values];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.valueOf[this.values + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (b2 & 63);
        }
        this.values += i2;
        return j;
    }
}
