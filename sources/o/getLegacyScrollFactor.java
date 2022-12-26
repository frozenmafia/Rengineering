package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes3.dex */
class getLegacyScrollFactor implements Closeable {
    private final Charset ag$a;
    private final InputStream ah$a;
    private int toString;
    private byte[] valueOf;
    private int values;

    public getLegacyScrollFactor(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public getLegacyScrollFactor(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(getScaledHoverSlop.ah$a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.ah$a = inputStream;
        this.ag$a = charset;
        this.valueOf = new byte[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.ah$a) {
            if (this.valueOf != null) {
                this.valueOf = null;
                this.ah$a.close();
            }
        }
    }

    public String ag$a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.ah$a) {
            if (this.valueOf == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.values >= this.toString) {
                values();
            }
            for (int i3 = this.values; i3 != this.toString; i3++) {
                byte[] bArr2 = this.valueOf;
                if (bArr2[i3] == 10) {
                    int i4 = this.values;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            String str = new String(bArr2, i4, i2 - i4, this.ag$a.name());
                            this.values = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(bArr2, i4, i2 - i4, this.ag$a.name());
                    this.values = i3 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.toString - this.values) + 80) { // from class: o.getLegacyScrollFactor.1
                @Override // java.io.ByteArrayOutputStream
                public String toString() {
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, getLegacyScrollFactor.this.ag$a.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.valueOf;
                int i5 = this.values;
                byteArrayOutputStream.write(bArr3, i5, this.toString - i5);
                this.toString = -1;
                values();
                i = this.values;
                while (i != this.toString) {
                    bArr = this.valueOf;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.values;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.values = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public boolean ah$a() {
        return this.toString == -1;
    }

    private void values() throws IOException {
        InputStream inputStream = this.ah$a;
        byte[] bArr = this.valueOf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.values = 0;
        this.toString = read;
    }
}
