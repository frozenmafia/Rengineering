package arrow.core;

import kotlin.jvm.internal.FunctionReference;
import o.ICustomTabsCallback;
import o.IPostMessageService;
import o.Styleable;
import o.TransitionValuesMaps;
import o.runAnimators;
import o.setPropagation;
import org.apache.http.protocol.HTTP;
/* loaded from: classes6.dex */
public final /* synthetic */ class MapKKt$sequence$1 extends FunctionReference implements Styleable.ChangeBounds<ICustomTabsCallback.Default<? extends G, ? extends V>, ICustomTabsCallback.Default<? extends G, ? extends V>> {
    public static final MapKKt$sequence$1 INSTANCE = new MapKKt$sequence$1();

    MapKKt$sequence$1() {
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
    public final ICustomTabsCallback.Default<G, V> invoke(ICustomTabsCallback.Default<? extends G, ? extends V> r2) {
        runAnimators.valueOf(r2, "p1");
        return (ICustomTabsCallback.Default) IPostMessageService.toString(r2);
    }
}
