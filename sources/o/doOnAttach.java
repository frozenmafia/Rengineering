package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class doOnAttach extends FilterInputStream {
    private int ag$a;
    private final byte ah$a;
    private static final byte[] valueOf = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private static final int values = 29;
    private static final int toString = 31;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public doOnAttach(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.ah$a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i;
        int i2 = this.ag$a;
        if (i2 < 2 || i2 > (i = toString)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.ah$a;
        } else {
            read = valueOf[i2 - 2] & 255;
        }
        if (read != -1) {
            this.ag$a++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.ag$a;
        int i5 = toString;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.ah$a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(valueOf, this.ag$a - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.ag$a += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.ag$a = (int) (this.ag$a + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
}
