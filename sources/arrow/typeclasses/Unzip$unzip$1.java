package arrow.typeclasses;

import kotlin.jvm.internal.FunctionReference;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.cancel;
import o.runAnimators;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class Unzip$unzip$1 extends FunctionReference implements Styleable.ChangeBounds<cancel<? extends A, ? extends B>, cancel<? extends A, ? extends B>> {
    public static final Unzip$unzip$1 INSTANCE = new Unzip$unzip$1();

    Unzip$unzip$1() {
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
    public final cancel<A, B> invoke(cancel<? extends A, ? extends B> cancelVar) {
        runAnimators.valueOf(cancelVar, "p1");
        return (cancel) IPostMessageService.toString(cancelVar);
    }
}
