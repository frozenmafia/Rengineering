package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.RelativeLayout;
/* loaded from: classes7.dex */
public final class setShadowDrawableRight extends AnimatorListenerAdapter {
    public final /* synthetic */ ai.haptik.android.wrapper.sdk.HaptikWebView ah$a;

    public setShadowDrawableRight(ai.haptik.android.wrapper.sdk.HaptikWebView haptikWebView) {
        this.ah$a = haptikWebView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        runAnimators.ag$a(animator, "animation");
        RelativeLayout relativeLayout = this.ah$a.values;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        } else {
            runAnimators.valueOf("loader");
            throw null;
        }
    }
}
