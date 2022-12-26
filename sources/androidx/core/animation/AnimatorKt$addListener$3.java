package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class AnimatorKt$addListener$3 extends Lambda implements Styleable.ChangeBounds<Animator, setAnimationMatrix> {
    public static final AnimatorKt$addListener$3 INSTANCE = new AnimatorKt$addListener$3();

    public AnimatorKt$addListener$3() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Animator animator) {
        runAnimators.ag$a(animator, "it");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Animator animator) {
        invoke2(animator);
        return setAnimationMatrix.ag$a;
    }
}
