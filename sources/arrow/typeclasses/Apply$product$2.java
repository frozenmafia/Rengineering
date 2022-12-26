package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.INotificationSideChannel;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Apply$product$2 extends Lambda implements Styleable.ChangeBounds<cancel<? extends cancel<? extends A, ? extends B>, ? extends Z>, INotificationSideChannel.Default<? extends A, ? extends B, ? extends Z>> {
    public static final Apply$product$2 INSTANCE = new Apply$product$2();

    Apply$product$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final INotificationSideChannel.Default<A, B, Z> invoke(cancel<? extends cancel<? extends A, ? extends B>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        cancel cancelVar2 = (cancel) cancelVar.valueOf();
        return new INotificationSideChannel.Default<>(cancelVar2.ag$a(), cancelVar2.ah$a(), cancelVar.values());
    }
}
