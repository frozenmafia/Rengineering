package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.write;
/* loaded from: classes6.dex */
public final class Divide$divide$4 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends RemoteActionCompatParcelizer<? extends B, ? extends C, ? extends D, ? extends E, ? extends FF>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$4(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$4) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, RemoteActionCompatParcelizer<B, C, D, E, FF>> invoke(Z z) {
        write writeVar = (write) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(writeVar.valueOf(), new RemoteActionCompatParcelizer(writeVar.values(), writeVar.ah$a(), writeVar.ag$a(), writeVar.HaptikSDK$c(), writeVar.invoke()));
    }
}
