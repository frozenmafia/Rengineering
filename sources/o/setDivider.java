package o;

import android.animation.Animator;
/* loaded from: classes7.dex */
public class setDivider {
    private Animator toString;

    public void ag$a(Animator animator) {
        ah$a();
        this.toString = animator;
    }

    public void ah$a() {
        Animator animator = this.toString;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void ag$a() {
        this.toString = null;
    }
}
