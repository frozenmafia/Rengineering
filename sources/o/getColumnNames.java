package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class getColumnNames extends FilterInputStream {
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private long[] ag$a;
    private short ah$a;
    private int invoke;
    private long[] toString;
    private byte[] valueOf;
    private final int values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public getColumnNames(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        this.HaptikSDK$c = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.values = min;
        this.valueOf = new byte[min];
        this.ag$a = new long[4];
        this.toString = new long[4];
        this.invoke = min;
        this.HaptikSDK$b = min;
        this.ag$a = getNotificationUris.toString(i ^ i4, min ^ i4);
        this.toString = getNotificationUris.toString(i2 ^ i4, i3 ^ i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        valueOf();
        int i = this.invoke;
        if (i >= this.HaptikSDK$b) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.invoke = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.invoke;
            if (i5 >= this.HaptikSDK$b) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.valueOf;
            this.invoke = i5 + 1;
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
        return this.HaptikSDK$b - this.invoke;
    }

    private void ah$a() {
        getNotificationUris.ag$a(this.ag$a, this.toString, this.ah$a);
        for (int i = 0; i < this.values; i++) {
            byte[] bArr = this.valueOf;
            bArr[i] = (byte) (bArr[i] ^ ((this.ag$a[this.ah$a] >> (i << 3)) & 255));
        }
        this.ah$a = (short) ((this.ah$a + 1) % 4);
    }

    private int valueOf() throws IOException {
        int i;
        if (this.HaptikSDK$c == Integer.MAX_VALUE) {
            this.HaptikSDK$c = ((FilterInputStream) this).in.read();
        }
        if (this.invoke == this.values) {
            byte[] bArr = this.valueOf;
            int i2 = this.HaptikSDK$c;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.valueOf, i3, this.values - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.values);
            if (i3 < this.values) {
                throw new IllegalStateException("unexpected block size");
            }
            ah$a();
            int read2 = ((FilterInputStream) this).in.read();
            this.HaptikSDK$c = read2;
            this.invoke = 0;
            if (read2 < 0) {
                int i4 = this.values;
                i = i4 - (this.valueOf[i4 - 1] & 255);
            } else {
                i = this.values;
            }
            this.HaptikSDK$b = i;
        }
        return this.HaptikSDK$b;
    }
}
