package androidx.core.animation;

import android.animation.Animator;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ Styleable.ChangeBounds<Animator, setAnimationMatrix> $onCancel;
    final /* synthetic */ Styleable.ChangeBounds<Animator, setAnimationMatrix> $onEnd;
    final /* synthetic */ Styleable.ChangeBounds<Animator, setAnimationMatrix> $onRepeat;
    final /* synthetic */ Styleable.ChangeBounds<Animator, setAnimationMatrix> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(Styleable.ChangeBounds<? super Animator, setAnimationMatrix> changeBounds, Styleable.ChangeBounds<? super Animator, setAnimationMatrix> changeBounds2, Styleable.ChangeBounds<? super Animator, setAnimationMatrix> changeBounds3, Styleable.ChangeBounds<? super Animator, setAnimationMatrix> changeBounds4) {
        this.$onRepeat = changeBounds;
        this.$onEnd = changeBounds2;
        this.$onCancel = changeBounds3;
        this.$onStart = changeBounds4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        runAnimators.ag$a(animator, "animator");
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        runAnimators.ag$a(animator, "animator");
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        runAnimators.ag$a(animator, "animator");
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        runAnimators.ag$a(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
