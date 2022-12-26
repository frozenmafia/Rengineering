package o;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
/* loaded from: classes5.dex */
public final class isWindowExtensionsValid extends BufferedInputStream {
    private long HaptikSDK$b;
    private final boolean ag$a;
    private int ah$a;
    private boolean toString;
    private final int valueOf;
    private long values;

    private isWindowExtensionsValid(InputStream inputStream, int i, int i2) {
        super(inputStream, i);
        this.HaptikSDK$b = 0L;
        isWindowLayoutProviderValid.toString(i2 >= 0);
        this.valueOf = i2;
        this.ah$a = i2;
        this.ag$a = i2 != 0;
        this.values = System.nanoTime();
    }

    public static isWindowExtensionsValid ag$a(InputStream inputStream, int i, int i2) {
        if (inputStream instanceof isWindowExtensionsValid) {
            return (isWindowExtensionsValid) inputStream;
        }
        return new isWindowExtensionsValid(inputStream, i, i2);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.toString || (this.ag$a && this.ah$a <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.toString = true;
            return -1;
        } else if (ah$a()) {
            throw new SocketTimeoutException("Read timeout");
        } else {
            if (this.ag$a && i2 > (i3 = this.ah$a)) {
                i2 = i3;
            }
            try {
                int read = super.read(bArr, i, i2);
                this.ah$a -= read;
                return read;
            } catch (SocketTimeoutException unused) {
                return 0;
            }
        }
    }

    public ByteBuffer toString(int i) throws IOException {
        isWindowLayoutProviderValid.ag$a(i >= 0, "maxSize must be 0 (unlimited) or larger");
        boolean z = i > 0;
        int i2 = 32768;
        if (z && i < 32768) {
            i2 = i;
        }
        byte[] bArr = new byte[i2];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        while (true) {
            int read = read(bArr);
            if (read == -1) {
                break;
            }
            if (z) {
                if (read >= i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                    break;
                }
                i -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.ah$a = this.valueOf - this.markpos;
    }

    public isWindowExtensionsValid toString(long j, long j2) {
        this.values = j;
        this.HaptikSDK$b = j2 * 1000000;
        return this;
    }

    private boolean ah$a() {
        return this.HaptikSDK$b != 0 && System.nanoTime() - this.values > this.HaptikSDK$b;
    }
}
