package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.INotificationSideChannel;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Divide$divide$1 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends cancel<? extends B, ? extends C>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, cancel<B, C>> invoke(Z z) {
        INotificationSideChannel.Default r3 = (INotificationSideChannel.Default) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(r3.values(), AudioAttributesImplApi21Parcelizer.ag$a(r3.valueOf(), r3.ag$a()));
    }
}
