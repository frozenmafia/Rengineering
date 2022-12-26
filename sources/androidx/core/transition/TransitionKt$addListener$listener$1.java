package androidx.core.transition;

import android.transition.Transition;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ Styleable.ChangeBounds<Transition, setAnimationMatrix> $onCancel;
    final /* synthetic */ Styleable.ChangeBounds<Transition, setAnimationMatrix> $onEnd;
    final /* synthetic */ Styleable.ChangeBounds<Transition, setAnimationMatrix> $onPause;
    final /* synthetic */ Styleable.ChangeBounds<Transition, setAnimationMatrix> $onResume;
    final /* synthetic */ Styleable.ChangeBounds<Transition, setAnimationMatrix> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(Styleable.ChangeBounds<? super Transition, setAnimationMatrix> changeBounds, Styleable.ChangeBounds<? super Transition, setAnimationMatrix> changeBounds2, Styleable.ChangeBounds<? super Transition, setAnimationMatrix> changeBounds3, Styleable.ChangeBounds<? super Transition, setAnimationMatrix> changeBounds4, Styleable.ChangeBounds<? super Transition, setAnimationMatrix> changeBounds5) {
        this.$onEnd = changeBounds;
        this.$onResume = changeBounds2;
        this.$onPause = changeBounds3;
        this.$onCancel = changeBounds4;
        this.$onStart = changeBounds5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        runAnimators.ag$a(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        runAnimators.ag$a(transition, "transition");
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        runAnimators.ag$a(transition, "transition");
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        runAnimators.ag$a(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        runAnimators.ag$a(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
