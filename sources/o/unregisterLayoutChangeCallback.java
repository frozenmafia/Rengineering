package o;

import java.io.IOException;
import java.io.InputStream;
import org.brotli.dec.BrotliRuntimeException;
/* loaded from: classes5.dex */
public class unregisterLayoutChangeCallback extends InputStream {
    private int ag$a;
    private byte[] toString;
    private int valueOf;
    private final FoldingFeature values;

    public unregisterLayoutChangeCallback(InputStream inputStream) throws IOException {
        this(inputStream, 16384, null);
    }

    public unregisterLayoutChangeCallback(InputStream inputStream, int i, byte[] bArr) throws IOException {
        FoldingFeature foldingFeature = new FoldingFeature();
        this.values = foldingFeature;
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        } else if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        } else {
            this.toString = new byte[i];
            this.ag$a = 0;
            this.valueOf = 0;
            try {
                FoldingFeature.ah$a(foldingFeature, inputStream);
                if (bArr != null) {
                    ExtensionWindowLayoutInfoBackend.values(foldingFeature, bArr);
                }
            } catch (BrotliRuntimeException e) {
                throw new IOException("Brotli decoder initialization failed", e);
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        FoldingFeature.toString(this.values);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.valueOf >= this.ag$a) {
            byte[] bArr = this.toString;
            int read = read(bArr, 0, bArr.length);
            this.ag$a = read;
            this.valueOf = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.toString;
        int i = this.valueOf;
        this.valueOf = i + 1;
        return bArr2[i] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Bad length: " + i2);
        } else {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.ag$a - this.valueOf, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.toString, this.valueOf, bArr, i, max);
                    this.valueOf += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    this.values.newSession = bArr;
                    this.values.postMessage = i;
                    this.values.mayLaunchUrl = i2;
                    this.values.requestPostMessageChannelWithExtras = 0;
                    ExtensionWindowLayoutInfoBackend.values(this.values);
                    if (this.values.requestPostMessageChannelWithExtras == 0) {
                        return -1;
                    }
                    return this.values.requestPostMessageChannelWithExtras + max;
                } catch (BrotliRuntimeException e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        }
    }
}
