package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesCompatParcelizer;
import o.AudioAttributesImplApi21Parcelizer;
import o.IconCompatParcelizer;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Divide$divide$6 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends AudioAttributesCompatParcelizer<? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$6(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$6) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, AudioAttributesCompatParcelizer<B, C, D, E, FF, G, H>> invoke(Z z) {
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(iconCompatParcelizer.ah$a(), new AudioAttributesCompatParcelizer(iconCompatParcelizer.ag$a(), iconCompatParcelizer.values(), iconCompatParcelizer.valueOf(), iconCompatParcelizer.invoke(), iconCompatParcelizer.ah$b(), iconCompatParcelizer.HaptikSDK$b(), iconCompatParcelizer.HaptikSDK$c()));
    }
}
