package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class TransitionKt$addListener$5 extends Lambda implements Styleable.ChangeBounds<Transition, setAnimationMatrix> {
    public static final TransitionKt$addListener$5 INSTANCE = new TransitionKt$addListener$5();

    public TransitionKt$addListener$5() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Transition transition) {
        runAnimators.ag$a(transition, "it");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Transition transition) {
        invoke2(transition);
        return setAnimationMatrix.ag$a;
    }
}
