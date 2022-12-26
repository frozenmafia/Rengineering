package o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import o.DiffUtil;
/* loaded from: classes7.dex */
final class hasDragFlag extends InputStream {
    DiffUtil.Callback<DiffUtil.Diagonal> ah$a;
    byte[] toString;
    InputStream valueOf;
    boolean values = false;
    InputStream ag$a = null;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public hasDragFlag(DiffUtil.Callback<DiffUtil.Diagonal> callback, InputStream inputStream, byte[] bArr) {
        this.ah$a = callback;
        if (inputStream.markSupported()) {
            this.valueOf = inputStream;
        } else {
            this.valueOf = new BufferedInputStream(inputStream);
        }
        this.valueOf.mark(Integer.MAX_VALUE);
        this.toString = (byte[]) bArr.clone();
    }

    private void values() throws IOException {
        this.valueOf.reset();
    }

    private void valueOf() throws IOException {
        this.valueOf.mark(0);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        synchronized (this) {
            InputStream inputStream = this.ag$a;
            if (inputStream == null) {
                return 0;
            }
            return inputStream.available();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        synchronized (this) {
            byte[] bArr = new byte[1];
            if (read(bArr) == 1) {
                return bArr[0];
            }
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read;
        synchronized (this) {
            read = read(bArr, 0, bArr.length);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = this.ag$a;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            } else if (this.values) {
                throw new IOException("No matching key found for the ciphertext in the stream.");
            } else {
                this.values = true;
                for (DiffUtil$Callback$ah$a<DiffUtil.Diagonal> diffUtil$Callback$ah$a : this.ah$a.valueOf()) {
                    try {
                        InputStream values = diffUtil$Callback$ah$a.valueOf().values(this.valueOf, this.toString);
                        int read = values.read(bArr, i, i2);
                        if (read == 0) {
                            throw new IOException("Could not read bytes from the ciphertext stream");
                        }
                        this.ag$a = values;
                        valueOf();
                        return read;
                    } catch (IOException unused) {
                        values();
                    } catch (GeneralSecurityException unused2) {
                        values();
                    }
                }
                throw new IOException("No matching key found for the ciphertext in the stream.");
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.valueOf.close();
        }
    }
}
