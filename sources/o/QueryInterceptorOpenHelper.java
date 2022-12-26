package o;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes7.dex */
public class QueryInterceptorOpenHelper extends InputStream {
    private final long toString;
    private final InputStream valueOf;
    private long values = 0;
    private long ag$a = -1;
    private boolean ah$a = true;

    public QueryInterceptorOpenHelper(InputStream inputStream, long j) {
        this.toString = j;
        this.valueOf = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.toString;
        if (j >= 0 && this.values >= j) {
            throw new IOException("Exceeded configured input limit of " + this.toString + " bytes");
        }
        int read = this.valueOf.read();
        this.values++;
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.toString;
        if (j >= 0 && this.values >= j) {
            throw new IOException("Exceeded configured input limit of " + this.toString + " bytes");
        }
        int read = this.valueOf.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.values + read;
        this.values = j2;
        long j3 = this.toString;
        if (j3 < 0 || j2 < j3) {
            return read;
        }
        throw new IOException("Exceeded configured input limit of " + this.toString + " bytes");
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = this.toString;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.values);
        }
        long skip = this.valueOf.skip(j);
        this.values += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j = this.toString;
        if (j < 0 || this.values < j) {
            return this.valueOf.available();
        }
        return 0;
    }

    public String toString() {
        return this.valueOf.toString();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.ah$a) {
            this.valueOf.close();
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            this.valueOf.reset();
            this.values = this.ag$a;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            this.valueOf.mark(i);
            this.ag$a = this.values;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.valueOf.markSupported();
    }
}
