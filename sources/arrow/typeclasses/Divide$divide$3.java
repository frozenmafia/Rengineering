package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.INotificationSideChannel;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class Divide$divide$3 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends INotificationSideChannel.Stub<? extends B, ? extends C, ? extends D, ? extends E>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$3(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$3) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, INotificationSideChannel.Stub<B, C, D, E>> invoke(Z z) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(remoteActionCompatParcelizer.ag$a(), new INotificationSideChannel.Stub(remoteActionCompatParcelizer.ah$a(), remoteActionCompatParcelizer.values(), remoteActionCompatParcelizer.valueOf(), remoteActionCompatParcelizer.invoke()));
    }
}
