package o;

import com.appsamurai.storyly.exoplayer2.core.upstream.Loader;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes6.dex */
final class convertToByteArrayList$ah$a implements Loader.values {
    public final long ag$a = getUserHandleForUid.values();
    private final getIconAnimationDurationMillis toString;
    public final SplashScreen$Impl31$hierarchyListener$1 valueOf;
    private byte[] values;

    @Override // com.appsamurai.storyly.exoplayer2.core.upstream.Loader.values
    public void valueOf() {
    }

    public convertToByteArrayList$ah$a(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, computeDecorFitsWindow computedecorfitswindow) {
        this.valueOf = splashScreen$Impl31$hierarchyListener$1;
        this.toString = new getIconAnimationDurationMillis(computedecorfitswindow);
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.upstream.Loader.values
    public void ah$a() throws IOException {
        this.toString.HaptikSDK$c();
        try {
            this.toString.valueOf(this.valueOf);
            int i = 0;
            while (i != -1) {
                int values = (int) this.toString.values();
                byte[] bArr = this.values;
                if (bArr == null) {
                    this.values = new byte[1024];
                } else if (values == bArr.length) {
                    this.values = Arrays.copyOf(bArr, bArr.length * 2);
                }
                getIconAnimationDurationMillis geticonanimationdurationmillis = this.toString;
                byte[] bArr2 = this.values;
                i = geticonanimationdurationmillis.values(bArr2, values, bArr2.length - values);
            }
        } finally {
            getHierarchyListener.valueOf(this.toString);
        }
    }
}
