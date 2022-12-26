package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class deactivate extends FilterInputStream {
    private static final short ag$a = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private int HaptikSDK$a;
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private int HaptikSDK$d;
    private int HaptikSDK$e;
    private int HaptikWebView;
    private byte[] ah$a;
    private int ah$b;
    private int invoke;
    private byte[] toString;
    private byte[] valueOf;
    private int values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public deactivate(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.invoke = Integer.MAX_VALUE;
        this.valueOf = new byte[8];
        this.ah$a = new byte[8];
        this.toString = new byte[8];
        this.values = 8;
        this.HaptikSDK$b = 8;
        this.HaptikSDK$a = Math.min(Math.max(i2, 5), 16);
        this.ah$b = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.ah$a, 0, 8);
        }
        ah$a((iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32), i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        valueOf();
        int i = this.values;
        if (i >= this.HaptikSDK$b) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.values = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.values;
            if (i5 >= this.HaptikSDK$b) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.valueOf;
            this.values = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        valueOf();
        return this.HaptikSDK$b - this.values;
    }

    private void ah$a(long j, int i) {
        if (i == 0) {
            ag$a(j);
            return;
        }
        int i2 = (int) j;
        this.HaptikSDK$c = i2;
        this.HaptikSDK$d = i2 * i;
        this.HaptikSDK$e = i ^ i2;
        this.HaptikWebView = (int) (j >> 32);
    }

    private void ag$a(long j) {
        this.HaptikSDK$c = (int) j;
        long j2 = j >> 3;
        short s = ag$a;
        this.HaptikSDK$d = (int) ((s * j2) >> 32);
        this.HaptikSDK$e = (int) (j >> 32);
        this.HaptikWebView = (int) (j2 + s);
    }

    private void ag$a() {
        if (this.ah$b == 3) {
            byte[] bArr = this.valueOf;
            System.arraycopy(bArr, 0, this.toString, 0, bArr.length);
        }
        byte[] bArr2 = this.valueOf;
        int i = ((bArr2[0] << 24) & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.HaptikSDK$a;
            if (i3 >= i4) {
                break;
            }
            short s = ag$a;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.HaptikSDK$e)) ^ ((i >>> 5) + this.HaptikWebView);
            i -= (((i2 << 4) + this.HaptikSDK$c) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.HaptikSDK$d);
            i3++;
        }
        byte[] bArr3 = this.valueOf;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.ah$b == 3) {
            ah$a();
            byte[] bArr4 = this.toString;
            System.arraycopy(bArr4, 0, this.ah$a, 0, bArr4.length);
        }
    }

    private void ah$a() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.valueOf;
            bArr[i] = (byte) (bArr[i] ^ this.ah$a[i]);
        }
    }

    private int valueOf() throws IOException {
        if (this.invoke == Integer.MAX_VALUE) {
            this.invoke = ((FilterInputStream) this).in.read();
        }
        if (this.values == 8) {
            byte[] bArr = this.valueOf;
            int i = this.invoke;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.valueOf, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            ag$a();
            int read2 = ((FilterInputStream) this).in.read();
            this.invoke = read2;
            this.values = 0;
            this.HaptikSDK$b = read2 < 0 ? 8 - (this.valueOf[7] & 255) : 8;
        }
        return this.HaptikSDK$b;
    }
}
