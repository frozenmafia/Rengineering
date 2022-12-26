package o;

import android.animation.Animator;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageButton;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
import com.google.logging.type.LogSeverity;
/* loaded from: classes3.dex */
public final class getDialogKeyListenerPre28 extends q1.toString {
    public final /* synthetic */ TransitionDrawable ah$a;
    public final /* synthetic */ q1.e values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDialogKeyListenerPre28(q1.e eVar, TransitionDrawable transitionDrawable, q1 q1Var) {
        super(q1Var);
        this.values = eVar;
        this.ah$a = transitionDrawable;
    }

    @Override // com.appsamurai.storyly.storylypresenter.storylylayer.q1.toString, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.ah$a.startTransition(LogSeverity.CRITICAL_VALUE);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ImageButton values;
        values = this.values.values();
        values.setVisibility(0);
    }
}
