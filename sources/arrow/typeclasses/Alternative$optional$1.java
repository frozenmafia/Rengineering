package arrow.typeclasses;

import kotlin.jvm.internal.FunctionReference;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.TransitionValuesMaps;
import o.setPropagation;
/* loaded from: classes6.dex */
public final /* synthetic */ class Alternative$optional$1 extends FunctionReference implements Styleable.ChangeBounds<A, ITrustedWebActivityCallback<? extends A>> {
    public static final Alternative$optional$1 INSTANCE = new Alternative$optional$1();

    Alternative$optional$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final TransitionValuesMaps getOwner() {
        return setPropagation.values(ITrustedWebActivityCallback.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;)V";
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Alternative$optional$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback<A> invoke(A a) {
        return new ITrustedWebActivityCallback<>(a);
    }
}
