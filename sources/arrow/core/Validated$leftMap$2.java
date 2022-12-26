package arrow.core;

import kotlin.jvm.internal.FunctionReference;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class Validated$leftMap$2 extends FunctionReference implements Styleable.ChangeBounds<A, A> {
    public static final Validated$leftMap$2 INSTANCE = new Validated$leftMap$2();

    Validated$leftMap$2() {
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

    /* JADX WARN: Type inference failed for: r1v1, types: [A, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final A invoke(A a) {
        return IPostMessageService.toString(a);
    }
}
