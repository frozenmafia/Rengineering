package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Divide$product$4 extends Lambda implements Styleable.ChangeBounds<RemoteActionCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>, cancel<? extends INotificationSideChannel.Stub<? extends A, ? extends B, ? extends C, ? extends D>, ? extends E>> {
    public static final Divide$product$4 INSTANCE = new Divide$product$4();

    Divide$product$4() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<INotificationSideChannel.Stub<A, B, C, D>, E> invoke(RemoteActionCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E> remoteActionCompatParcelizer) {
        runAnimators.valueOf(remoteActionCompatParcelizer, "it");
        return new cancel<>(new INotificationSideChannel.Stub(remoteActionCompatParcelizer.ah$b(), remoteActionCompatParcelizer.HaptikSDK$a(), remoteActionCompatParcelizer.HaptikSDK$b(), remoteActionCompatParcelizer.HaptikSDK$c()), remoteActionCompatParcelizer.HaptikSDK$d());
    }
}
