package o;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes3.dex */
public abstract class requestFontSync extends resetTypefaceCache {
    private byte[] HaptikSDK$b;
    private volatile boolean HaptikWebView;

    protected abstract void ag$a(byte[] bArr, int i) throws IOException;

    public requestFontSync(computeDecorFitsWindow computedecorfitswindow, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, int i, createFromIcon createfromicon, int i2, Object obj, byte[] bArr) {
        super(computedecorfitswindow, splashScreen$Impl31$hierarchyListener$1, i, createfromicon, i2, obj, C.TIME_UNSET, C.TIME_UNSET);
        requestFontSync requestfontsync;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = getElevationDegrees.values;
            requestfontsync = this;
        } else {
            requestfontsync = this;
            bArr2 = bArr;
        }
        requestfontsync.HaptikSDK$b = bArr2;
    }

    public byte[] ah$b() {
        return this.HaptikSDK$b;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.upstream.Loader.values
    public final void valueOf() {
        this.HaptikWebView = true;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.upstream.Loader.values
    public final void ah$a() throws IOException {
        try {
            this.toString.valueOf(this.ag$a);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.HaptikWebView) {
                ah$a(i2);
                i = this.toString.values(this.HaptikSDK$b, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.HaptikWebView) {
                ag$a(this.HaptikSDK$b, i2);
            }
        } finally {
            getHierarchyListener.valueOf(this.toString);
        }
    }

    private void ah$a(int i) {
        byte[] bArr = this.HaptikSDK$b;
        if (bArr.length < i + 16384) {
            this.HaptikSDK$b = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
