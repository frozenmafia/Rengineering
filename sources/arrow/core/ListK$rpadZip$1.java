package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.ICustomTabsService;
import o.Transition;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListK$rpadZip$1 extends Lambda implements Transition<A, ICustomTabsService.Stub.Proxy<? extends B>, cancel<? extends A, ? extends ICustomTabsService.Stub.Proxy<? extends B>>> {
    public static final ListK$rpadZip$1 INSTANCE = new ListK$rpadZip$1();

    ListK$rpadZip$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ListK$rpadZip$1) obj, (ICustomTabsService.Stub.Proxy) obj2);
    }

    public final cancel<A, ICustomTabsService.Stub.Proxy<B>> invoke(A a, ICustomTabsService.Stub.Proxy<? extends B> proxy) {
        runAnimators.valueOf(proxy, "b");
        return AudioAttributesImplApi21Parcelizer.ag$a(a, proxy);
    }
}
