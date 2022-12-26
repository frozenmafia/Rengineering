package o;

import android.animation.Animator;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
/* loaded from: classes3.dex */
public final class startNestedScroll extends q1.toString {
    public final /* synthetic */ q1.b valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public startNestedScroll(q1.b bVar, q1 q1Var) {
        super(q1Var);
        this.valueOf = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        androidx.appcompat.widget.AppCompatButton values;
        values = this.valueOf.values();
        values.setVisibility(0);
    }
}
