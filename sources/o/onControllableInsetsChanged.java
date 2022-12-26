package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class onControllableInsetsChanged extends FilterInputStream {
    private int values;

    public onControllableInsetsChanged(InputStream inputStream) {
        super(inputStream);
        this.values = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            super.mark(i);
            this.values = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (valueOf(1L) == -1) {
            return -1;
        }
        int read = super.read();
        values(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int valueOf = (int) valueOf(i2);
        if (valueOf == -1) {
            return -1;
        }
        int read = super.read(bArr, i, valueOf);
        values(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            super.reset();
            this.values = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long valueOf = valueOf(j);
        if (valueOf == -1) {
            return 0L;
        }
        long skip = super.skip(valueOf);
        values(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.values;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    private long valueOf(long j) {
        int i = this.values;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = i;
            return j > j2 ? j2 : j;
        }
        return j;
    }

    private void values(long j) {
        int i = this.values;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.values = (int) (i - j);
    }
}
