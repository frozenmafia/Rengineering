package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.appsamurai.storyly.storylypresenter.storylylayer.f1;
/* loaded from: classes3.dex */
public final class NestedScrollingChildHelper extends AnimatorListenerAdapter {
    public final /* synthetic */ f1 toString;
    public final /* synthetic */ dispatchNestedScroll values;

    public NestedScrollingChildHelper(f1 f1Var, dispatchNestedScroll dispatchnestedscroll) {
        this.toString = f1Var;
        this.values = dispatchnestedscroll;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        runAnimators.ag$a(animator, "animation");
        this.values.ag$a.removeView(this.toString);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.toString.isLogoutPending();
    }
}
