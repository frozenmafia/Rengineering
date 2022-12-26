package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.INotificationSideChannel;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Divide$divide$2 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends INotificationSideChannel.Default<? extends B, ? extends C, ? extends D>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$2(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$2) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, INotificationSideChannel.Default<B, C, D>> invoke(Z z) {
        INotificationSideChannel.Stub stub = (INotificationSideChannel.Stub) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(stub.values(), new INotificationSideChannel.Default(stub.ag$a(), stub.ah$a(), stub.valueOf()));
    }
}
