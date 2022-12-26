package o;

import com.appsamurai.storyly.exoplayer2.datasource.upstream.HttpDataSource$ah$a;
import o.SplashScreen;
/* loaded from: classes3.dex */
public final class SplashScreen$Impl31$$ExternalSyntheticLambda0$ag$a implements SplashScreen.OnExitAnimationListener {
    private createSplashScreenView HaptikSDK$a;
    private findViewHolder<String> ah$a;
    private String ah$b;
    private boolean toString;
    private boolean values;
    private final HttpDataSource$ah$a ag$a = new HttpDataSource$ah$a();
    private int valueOf = 8000;
    private int HaptikSDK$c = 8000;

    public SplashScreen$Impl31$$ExternalSyntheticLambda0$ag$a toString(String str) {
        this.ah$b = str;
        return this;
    }

    @Override // o.computeDecorFitsWindow.values
    /* renamed from: ah$a */
    public SplashScreen$Impl31$$ExternalSyntheticLambda0 ag$a() {
        SplashScreen$Impl31$$ExternalSyntheticLambda0 splashScreen$Impl31$$ExternalSyntheticLambda0 = new SplashScreen$Impl31$$ExternalSyntheticLambda0(this.ah$b, this.valueOf, this.HaptikSDK$c, this.toString, this.ag$a, this.ah$a, this.values);
        createSplashScreenView createsplashscreenview = this.HaptikSDK$a;
        if (createsplashscreenview != null) {
            splashScreen$Impl31$$ExternalSyntheticLambda0.ah$a(createsplashscreenview);
        }
        return splashScreen$Impl31$$ExternalSyntheticLambda0;
    }
}
