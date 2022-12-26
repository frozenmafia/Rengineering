package o;

import android.animation.Animator;
import android.widget.Button;
import com.appsamurai.storyly.storylypresenter.storylylayer.h1;
/* loaded from: classes3.dex */
public final class MenuItemCompat implements Animator.AnimatorListener {
    public final /* synthetic */ h1 valueOf;

    /* loaded from: classes3.dex */
    public final class OnActionExpandListener implements Animator.AnimatorListener {
        public final /* synthetic */ h1 values;

        public OnActionExpandListener(h1 h1Var) {
            this.values = h1Var;
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
            Button signupData;
            signupData = this.values.getSignupData();
            signupData.setEnabled(false);
        }
    }

    public MenuItemCompat(h1 h1Var) {
        this.valueOf = h1Var;
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
        Button onNavigationEvent;
        Button signupData;
        h1 h1Var = this.valueOf;
        h1Var.onXdkEvent = false;
        onNavigationEvent = h1Var.onNavigationEvent();
        onNavigationEvent.setEnabled(false);
        signupData = this.valueOf.getSignupData();
        signupData.setEnabled(false);
    }
}
