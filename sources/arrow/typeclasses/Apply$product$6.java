package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesCompatParcelizer;
import o.Styleable;
import o.cancel;
import o.runAnimators;
import o.write;
/* loaded from: classes6.dex */
public final class Apply$product$6 extends Lambda implements Styleable.ChangeBounds<cancel<? extends write<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF>, ? extends Z>, AudioAttributesCompatParcelizer<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends Z>> {
    public static final Apply$product$6 INSTANCE = new Apply$product$6();

    Apply$product$6() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AudioAttributesCompatParcelizer<A, B, C, D, E, FF, Z> invoke(cancel<? extends write<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends FF>, ? extends Z> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        write writeVar = (write) cancelVar.valueOf();
        return new AudioAttributesCompatParcelizer<>(writeVar.HaptikSDK$a(), writeVar.HaptikSDK$b(), writeVar.ah$b(), writeVar.HaptikSDK$d(), writeVar.getSignupData(), writeVar.HaptikWebView(), cancelVar.values());
    }
}
