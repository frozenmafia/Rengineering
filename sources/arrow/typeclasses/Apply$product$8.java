package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.IconCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.read;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$product$8 extends Lambda implements Styleable.ChangeBounds<cancel<? extends IconCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H>, ? extends Z>, read<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends Z>> {
    public static final Apply$product$8 INSTANCE = new Apply$product$8();

    Apply$product$8() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final read<A, B, C, D, E, FF, G, H, Z> invoke(cancel<? extends IconCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) cancelVar.valueOf();
        return new read<>(iconCompatParcelizer.HaptikSDK$a(), iconCompatParcelizer.HaptikSDK$e(), iconCompatParcelizer.HaptikWebView(), iconCompatParcelizer.getSignupData(), iconCompatParcelizer.getInitSettings(), iconCompatParcelizer.HaptikSDK$d(), iconCompatParcelizer.isLogoutPending(), iconCompatParcelizer.ak(), cancelVar.values());
    }
}
