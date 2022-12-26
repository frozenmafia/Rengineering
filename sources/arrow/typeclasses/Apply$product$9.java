package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.cancel;
import o.read;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$product$9 extends Lambda implements Styleable.ChangeBounds<cancel<? extends read<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I>, ? extends Z>, ITrustedWebActivityCallback.Stub.Proxy<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I, ? extends Z>> {
    public static final Apply$product$9 INSTANCE = new Apply$product$9();

    Apply$product$9() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback.Stub.Proxy<A, B, C, D, E, FF, G, H, I, Z> invoke(cancel<? extends read<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        read readVar = (read) cancelVar.valueOf();
        return new ITrustedWebActivityCallback.Stub.Proxy<>(readVar.HaptikSDK$e(), readVar.getInitSettings(), readVar.getSignupData(), readVar.HaptikWebView(), readVar.HaptikSDK$d(), readVar.ak(), readVar.aj$a(), readVar.a(), readVar.onXdkEvent(), cancelVar.values());
    }
}
