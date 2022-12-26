package o;

import android.animation.Animator;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
/* loaded from: classes3.dex */
public final class setNestedScrollingParentForType extends q1.toString {
    public final /* synthetic */ q1.c toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNestedScrollingParentForType(q1.c cVar, q1 q1Var) {
        super(q1Var);
        this.toString = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        androidx.appcompat.widget.AppCompatButton ah$a;
        ah$a = this.toString.ah$a();
        ah$a.setVisibility(0);
    }
}
