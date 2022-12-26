package o;

import android.animation.Animator;
import android.widget.Button;
import com.appsamurai.storyly.storylypresenter.storylylayer.h1;
/* loaded from: classes3.dex */
public final class minusAssign implements Animator.AnimatorListener {
    public final /* synthetic */ h1 toString;

    public minusAssign(h1 h1Var) {
        this.toString = h1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Button signupData;
        signupData = this.toString.getSignupData();
        signupData.setEnabled(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
