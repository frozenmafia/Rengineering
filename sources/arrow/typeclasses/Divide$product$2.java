package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.INotificationSideChannel;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Divide$product$2 extends Lambda implements Styleable.ChangeBounds<INotificationSideChannel.Default<? extends A, ? extends B, ? extends C>, cancel<? extends cancel<? extends A, ? extends B>, ? extends C>> {
    public static final Divide$product$2 INSTANCE = new Divide$product$2();

    Divide$product$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<cancel<A, B>, C> invoke(INotificationSideChannel.Default<? extends A, ? extends B, ? extends C> r4) {
        runAnimators.valueOf(r4, "it");
        return new cancel<>(AudioAttributesImplApi21Parcelizer.ag$a(r4.ah$a(), r4.HaptikSDK$a()), r4.HaptikSDK$c());
    }
}
