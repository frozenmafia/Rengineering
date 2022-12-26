package arrow.typeclasses;

import kotlin.jvm.internal.FunctionReference;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.runAnimators;
import o.setDefaultImpl;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class Decidable$choose$35 extends FunctionReference implements Styleable.ChangeBounds<setDefaultImpl<? extends C, ? extends setDefaultImpl<? extends D, ? extends setDefaultImpl<? extends E, ? extends setDefaultImpl<? extends FF, ? extends setDefaultImpl<? extends G, ? extends setDefaultImpl<? extends H, ? extends setDefaultImpl<? extends I, ? extends J>>>>>>>, setDefaultImpl<? extends C, ? extends setDefaultImpl<? extends D, ? extends setDefaultImpl<? extends E, ? extends setDefaultImpl<? extends FF, ? extends setDefaultImpl<? extends G, ? extends setDefaultImpl<? extends H, ? extends setDefaultImpl<? extends I, ? extends J>>>>>>>> {
    public static final Decidable$choose$35 INSTANCE = new Decidable$choose$35();

    Decidable$choose$35() {
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
    public final setDefaultImpl<C, setDefaultImpl<D, setDefaultImpl<E, setDefaultImpl<FF, setDefaultImpl<G, setDefaultImpl<H, setDefaultImpl<I, J>>>>>>> invoke(setDefaultImpl<? extends C, ? extends setDefaultImpl<? extends D, ? extends setDefaultImpl<? extends E, ? extends setDefaultImpl<? extends FF, ? extends setDefaultImpl<? extends G, ? extends setDefaultImpl<? extends H, ? extends setDefaultImpl<? extends I, ? extends J>>>>>>> setdefaultimpl) {
        runAnimators.valueOf(setdefaultimpl, "p1");
        return (setDefaultImpl) IPostMessageService.toString(setdefaultimpl);
    }
}
