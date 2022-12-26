package arrow.core;

import kotlin.jvm.internal.FunctionReference;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.runAnimators;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class ListK$lpadZipWith$2 extends FunctionReference implements Styleable.ChangeBounds<ICustomTabsService.Stub.Proxy<? extends C>, ICustomTabsService.Stub.Proxy<? extends C>> {
    public static final ListK$lpadZipWith$2 INSTANCE = new ListK$lpadZipWith$2();

    ListK$lpadZipWith$2() {
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
    public final ICustomTabsService.Stub.Proxy<C> invoke(ICustomTabsService.Stub.Proxy<? extends C> proxy) {
        runAnimators.valueOf(proxy, "p1");
        return (ICustomTabsService.Stub.Proxy) IPostMessageService.toString(proxy);
    }
}
