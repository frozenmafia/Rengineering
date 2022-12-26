package arrow.typeclasses;

import kotlin.jvm.internal.FunctionReference;
import o.ICustomTabsCallback;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.runAnimators;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class Bicrosswalk$bisequenceL$2 extends FunctionReference implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends F, ? extends B>, ICustomTabsCallback.Default<? extends F, ? extends B>> {
    public static final Bicrosswalk$bisequenceL$2 INSTANCE = new Bicrosswalk$bisequenceL$2();

    Bicrosswalk$bisequenceL$2() {
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
    public final ICustomTabsCallback.Default<F, B> invoke(ICustomTabsCallback.Default<? extends F, ? extends B> r2) {
        runAnimators.valueOf(r2, "p1");
        return (ICustomTabsCallback.Default) IPostMessageService.toString(r2);
    }
}
