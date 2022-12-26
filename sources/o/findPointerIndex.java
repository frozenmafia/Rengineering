package o;

import android.animation.Animator;
/* loaded from: classes3.dex */
public final class findPointerIndex implements Animator.AnimatorListener {
    public final /* synthetic */ com.appsamurai.storyly.storylypresenter.storylylayer.m valueOf;

    public findPointerIndex(com.appsamurai.storyly.storylypresenter.storylylayer.m mVar) {
        this.valueOf = mVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.valueOf.ag$a(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
