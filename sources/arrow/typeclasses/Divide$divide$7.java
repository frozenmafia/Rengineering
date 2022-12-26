package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.IconCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.read;
/* loaded from: classes6.dex */
public final class Divide$divide$7 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends IconCompatParcelizer<? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$7(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$7) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, IconCompatParcelizer<B, C, D, E, FF, G, H, I>> invoke(Z z) {
        read readVar = (read) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(readVar.values(), new IconCompatParcelizer(readVar.ah$a(), readVar.ag$a(), readVar.valueOf(), readVar.invoke(), readVar.HaptikSDK$b(), readVar.HaptikSDK$c(), readVar.HaptikSDK$a(), readVar.ah$b()));
    }
}
