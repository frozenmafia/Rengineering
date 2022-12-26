package o;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
/* loaded from: classes4.dex */
public class onSubscribe {
    private ValueAnimator.AnimatorUpdateListener ah$a;
    protected float values = 1.0f;
    protected float valueOf = 1.0f;

    public onSubscribe() {
    }

    public onSubscribe(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ah$a = animatorUpdateListener;
    }

    private ObjectAnimator ag$a(int i, onSearch$ah$a onsearch_ah_a) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        ofFloat.setInterpolator(onsearch_ah_a);
        ofFloat.setDuration(i);
        return ofFloat;
    }

    private ObjectAnimator values(int i, onSearch$ah$a onsearch_ah_a) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        ofFloat.setInterpolator(onsearch_ah_a);
        ofFloat.setDuration(i);
        return ofFloat;
    }

    public void ah$a(int i, onSearch$ah$a onsearch_ah_a) {
        ObjectAnimator ag$a = ag$a(i, onsearch_ah_a);
        ag$a.addUpdateListener(this.ah$a);
        ag$a.start();
    }

    public void valueOf(int i, int i2, onSearch$ah$a onsearch_ah_a, onSearch$ah$a onsearch_ah_a2) {
        ObjectAnimator ag$a = ag$a(i, onsearch_ah_a);
        ObjectAnimator values = values(i2, onsearch_ah_a2);
        if (i > i2) {
            ag$a.addUpdateListener(this.ah$a);
        } else {
            values.addUpdateListener(this.ah$a);
        }
        ag$a.start();
        values.start();
    }

    public void toString(int i, onSearch$ah$a onsearch_ah_a) {
        ObjectAnimator values = values(i, onsearch_ah_a);
        values.addUpdateListener(this.ah$a);
        values.start();
    }

    public float values() {
        return this.values;
    }

    public float valueOf() {
        return this.valueOf;
    }
}
