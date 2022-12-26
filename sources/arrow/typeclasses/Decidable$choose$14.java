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
public final /* synthetic */ class Decidable$choose$14 extends FunctionReference implements Styleable.ChangeBounds<setDefaultImpl<? extends C, ? extends setDefaultImpl<? extends D, ? extends setDefaultImpl<? extends E, ? extends setDefaultImpl<? extends FF, ? extends G>>>>, setDefaultImpl<? extends C, ? extends setDefaultImpl<? extends D, ? extends setDefaultImpl<? extends E, ? extends setDefaultImpl<? extends FF, ? extends G>>>>> {
    public static final Decidable$choose$14 INSTANCE = new Decidable$choose$14();

    Decidable$choose$14() {
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
    public final setDefaultImpl<C, setDefaultImpl<D, setDefaultImpl<E, setDefaultImpl<FF, G>>>> invoke(setDefaultImpl<? extends C, ? extends setDefaultImpl<? extends D, ? extends setDefaultImpl<? extends E, ? extends setDefaultImpl<? extends FF, ? extends G>>>> setdefaultimpl) {
        runAnimators.valueOf(setdefaultimpl, "p1");
        return (setDefaultImpl) IPostMessageService.toString(setdefaultimpl);
    }
}
