package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.postMessage;
/* loaded from: classes6.dex */
public final class IorCrosswalk$crosswalk$$inlined$run$lambda$1 extends Lambda implements Styleable.ChangeBounds<B, postMessage.valueOf<? extends L, ? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $fa$inlined;
    final /* synthetic */ postMessage $ior$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IorCrosswalk$crosswalk$$inlined$run$lambda$1(Styleable.ChangeBounds changeBounds, postMessage postmessage) {
        super(1);
        this.$fa$inlined = changeBounds;
        this.$ior$inlined = postmessage;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((IorCrosswalk$crosswalk$$inlined$run$lambda$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final postMessage.valueOf<L, B> invoke(B b2) {
        return new postMessage.valueOf<>(((postMessage.valueOf) this.$ior$inlined).values(), b2);
    }
}
