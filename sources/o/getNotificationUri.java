package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class getNotificationUri extends FilterInputStream {
    private final int[] HaptikSDK$a;
    private final int[] HaptikSDK$b;
    private final int HaptikSDK$c;
    private final byte[] HaptikSDK$d;
    private int HaptikWebView;
    private final byte[] ah$b;
    private int getInitSettings;
    private int getSignupData;
    private final byte[][] invoke;
    private static final byte[] valueOf = copyStringToBuffer.toString;
    private static final int[] values = copyStringToBuffer.ah$a;
    private static final int[] ag$a = copyStringToBuffer.values;
    private static final int[] ah$a = copyStringToBuffer.valueOf;
    private static final int[] toString = copyStringToBuffer.HaptikSDK$b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public getNotificationUri(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.HaptikSDK$b = new int[4];
        this.ah$b = new byte[16];
        this.HaptikSDK$d = new byte[16];
        this.getInitSettings = Integer.MAX_VALUE;
        this.HaptikWebView = 16;
        this.getSignupData = 16;
        this.HaptikSDK$c = i;
        this.HaptikSDK$a = copyStringToBuffer.toString(bArr, i);
        this.invoke = ah$a(bArr2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        valueOf();
        int i = this.HaptikWebView;
        if (i >= this.getSignupData) {
            return -1;
        }
        byte[] bArr = this.HaptikSDK$d;
        this.HaptikWebView = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.HaptikWebView;
            if (i5 >= this.getSignupData) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.HaptikSDK$d;
            this.HaptikWebView = i5 + 1;
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
        return this.getSignupData - this.HaptikWebView;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
    }

    private byte[][] ah$a(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            for (int i2 = 0; i2 < bArr[i].length; i2++) {
                bArr2[i][bArr[i][i2]] = (byte) i2;
            }
        }
        return bArr2;
    }

    private int valueOf() throws IOException {
        if (this.getInitSettings == Integer.MAX_VALUE) {
            this.getInitSettings = ((FilterInputStream) this).in.read();
        }
        if (this.HaptikWebView == 16) {
            byte[] bArr = this.ah$b;
            int i = this.getInitSettings;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.ah$b, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            toString(this.ah$b, 0, this.HaptikSDK$d, 0);
            int read2 = ((FilterInputStream) this).in.read();
            this.getInitSettings = read2;
            this.HaptikWebView = 0;
            this.getSignupData = read2 < 0 ? 16 - (this.HaptikSDK$d[15] & 255) : 16;
        }
        return this.getSignupData;
    }

    private void toString(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.HaptikSDK$b;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i3] & 255) << 16) | (bArr[i] << 24) | ((bArr[i4] & 255) << 8);
        int i7 = i5 + 1;
        int i8 = i6 | (bArr[i5] & 255);
        int[] iArr2 = this.HaptikSDK$a;
        char c = 0;
        iArr[0] = i8 ^ iArr2[0];
        int i9 = i7 + 1;
        int i10 = i9 + 1;
        int i11 = ((bArr[i9] & 255) << 16) | (bArr[i7] << 24);
        int i12 = i10 + 1;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | (bArr[i12] & 255);
        char c2 = 1;
        iArr[1] = i15 ^ iArr2[1];
        int i16 = i14 + 1;
        int i17 = i16 + 1;
        int i18 = ((bArr[i16] & 255) << 16) | (bArr[i14] << 24);
        int i19 = i17 + 1;
        int i20 = i18 | ((bArr[i17] & 255) << 8);
        int i21 = i19 + 1;
        iArr[2] = (i20 | (bArr[i19] & 255)) ^ iArr2[2];
        int i22 = i21 + 1;
        int i23 = i22 + 1;
        iArr[3] = (((((bArr[i22] & 255) << 16) | (bArr[i21] << 24)) | ((bArr[i23] & 255) << 8)) | (bArr[i23 + 1] & 255)) ^ iArr2[3];
        int i24 = 4;
        int i25 = 1;
        while (i25 < this.HaptikSDK$c) {
            int[] iArr3 = values;
            int[] iArr4 = this.HaptikSDK$b;
            byte[][] bArr3 = this.invoke;
            int i26 = iArr3[iArr4[bArr3[c][c]] >>> 24];
            int[] iArr5 = ag$a;
            int i27 = i26 ^ iArr5[(iArr4[bArr3[c2][c]] >>> 16) & 255];
            int[] iArr6 = ah$a;
            int i28 = i27 ^ iArr6[(iArr4[bArr3[2][c]] >>> 8) & 255];
            int[] iArr7 = toString;
            int i29 = i28 ^ iArr7[iArr4[bArr3[3][c]] & 255];
            int[] iArr8 = this.HaptikSDK$a;
            int i30 = i29 ^ iArr8[i24];
            int i31 = (((iArr5[(iArr4[bArr3[c2][c2]] >>> 16) & 255] ^ iArr3[iArr4[bArr3[c][c2]] >>> 24]) ^ iArr6[(iArr4[bArr3[2][c2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][c2]] & 255]) ^ iArr8[i24 + 1];
            int i32 = (((iArr5[(iArr4[bArr3[c2][2]] >>> 16) & 255] ^ iArr3[iArr4[bArr3[0][2]] >>> 24]) ^ iArr6[(iArr4[bArr3[2][2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][2]] & 255]) ^ iArr8[i24 + 2];
            iArr4[0] = i30;
            iArr4[1] = i31;
            iArr4[2] = i32;
            iArr4[3] = (((iArr3[iArr4[bArr3[0][3]] >>> 24] ^ iArr5[(iArr4[bArr3[1][3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr3[2][3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][3]] & 255]) ^ iArr8[i24 + 3];
            i25++;
            i24 += 4;
            c2 = 1;
            c = 0;
        }
        int[] iArr9 = this.HaptikSDK$a;
        int i33 = iArr9[i24];
        int i34 = i2 + 1;
        byte[] bArr4 = valueOf;
        int[] iArr10 = this.HaptikSDK$b;
        byte[][] bArr5 = this.invoke;
        bArr2[i2] = (byte) (bArr4[iArr10[bArr5[0][0]] >>> 24] ^ (i33 >>> 24));
        int i35 = i34 + 1;
        bArr2[i34] = (byte) (bArr4[(iArr10[bArr5[1][0]] >>> 16) & 255] ^ (i33 >>> 16));
        int i36 = i35 + 1;
        bArr2[i35] = (byte) (bArr4[(iArr10[bArr5[2][0]] >>> 8) & 255] ^ (i33 >>> 8));
        int i37 = i36 + 1;
        bArr2[i36] = (byte) (i33 ^ bArr4[iArr10[bArr5[3][0]] & 255]);
        int i38 = iArr9[i24 + 1];
        int i39 = i37 + 1;
        bArr2[i37] = (byte) (bArr4[iArr10[bArr5[0][1]] >>> 24] ^ (i38 >>> 24));
        int i40 = i39 + 1;
        bArr2[i39] = (byte) (bArr4[(iArr10[bArr5[1][1]] >>> 16) & 255] ^ (i38 >>> 16));
        int i41 = i40 + 1;
        bArr2[i40] = (byte) (bArr4[(iArr10[bArr5[2][1]] >>> 8) & 255] ^ (i38 >>> 8));
        int i42 = i41 + 1;
        bArr2[i41] = (byte) (i38 ^ bArr4[iArr10[bArr5[3][1]] & 255]);
        int i43 = iArr9[i24 + 2];
        int i44 = i42 + 1;
        bArr2[i42] = (byte) (bArr4[iArr10[bArr5[0][2]] >>> 24] ^ (i43 >>> 24));
        int i45 = i44 + 1;
        bArr2[i44] = (byte) (bArr4[(iArr10[bArr5[1][2]] >>> 16) & 255] ^ (i43 >>> 16));
        int i46 = i45 + 1;
        bArr2[i45] = (byte) (bArr4[(iArr10[bArr5[2][2]] >>> 8) & 255] ^ (i43 >>> 8));
        int i47 = i46 + 1;
        bArr2[i46] = (byte) (i43 ^ bArr4[iArr10[bArr5[3][2]] & 255]);
        int i48 = iArr9[i24 + 3];
        int i49 = i47 + 1;
        bArr2[i47] = (byte) (bArr4[iArr10[bArr5[0][3]] >>> 24] ^ (i48 >>> 24));
        int i50 = i49 + 1;
        bArr2[i49] = (byte) (bArr4[(iArr10[bArr5[1][3]] >>> 16) & 255] ^ (i48 >>> 16));
        bArr2[i50] = (byte) (bArr4[(iArr10[bArr5[2][3]] >>> 8) & 255] ^ (i48 >>> 8));
        bArr2[i50 + 1] = (byte) (i48 ^ bArr4[iArr10[bArr5[3][3]] & 255]);
    }
}
