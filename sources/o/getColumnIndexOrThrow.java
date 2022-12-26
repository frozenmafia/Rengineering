package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.AutoClosingRoomOpenHelper;
/* loaded from: classes7.dex */
public class getColumnIndexOrThrow extends FilterInputStream {
    private int HaptikSDK$a;
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private byte[] ag$a;
    private AutoClosingRoomOpenHelper.KeepAliveCursor ah$a;
    private int[] ah$b;
    private int invoke;
    private byte[] toString;
    private byte[] valueOf;
    private final int values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public getColumnIndexOrThrow(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        this.HaptikSDK$c = Integer.MAX_VALUE;
        this.values = Math.min(Math.max(i, 3), 16);
        this.toString = new byte[8];
        byte[] bArr2 = new byte[8];
        this.valueOf = bArr2;
        this.ag$a = new byte[8];
        this.ah$b = new int[2];
        this.HaptikSDK$b = 8;
        this.invoke = 8;
        this.HaptikSDK$a = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.ah$a = new AutoClosingRoomOpenHelper.KeepAliveCursor(iArr, this.values, true, z);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        ah$a();
        int i = this.HaptikSDK$b;
        if (i >= this.invoke) {
            return -1;
        }
        byte[] bArr = this.toString;
        this.HaptikSDK$b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            ah$a();
            int i5 = this.HaptikSDK$b;
            if (i5 >= this.invoke) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.toString;
            this.HaptikSDK$b = i5 + 1;
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
        ah$a();
        return this.invoke - this.HaptikSDK$b;
    }

    private void valueOf() {
        if (this.HaptikSDK$a == 2) {
            byte[] bArr = this.toString;
            System.arraycopy(bArr, 0, this.ag$a, 0, bArr.length);
        }
        byte[] bArr2 = this.toString;
        getColumnName.values(((bArr2[0] << 24) & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.values, this.ah$a.valueOf, this.ah$a.toString, this.ah$b);
        int[] iArr = this.ah$b;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.toString;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.HaptikSDK$a == 2) {
            values();
            byte[] bArr4 = this.ag$a;
            System.arraycopy(bArr4, 0, this.valueOf, 0, bArr4.length);
        }
    }

    private void values() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.toString;
            bArr[i] = (byte) (bArr[i] ^ this.valueOf[i]);
        }
    }

    private int ah$a() throws IOException {
        if (this.HaptikSDK$c == Integer.MAX_VALUE) {
            this.HaptikSDK$c = ((FilterInputStream) this).in.read();
        }
        if (this.HaptikSDK$b == 8) {
            byte[] bArr = this.toString;
            int i = this.HaptikSDK$c;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.toString, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            valueOf();
            int read2 = ((FilterInputStream) this).in.read();
            this.HaptikSDK$c = read2;
            this.HaptikSDK$b = 0;
            this.invoke = read2 < 0 ? 8 - (this.toString[7] & 255) : 8;
        }
        return this.invoke;
    }
}
