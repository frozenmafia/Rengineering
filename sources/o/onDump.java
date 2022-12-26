package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public class onDump extends FilterInputStream {
    private int ag$a;
    private final byte[] toString;
    private int values;

    public onDump(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.toString = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = this.in.read();
        return read != -1 ? read : ah$a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int ah$a = ah$a();
            if (ah$a == -1) {
                break;
            }
            bArr[i + i3] = (byte) ah$a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.values = this.ag$a;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.ag$a = this.values;
        }
    }

    private int ah$a() {
        int i = this.values;
        byte[] bArr = this.toString;
        if (i >= bArr.length) {
            return -1;
        }
        this.values = i + 1;
        return bArr[i] & 255;
    }
}
