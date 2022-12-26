package o;

import android.animation.Animator;
import o.DragStartHelper;
import o.Styleable;
/* loaded from: classes3.dex */
public final class GestureDetectorCompat implements Animator.AnimatorListener {
    public final /* synthetic */ DragStartHelper.AnonymousClass1 ag$a;

    public GestureDetectorCompat(DragStartHelper.AnonymousClass1 anonymousClass1) {
        this.ag$a = anonymousClass1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.ag$a.valueOf().setVisibility(4);
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.ag$a.invoke;
        if (arcMotion == null) {
            runAnimators.valueOf("onFeedbackSheetDismiss");
            arcMotion = null;
        }
        arcMotion.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
