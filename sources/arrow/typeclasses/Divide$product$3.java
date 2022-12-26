package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Divide$product$3 extends Lambda implements Styleable.ChangeBounds<INotificationSideChannel.Stub<? extends A, ? extends B, ? extends C, ? extends D>, cancel<? extends INotificationSideChannel.Default<? extends A, ? extends B, ? extends C>, ? extends D>> {
    public static final Divide$product$3 INSTANCE = new Divide$product$3();

    Divide$product$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<INotificationSideChannel.Default<A, B, C>, D> invoke(INotificationSideChannel.Stub<? extends A, ? extends B, ? extends C, ? extends D> stub) {
        runAnimators.valueOf(stub, "it");
        return new cancel<>(new INotificationSideChannel.Default(stub.ah$b(), stub.invoke(), stub.HaptikSDK$c()), stub.HaptikSDK$a());
    }
}
