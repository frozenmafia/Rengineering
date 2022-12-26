package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
import o.write;
/* loaded from: classes6.dex */
public final class Divide$product$6 extends Lambda implements Styleable.ChangeBounds<AudioAttributesCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G>, cancel<? extends write<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF>, ? extends G>> {
    public static final Divide$product$6 INSTANCE = new Divide$product$6();

    Divide$product$6() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<write<A, B, C, D, E, FF>, G> invoke(AudioAttributesCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G> audioAttributesCompatParcelizer) {
        runAnimators.valueOf(audioAttributesCompatParcelizer, "it");
        return new cancel<>(new write(audioAttributesCompatParcelizer.HaptikSDK$a(), audioAttributesCompatParcelizer.HaptikSDK$b(), audioAttributesCompatParcelizer.getSignupData(), audioAttributesCompatParcelizer.HaptikWebView(), audioAttributesCompatParcelizer.HaptikSDK$d(), audioAttributesCompatParcelizer.HaptikSDK$e()), audioAttributesCompatParcelizer.getInitSettings());
    }
}
