package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
import o.write;
/* loaded from: classes6.dex */
public final class Apply$product$5 extends Lambda implements Styleable.ChangeBounds<cancel<? extends RemoteActionCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>, ? extends Z>, write<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends Z>> {
    public static final Apply$product$5 INSTANCE = new Apply$product$5();

    Apply$product$5() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final write<A, B, C, D, E, Z> invoke(cancel<? extends RemoteActionCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) cancelVar.valueOf();
        return new write<>(remoteActionCompatParcelizer.ah$b(), remoteActionCompatParcelizer.HaptikSDK$a(), remoteActionCompatParcelizer.HaptikSDK$b(), remoteActionCompatParcelizer.HaptikSDK$c(), remoteActionCompatParcelizer.HaptikSDK$d(), cancelVar.values());
    }
}
