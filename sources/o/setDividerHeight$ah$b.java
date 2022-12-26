package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
/* loaded from: classes5.dex */
abstract class setDividerHeight$ah$b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean ag$a;
    private float ah$a;
    final /* synthetic */ setDividerHeight valueOf;
    private float values;

    protected abstract float ag$a();

    private setDividerHeight$ah$b(setDividerHeight setdividerheight) {
        this.valueOf = setdividerheight;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.ag$a) {
            this.values = this.valueOf.a == null ? 0.0f : this.valueOf.a.onPostMessage();
            this.ah$a = ag$a();
            this.ag$a = true;
        }
        setDividerHeight setdividerheight = this.valueOf;
        float f = this.values;
        setdividerheight.toString((int) (f + ((this.ah$a - f) * valueAnimator.getAnimatedFraction())));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.valueOf.toString((int) this.ah$a);
        this.ag$a = false;
    }
}
