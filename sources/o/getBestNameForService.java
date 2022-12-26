package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import o.updateBounds;
/* loaded from: classes3.dex */
public final class getBestNameForService implements getExitDir {
    private final long HaptikSDK$b;
    private int ag$a;
    private int ah$a;
    private long toString;
    private final unwrapCryptoObject valueOf;
    private byte[] values = new byte[65536];
    private final byte[] ah$b = new byte[4096];

    static {
        updateBounds.Cdefault.valueOf("goog.exo.extractor");
    }

    public getBestNameForService(unwrapCryptoObject unwrapcryptoobject, long j, long j2) {
        this.valueOf = unwrapcryptoobject;
        this.toString = j;
        this.HaptikSDK$b = j2;
    }

    @Override // o.getExitDir, o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws IOException {
        int getbestnameforservice = toString(bArr, i, i2);
        if (getbestnameforservice == 0) {
            getbestnameforservice = valueOf(bArr, i, i2, 0, true);
        }
        toString(getbestnameforservice);
        return getbestnameforservice;
    }

    @Override // o.getExitDir
    public boolean toString(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int getbestnameforservice = toString(bArr, i, i2);
        while (getbestnameforservice < i2 && getbestnameforservice != -1) {
            getbestnameforservice = valueOf(bArr, i, i2, getbestnameforservice, z);
        }
        toString(getbestnameforservice);
        return getbestnameforservice != -1;
    }

    @Override // o.getExitDir
    public void ah$a(byte[] bArr, int i, int i2) throws IOException {
        toString(bArr, i, i2, false);
    }

    @Override // o.getExitDir
    public int ag$a(int i) throws IOException {
        int HaptikSDK$b = HaptikSDK$b(i);
        if (HaptikSDK$b == 0) {
            byte[] bArr = this.ah$b;
            HaptikSDK$b = valueOf(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        toString(HaptikSDK$b);
        return HaptikSDK$b;
    }

    public boolean valueOf(int i, boolean z) throws IOException {
        int HaptikSDK$b = HaptikSDK$b(i);
        while (HaptikSDK$b < i && HaptikSDK$b != -1) {
            HaptikSDK$b = valueOf(this.ah$b, -HaptikSDK$b, Math.min(i, this.ah$b.length + HaptikSDK$b), HaptikSDK$b, z);
        }
        toString(HaptikSDK$b);
        return HaptikSDK$b != -1;
    }

    @Override // o.getExitDir
    public void values(int i) throws IOException {
        valueOf(i, false);
    }

    @Override // o.getExitDir
    public int valueOf(byte[] bArr, int i, int i2) throws IOException {
        int min;
        valueOf(i2);
        int i3 = this.ag$a;
        int i4 = this.ah$a;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = valueOf(this.values, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.ag$a += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.values, this.ah$a, bArr, i, min);
        this.ah$a += min;
        return min;
    }

    @Override // o.getExitDir
    public boolean values(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (values(i2, z)) {
            System.arraycopy(this.values, this.ah$a - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // o.getExitDir
    public void ag$a(byte[] bArr, int i, int i2) throws IOException {
        values(bArr, i, i2, false);
    }

    @Override // o.getExitDir
    public boolean values(int i, boolean z) throws IOException {
        valueOf(i);
        int i2 = this.ag$a - this.ah$a;
        while (i2 < i) {
            i2 = valueOf(this.values, this.ah$a, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.ag$a = this.ah$a + i2;
        }
        this.ah$a += i;
        return true;
    }

    @Override // o.getExitDir
    public void ah$a(int i) throws IOException {
        values(i, false);
    }

    @Override // o.getExitDir
    public void valueOf() {
        this.ah$a = 0;
    }

    @Override // o.getExitDir
    public long ag$a() {
        return this.toString + this.ah$a;
    }

    @Override // o.getExitDir
    public long values() {
        return this.toString;
    }

    @Override // o.getExitDir
    public long ah$a() {
        return this.HaptikSDK$b;
    }

    private void valueOf(int i) {
        int i2 = this.ah$a + i;
        byte[] bArr = this.values;
        if (i2 > bArr.length) {
            this.values = Arrays.copyOf(this.values, getElevationDegrees.ah$a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int HaptikSDK$b(int i) {
        int min = Math.min(this.ag$a, i);
        HaptikSDK$a(min);
        return min;
    }

    private int toString(byte[] bArr, int i, int i2) {
        int i3 = this.ag$a;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.values, 0, bArr, i, min);
        HaptikSDK$a(min);
        return min;
    }

    private void HaptikSDK$a(int i) {
        int i2 = this.ag$a - i;
        this.ag$a = i2;
        this.ah$a = 0;
        byte[] bArr = this.values;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.values = bArr2;
    }

    private int valueOf(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int values = this.valueOf.values(bArr, i + i3, i2 - i3);
        if (values == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + values;
    }

    private void toString(int i) {
        if (i != -1) {
            this.toString += i;
        }
    }
}
