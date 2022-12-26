package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.cancel;
import o.read;
/* loaded from: classes6.dex */
public final class Divide$divide$8 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends A, ? extends read<? extends B, ? extends C, ? extends D, ? extends E, ? extends FF, ? extends G, ? extends H, ? extends I, ? extends J>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Divide$divide$8(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Divide$divide$8) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, read<B, C, D, E, FF, G, H, I, J>> invoke(Z z) {
        ITrustedWebActivityCallback.Stub.Proxy proxy = (ITrustedWebActivityCallback.Stub.Proxy) this.$f.invoke(z);
        return AudioAttributesImplApi21Parcelizer.ag$a(proxy.ag$a(), new read(proxy.values(), proxy.ah$a(), proxy.HaptikSDK$c(), proxy.ah$b(), proxy.HaptikSDK$b(), proxy.HaptikSDK$a(), proxy.invoke(), proxy.getInitSettings(), proxy.valueOf()));
    }
}
