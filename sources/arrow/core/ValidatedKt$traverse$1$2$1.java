package arrow.core;

import kotlin.jvm.internal.FunctionReference;
import o.Styleable;
import o.TransitionValuesMaps;
import o.disconnect;
/* loaded from: classes6.dex */
public final /* synthetic */ class ValidatedKt$traverse$1$2$1 extends FunctionReference implements Styleable.ChangeBounds<B, disconnect.valueOf<? extends B>> {
    public static final ValidatedKt$traverse$1$2$1 INSTANCE = new ValidatedKt$traverse$1$2$1();

    ValidatedKt$traverse$1$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final TransitionValuesMaps getOwner() {
        return null;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;)V";
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ValidatedKt$traverse$1$2$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final disconnect.valueOf<B> invoke(B b2) {
        return new disconnect.valueOf<>(b2);
    }
}
