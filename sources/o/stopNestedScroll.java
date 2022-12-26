package o;

import android.animation.Animator;
import android.widget.ImageView;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
/* loaded from: classes3.dex */
public final class stopNestedScroll extends q1.toString {
    public final /* synthetic */ q1.c values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stopNestedScroll(q1.c cVar, q1 q1Var) {
        super(q1Var);
        this.values = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageView values;
        values = this.values.values();
        values.setVisibility(0);
    }
}
