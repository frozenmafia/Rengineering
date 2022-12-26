package o;

import android.os.Handler;
import com.appsamurai.storyly.storylypresenter.storylylayer.d2;
/* loaded from: classes3.dex */
public final class LayoutInflaterFactory implements Runnable {
    public final /* synthetic */ d2 valueOf;

    public LayoutInflaterFactory(d2 d2Var) {
        this.valueOf = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler ak$b;
        d2 d2Var = this.valueOf;
        int i = d2.toString;
        Transition<Long, Long, setAnimationMatrix> HaptikSDK$d = d2Var.HaptikSDK$d();
        getBearingAccuracyDegrees getbearingaccuracydegrees = d2Var.ak;
        Long valueOf = getbearingaccuracydegrees == null ? null : Long.valueOf(getbearingaccuracydegrees.onXdkEvent());
        getBearingAccuracyDegrees getbearingaccuracydegrees2 = d2Var.ak;
        HaptikSDK$d.invoke(valueOf, getbearingaccuracydegrees2 != null ? Long.valueOf(getbearingaccuracydegrees2.aj$a()) : null);
        d2 d2Var2 = this.valueOf;
        getBearingAccuracyDegrees getbearingaccuracydegrees3 = d2Var2.ak;
        boolean z = true;
        if ((getbearingaccuracydegrees3 == null || !getbearingaccuracydegrees3.HaptikSDK$a()) ? false : false) {
            d2Var2.a += 200;
            d2Var2.HaptikWebView().invoke(Long.valueOf(d2Var2.a));
        }
        ak$b = this.valueOf.ak$b();
        ak$b.postDelayed(this, 200L);
    }
}
