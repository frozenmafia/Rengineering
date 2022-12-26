package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
import o.write;
/* loaded from: classes6.dex */
public final class Divide$product$5 extends Lambda implements Styleable.ChangeBounds<write<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF>, cancel<? extends RemoteActionCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>, ? extends FF>> {
    public static final Divide$product$5 INSTANCE = new Divide$product$5();

    Divide$product$5() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<RemoteActionCompatParcelizer<A, B, C, D, E>, FF> invoke(write<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF> writeVar) {
        runAnimators.valueOf(writeVar, "it");
        return new cancel<>(new RemoteActionCompatParcelizer(writeVar.HaptikSDK$a(), writeVar.HaptikSDK$b(), writeVar.ah$b(), writeVar.HaptikSDK$d(), writeVar.getSignupData()), writeVar.HaptikWebView());
    }
}
