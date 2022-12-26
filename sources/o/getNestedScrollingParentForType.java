package o;

import android.animation.Animator;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
import com.google.logging.type.LogSeverity;
/* loaded from: classes3.dex */
public final class getNestedScrollingParentForType extends q1.toString {
    public final /* synthetic */ q1.c ah$a;
    public final /* synthetic */ TransitionDrawable valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNestedScrollingParentForType(TransitionDrawable transitionDrawable, q1.c cVar, q1 q1Var) {
        super(q1Var);
        this.valueOf = transitionDrawable;
        this.ah$a = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageView values;
        this.valueOf.startTransition(LogSeverity.CRITICAL_VALUE);
        values = this.ah$a.values();
        values.setVisibility(0);
    }
}
