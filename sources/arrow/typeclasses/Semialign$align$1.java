package arrow.typeclasses;

import kotlin.jvm.internal.FunctionReference;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.postMessage;
import o.runAnimators;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class Semialign$align$1 extends FunctionReference implements Styleable.ChangeBounds<postMessage<? extends A, ? extends B>, postMessage<? extends A, ? extends B>> {
    public static final Semialign$align$1 INSTANCE = new Semialign$align$1();

    Semialign$align$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public final String getName() {
        return HTTP.IDENTITY_CODING;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final TransitionValuesMaps getOwner() {
        return setPropagation.values(IPostMessageService.class, "arrow-core-data");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
    }

    @Override // o.Styleable.ChangeBounds
    public final postMessage<A, B> invoke(postMessage<? extends A, ? extends B> postmessage) {
        runAnimators.valueOf(postmessage, "p1");
        return (postMessage) IPostMessageService.toString(postmessage);
    }
}
