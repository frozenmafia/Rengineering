package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.cancel;
import o.read;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Divide$product$9 extends Lambda implements Styleable.ChangeBounds<ITrustedWebActivityCallback.Stub.Proxy<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I, ? extends J>, cancel<? extends read<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I>, ? extends J>> {
    public static final Divide$product$9 INSTANCE = new Divide$product$9();

    Divide$product$9() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<read<A, B, C, D, E, FF, G, H, I>, J> invoke(ITrustedWebActivityCallback.Stub.Proxy<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I, ? extends J> proxy) {
        runAnimators.valueOf(proxy, "it");
        return new cancel<>(new read(proxy.HaptikSDK$e(), proxy.HaptikSDK$d(), proxy.HaptikWebView(), proxy.getSignupData(), proxy.ak(), proxy.aj$a(), proxy.isLogoutPending(), proxy.onXdkEvent(), proxy.a()), proxy.extraCallbackWithResult());
    }
}
