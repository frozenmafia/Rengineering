package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
final class getGetUserIdMethod implements computeDecorFitsWindow {
    private final values ag$a;
    private final computeDecorFitsWindow ah$a;
    private int toString;
    private final int valueOf;
    private final byte[] values;

    /* loaded from: classes3.dex */
    public interface values {
        void valueOf(C$default$setContentDescription c$default$setContentDescription);
    }

    public getGetUserIdMethod(computeDecorFitsWindow computedecorfitswindow, int i, values valuesVar) {
        FingerprintManagerCompat.toString(i > 0);
        this.ah$a = computedecorfitswindow;
        this.valueOf = i;
        this.ag$a = valuesVar;
        this.values = new byte[1];
        this.toString = i;
    }

    @Override // o.computeDecorFitsWindow
    public void ah$a(createSplashScreenView createsplashscreenview) {
        FingerprintManagerCompat.toString(createsplashscreenview);
        this.ah$a.ah$a(createsplashscreenview);
    }

    @Override // o.computeDecorFitsWindow
    public long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws IOException {
        if (this.toString == 0) {
            if (!values()) {
                return -1;
            }
            this.toString = this.valueOf;
        }
        int values2 = this.ah$a.values(bArr, i, Math.min(this.toString, i2));
        if (values2 != -1) {
            this.toString -= values2;
        }
        return values2;
    }

    @Override // o.computeDecorFitsWindow
    public Uri ah$a() {
        return this.ah$a.ah$a();
    }

    @Override // o.computeDecorFitsWindow
    public Map<String, List<String>> ag$a() {
        return this.ah$a.ag$a();
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() {
        throw new UnsupportedOperationException();
    }

    private boolean values() throws IOException {
        if (this.ah$a.values(this.values, 0, 1) == -1) {
            return false;
        }
        int i = (this.values[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int values2 = this.ah$a.values(bArr, i3, i2);
            if (values2 == -1) {
                return false;
            }
            i3 += values2;
            i2 -= values2;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.ag$a.valueOf(new C$default$setContentDescription(bArr, i));
        }
        return true;
    }
}
