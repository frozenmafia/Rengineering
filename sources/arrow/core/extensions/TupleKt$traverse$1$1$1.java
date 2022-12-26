package arrow.core.extensions;

import kotlin.jvm.internal.FunctionReference;
import o.AudioAttributesImplApi21Parcelizer;
import o.Styleable;
import o.TransitionValuesMaps;
import o.cancel;
import o.setPropagation;
/* loaded from: classes6.dex */
public final /* synthetic */ class TupleKt$traverse$1$1$1 extends FunctionReference implements Styleable.ChangeBounds<B, cancel<? extends F, ? extends B>> {
    TupleKt$traverse$1$1$1(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public final String getName() {
        return "toT";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final TransitionValuesMaps getOwner() {
        return setPropagation.values(AudioAttributesImplApi21Parcelizer.class, "arrow-core");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "toT(Ljava/lang/Object;Ljava/lang/Object;)Larrow/core/Tuple2;";
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((TupleKt$traverse$1$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<F, B> invoke(B b2) {
        return AudioAttributesImplApi21Parcelizer.ag$a(this.receiver, b2);
    }
}
