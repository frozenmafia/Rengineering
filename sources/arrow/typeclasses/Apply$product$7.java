package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesCompatParcelizer;
import o.IconCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$product$7 extends Lambda implements Styleable.ChangeBounds<cancel<? extends AudioAttributesCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G>, ? extends Z>, IconCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends Z>> {
    public static final Apply$product$7 INSTANCE = new Apply$product$7();

    Apply$product$7() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final IconCompatParcelizer<A, B, C, D, E, FF, G, Z> invoke(cancel<? extends AudioAttributesCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) cancelVar.valueOf();
        return new IconCompatParcelizer<>(audioAttributesCompatParcelizer.HaptikSDK$a(), audioAttributesCompatParcelizer.HaptikSDK$b(), audioAttributesCompatParcelizer.getSignupData(), audioAttributesCompatParcelizer.HaptikWebView(), audioAttributesCompatParcelizer.HaptikSDK$d(), audioAttributesCompatParcelizer.HaptikSDK$e(), audioAttributesCompatParcelizer.getInitSettings(), cancelVar.values());
    }
}
