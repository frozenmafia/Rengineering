package o;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class getPreDrawListener extends InputStream {
    private long HaptikSDK$b;
    private final SplashScreen$Impl31$hierarchyListener$1 ag$a;
    private final computeDecorFitsWindow valueOf;
    private boolean values = false;
    private boolean toString = false;
    private final byte[] ah$a = new byte[1];

    public getPreDrawListener(computeDecorFitsWindow computedecorfitswindow, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) {
        this.valueOf = computedecorfitswindow;
        this.ag$a = splashScreen$Impl31$hierarchyListener$1;
    }

    public void valueOf() throws IOException {
        values();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.ah$a) == -1) {
            return -1;
        }
        return this.ah$a[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        FingerprintManagerCompat.ah$a(!this.toString);
        values();
        int values = this.valueOf.values(bArr, i, i2);
        if (values == -1) {
            return -1;
        }
        this.HaptikSDK$b += values;
        return values;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.toString) {
            return;
        }
        this.valueOf.valueOf();
        this.toString = true;
    }

    private void values() throws IOException {
        if (this.values) {
            return;
        }
        this.valueOf.valueOf(this.ag$a);
        this.values = true;
    }
}
