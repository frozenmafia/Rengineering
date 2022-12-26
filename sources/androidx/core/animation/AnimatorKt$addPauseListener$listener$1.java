package androidx.core.animation;

import android.animation.Animator;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class AnimatorKt$addPauseListener$listener$1 implements Animator.AnimatorPauseListener {
    final /* synthetic */ Styleable.ChangeBounds<Animator, setAnimationMatrix> $onPause;
    final /* synthetic */ Styleable.ChangeBounds<Animator, setAnimationMatrix> $onResume;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addPauseListener$listener$1(Styleable.ChangeBounds<? super Animator, setAnimationMatrix> changeBounds, Styleable.ChangeBounds<? super Animator, setAnimationMatrix> changeBounds2) {
        this.$onPause = changeBounds;
        this.$onResume = changeBounds2;
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        runAnimators.ag$a(animator, "animator");
        this.$onPause.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        runAnimators.ag$a(animator, "animator");
        this.$onResume.invoke(animator);
    }
}
