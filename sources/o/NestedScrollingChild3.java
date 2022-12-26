package o;

import android.animation.Animator;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
import com.google.logging.type.LogSeverity;
/* loaded from: classes3.dex */
public final class NestedScrollingChild3 extends q1.toString {
    public final /* synthetic */ q1.b ag$a;
    public final /* synthetic */ TransitionDrawable values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollingChild3(TransitionDrawable transitionDrawable, q1.b bVar, q1 q1Var) {
        super(q1Var);
        this.values = transitionDrawable;
        this.ag$a = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageView ah$a;
        this.values.startTransition(LogSeverity.CRITICAL_VALUE);
        ah$a = this.ag$a.ah$a();
        ah$a.setVisibility(0);
    }
}
