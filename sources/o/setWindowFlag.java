package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class setWindowFlag extends FilterInputStream {
    private final long ah$a;
    private int values;

    public static InputStream toString(InputStream inputStream, long j) {
        return new setWindowFlag(inputStream, j);
    }

    private setWindowFlag(InputStream inputStream, long j) {
        super(inputStream);
        this.ah$a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int max;
        synchronized (this) {
            max = (int) Math.max(this.ah$a - this.values, this.in.available());
        }
        return max;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        synchronized (this) {
            read = super.read();
            ah$a(read >= 0 ? 1 : -1);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int ah$a;
        synchronized (this) {
            ah$a = ah$a(super.read(bArr, i, i2));
        }
        return ah$a;
    }

    private int ah$a(int i) throws IOException {
        if (i >= 0) {
            this.values += i;
        } else if (this.ah$a - this.values > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.ah$a + ", but read: " + this.values);
        }
        return i;
    }
}
