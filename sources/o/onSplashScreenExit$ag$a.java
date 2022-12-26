package o;

import android.content.Context;
import o.computeDecorFitsWindow;
/* loaded from: classes3.dex */
public final class onSplashScreenExit$ag$a implements computeDecorFitsWindow.values {
    private final Context ag$a;
    private final computeDecorFitsWindow.values ah$a;
    private createSplashScreenView valueOf;

    public onSplashScreenExit$ag$a(Context context) {
        this(context, new SplashScreen$Impl31$$ExternalSyntheticLambda0$ag$a());
    }

    public onSplashScreenExit$ag$a(Context context, computeDecorFitsWindow.values valuesVar) {
        this.ag$a = context.getApplicationContext();
        this.ah$a = valuesVar;
    }

    @Override // o.computeDecorFitsWindow.values
    /* renamed from: valueOf */
    public onSplashScreenExit ag$a() {
        onSplashScreenExit onsplashscreenexit = new onSplashScreenExit(this.ag$a, this.ah$a.ag$a());
        createSplashScreenView createsplashscreenview = this.valueOf;
        if (createsplashscreenview != null) {
            onsplashscreenexit.ah$a(createsplashscreenview);
        }
        return onsplashscreenexit;
    }
}
