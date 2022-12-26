package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.IconCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.read;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Divide$product$8 extends Lambda implements Styleable.ChangeBounds<read<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I>, cancel<? extends IconCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H>, ? extends I>> {
    public static final Divide$product$8 INSTANCE = new Divide$product$8();

    Divide$product$8() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<IconCompatParcelizer<A, B, C, D, E, FF, G, H>, I> invoke(read<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I> readVar) {
        runAnimators.valueOf(readVar, "it");
        return new cancel<>(new IconCompatParcelizer(readVar.HaptikSDK$e(), readVar.getInitSettings(), readVar.getSignupData(), readVar.HaptikWebView(), readVar.HaptikSDK$d(), readVar.ak(), readVar.aj$a(), readVar.a()), readVar.onXdkEvent());
    }
}
