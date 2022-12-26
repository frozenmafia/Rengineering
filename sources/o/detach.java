package o;

import android.animation.Animator;
import com.appsamurai.storyly.storylypresenter.storylyfooter.a$ag$a;
/* loaded from: classes3.dex */
public final class detach implements Animator.AnimatorListener {
    public final /* synthetic */ a$ag$a ah$a;

    public detach(a$ag$a a_ag_a, double d) {
        this.ah$a = a_ag_a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        float f = (float) 0.3d;
        this.ah$a.HaptikSDK$a.setScaleX(f);
        this.ah$a.HaptikSDK$a.setScaleY(f);
        this.ah$a.HaptikSDK$a.setVisibility(0);
    }
}
