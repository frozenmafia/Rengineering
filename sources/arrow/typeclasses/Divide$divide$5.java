package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesCompatParcelizer;
import o.AudioAttributesImplApi21Parcelizer;
import o.Styleable;
import o.cancel;
import o.write;
/* loaded from: classes6.dex */
public final class Divide$divide$5 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends write<? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$5(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$5) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, write<B, C, D, E, FF, G>> invoke(Z z) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(audioAttributesCompatParcelizer.ah$a(), new write(audioAttributesCompatParcelizer.valueOf(), audioAttributesCompatParcelizer.ag$a(), audioAttributesCompatParcelizer.values(), audioAttributesCompatParcelizer.ah$b(), audioAttributesCompatParcelizer.HaptikSDK$c(), audioAttributesCompatParcelizer.invoke()));
    }
}
