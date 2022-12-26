package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$product$3 extends Lambda implements Styleable.ChangeBounds<cancel<? extends INotificationSideChannel.Default<? extends A, ? extends B, ? extends C>, ? extends Z>, INotificationSideChannel.Stub<? extends A, ? extends B, ? extends C, ? extends Z>> {
    public static final Apply$product$3 INSTANCE = new Apply$product$3();

    Apply$product$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final INotificationSideChannel.Stub<A, B, C, Z> invoke(cancel<? extends INotificationSideChannel.Default<? extends A, ? extends B, ? extends C>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        INotificationSideChannel.Default r0 = (INotificationSideChannel.Default) cancelVar.valueOf();
        return new INotificationSideChannel.Stub<>(r0.ah$a(), r0.HaptikSDK$a(), r0.HaptikSDK$c(), cancelVar.values());
    }
}
