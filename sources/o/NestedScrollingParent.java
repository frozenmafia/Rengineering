package o;

import android.animation.Animator;
import android.widget.ImageView;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
/* loaded from: classes3.dex */
public final class NestedScrollingParent extends q1.toString {
    public final /* synthetic */ q1.c ag$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollingParent(q1.c cVar, q1 q1Var) {
        super(q1Var);
        this.ag$a = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageView values;
        values = this.ag$a.values();
        values.setVisibility(0);
    }
}
