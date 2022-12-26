package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$product$4 extends Lambda implements Styleable.ChangeBounds<cancel<? extends INotificationSideChannel.Stub<? extends A, ? extends B, ? extends C, ? extends D>, ? extends Z>, RemoteActionCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends Z>> {
    public static final Apply$product$4 INSTANCE = new Apply$product$4();

    Apply$product$4() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RemoteActionCompatParcelizer<A, B, C, D, Z> invoke(cancel<? extends INotificationSideChannel.Stub<? extends A, ? extends B, ? extends C, ? extends D>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        INotificationSideChannel.Stub stub = (INotificationSideChannel.Stub) cancelVar.valueOf();
        return new RemoteActionCompatParcelizer<>(stub.ah$b(), stub.invoke(), stub.HaptikSDK$c(), stub.HaptikSDK$a(), cancelVar.values());
    }
}
