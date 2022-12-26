package o;

import android.view.animation.Animation;
import com.appsamurai.storyly.storylypresenter.o;
/* loaded from: classes3.dex */
public final class getCurrentDisplaySizeFromWorkarounds extends computeVerticalScrollRange {
    public final /* synthetic */ o valueOf;

    public getCurrentDisplaySizeFromWorkarounds(o oVar) {
        this.valueOf = oVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.valueOf.HaptikWebView().invoke();
    }
}
