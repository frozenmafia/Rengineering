package arrow.typeclasses;

import kotlin.jvm.internal.FunctionReference;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class RightFunctor$map$1$1 extends FunctionReference implements Styleable.ChangeBounds<X, X> {
    public static final RightFunctor$map$1$1 INSTANCE = new RightFunctor$map$1$1();

    RightFunctor$map$1$1() {
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

    /* JADX WARN: Type inference failed for: r1v1, types: [X, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final X invoke(X x) {
        return IPostMessageService.toString(x);
    }
}
