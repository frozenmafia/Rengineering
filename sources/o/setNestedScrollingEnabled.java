package o;

import android.animation.Animator;
import android.widget.ImageView;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
/* loaded from: classes3.dex */
public final class setNestedScrollingEnabled extends q1.toString {
    public final /* synthetic */ q1.b ah$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNestedScrollingEnabled(q1.b bVar, q1 q1Var) {
        super(q1Var);
        this.ah$a = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageView ah$a;
        ah$a = this.ah$a.ah$a();
        ah$a.setVisibility(0);
    }
}
