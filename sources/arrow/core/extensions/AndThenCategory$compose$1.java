package arrow.core.extensions;

import kotlin.jvm.internal.FunctionReference;
import o.ICustomTabsCallback;
import o.Styleable;
import o.TransitionValuesMaps;
import o.onNavigationEvent;
import o.runAnimators;
import o.setPropagation;
/* loaded from: classes6.dex */
public final /* synthetic */ class AndThenCategory$compose$1 extends FunctionReference implements Styleable.ChangeBounds<A, B> {
    AndThenCategory$compose$1(ICustomTabsCallback.Default r2) {
        super(1, r2);
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public final String getName() {
        return "invoke";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final TransitionValuesMaps getOwner() {
        return setPropagation.values(onNavigationEvent.class, "arrow-core");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "invoke(Larrow/Kind;Ljava/lang/Object;)Ljava/lang/Object;";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(A a) {
        return runAnimators.valueOf((ICustomTabsCallback.Default) this.receiver, "$this$invoke");
    }
}
