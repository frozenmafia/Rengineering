package o;

import android.animation.Animator;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
import com.google.logging.type.LogSeverity;
/* loaded from: classes3.dex */
public final class isFromSource extends q1.toString {
    public final /* synthetic */ TransitionDrawable toString;
    public final /* synthetic */ q1.b values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isFromSource(TransitionDrawable transitionDrawable, q1.b bVar, q1 q1Var) {
        super(q1Var);
        this.toString = transitionDrawable;
        this.values = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageView ah$a;
        this.toString.startTransition(LogSeverity.CRITICAL_VALUE);
        ah$a = this.values.ah$a();
        ah$a.setVisibility(0);
    }
}
