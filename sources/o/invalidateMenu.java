package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.widget.Button;
import com.appsamurai.storyly.storylypresenter.storylylayer.h1;
/* loaded from: classes3.dex */
public final class invalidateMenu implements Animator.AnimatorListener {
    public final /* synthetic */ h1 toString;

    public invalidateMenu(h1 h1Var) {
        this.toString = h1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        Button signupData;
        Button onNavigationEvent;
        AnimatorSet animatorSet = this.toString.a;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        h1 h1Var = this.toString;
        h1Var.onXdkEvent = true;
        signupData = h1Var.getSignupData();
        signupData.setEnabled(true);
        onNavigationEvent = this.toString.onNavigationEvent();
        onNavigationEvent.setEnabled(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
