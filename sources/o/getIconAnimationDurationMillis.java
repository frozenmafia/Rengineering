package o;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class getIconAnimationDurationMillis implements computeDecorFitsWindow {
    private long ag$a;
    private Uri ah$a = Uri.EMPTY;
    private Map<String, List<String>> toString = Collections.emptyMap();
    private final computeDecorFitsWindow values;

    public getIconAnimationDurationMillis(computeDecorFitsWindow computedecorfitswindow) {
        this.values = (computeDecorFitsWindow) FingerprintManagerCompat.toString(computedecorfitswindow);
    }

    public void HaptikSDK$c() {
        this.ag$a = 0L;
    }

    public long values() {
        return this.ag$a;
    }

    public Uri HaptikSDK$a() {
        return this.ah$a;
    }

    public Map<String, List<String>> invoke() {
        return this.toString;
    }

    @Override // o.computeDecorFitsWindow
    public void ah$a(createSplashScreenView createsplashscreenview) {
        FingerprintManagerCompat.toString(createsplashscreenview);
        this.values.ah$a(createsplashscreenview);
    }

    @Override // o.computeDecorFitsWindow
    public long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) throws IOException {
        this.ah$a = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
        this.toString = Collections.emptyMap();
        long valueOf = this.values.valueOf(splashScreen$Impl31$hierarchyListener$1);
        this.ah$a = (Uri) FingerprintManagerCompat.toString(ah$a());
        this.toString = ag$a();
        return valueOf;
    }

    @Override // o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws IOException {
        int values = this.values.values(bArr, i, i2);
        if (values != -1) {
            this.ag$a += values;
        }
        return values;
    }

    @Override // o.computeDecorFitsWindow
    public Uri ah$a() {
        return this.values.ah$a();
    }

    @Override // o.computeDecorFitsWindow
    public Map<String, List<String>> ag$a() {
        return this.values.ag$a();
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() throws IOException {
        this.values.valueOf();
    }
}
