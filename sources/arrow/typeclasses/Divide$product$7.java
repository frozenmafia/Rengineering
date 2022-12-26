package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesCompatParcelizer;
import o.IconCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Divide$product$7 extends Lambda implements Styleable.ChangeBounds<IconCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H>, cancel<? extends AudioAttributesCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G>, ? extends H>> {
    public static final Divide$product$7 INSTANCE = new Divide$product$7();

    Divide$product$7() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<AudioAttributesCompatParcelizer<A, B, C, D, E, FF, G>, H> invoke(IconCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H> iconCompatParcelizer) {
        runAnimators.valueOf(iconCompatParcelizer, "it");
        return new cancel<>(new AudioAttributesCompatParcelizer(iconCompatParcelizer.HaptikSDK$a(), iconCompatParcelizer.HaptikSDK$e(), iconCompatParcelizer.HaptikWebView(), iconCompatParcelizer.getSignupData(), iconCompatParcelizer.getInitSettings(), iconCompatParcelizer.HaptikSDK$d(), iconCompatParcelizer.isLogoutPending()), iconCompatParcelizer.ak());
    }
}
