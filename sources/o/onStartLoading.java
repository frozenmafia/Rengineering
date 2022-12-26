package o;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes6.dex */
public final class onStartLoading extends InputStream {
    private final onStopLoading ag$a;
    private final InputStream ah$a;
    private final int toString;
    private byte[] valueOf;
    private int values;

    public onStartLoading(onStopLoading onstoploading, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.ag$a = onstoploading;
        this.ah$a = inputStream;
        this.valueOf = bArr;
        this.values = i;
        this.toString = i2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.valueOf != null) {
            return this.toString - this.values;
        }
        return this.ah$a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        values();
        this.ah$a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (this.valueOf == null) {
            this.ah$a.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.valueOf == null && this.ah$a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.valueOf;
        if (bArr != null) {
            int i = this.values;
            int i2 = i + 1;
            this.values = i2;
            byte b2 = bArr[i];
            if (i2 >= this.toString) {
                values();
            }
            return b2 & 255;
        }
        return this.ah$a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.valueOf;
        if (bArr2 != null) {
            int i3 = this.toString;
            int i4 = this.values;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.values + i2;
            this.values = i6;
            if (i6 >= this.toString) {
                values();
            }
            return i2;
        }
        return this.ah$a.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.valueOf == null) {
            this.ah$a.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.valueOf != null) {
            int i = this.toString;
            int i2 = this.values;
            long j3 = i - i2;
            if (j3 > j) {
                this.values = i2 + ((int) j);
                return j;
            }
            values();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.ah$a.skip(j) : j2;
    }

    private void values() {
        byte[] bArr = this.valueOf;
        if (bArr != null) {
            this.valueOf = null;
            onStopLoading onstoploading = this.ag$a;
            if (onstoploading != null) {
                onstoploading.valueOf(bArr);
            }
        }
    }
}
