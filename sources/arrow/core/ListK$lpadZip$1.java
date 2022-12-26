package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.ICustomTabsService;
import o.Transition;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListK$lpadZip$1 extends Lambda implements Transition<ICustomTabsService.Stub.Proxy<? extends A>, B, cancel<? extends ICustomTabsService.Stub.Proxy<? extends A>, ? extends B>> {
    public static final ListK$lpadZip$1 INSTANCE = new ListK$lpadZip$1();

    ListK$lpadZip$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ICustomTabsService.Stub.Proxy) obj, (ICustomTabsService.Stub.Proxy) obj2);
    }

    public final cancel<ICustomTabsService.Stub.Proxy<A>, B> invoke(ICustomTabsService.Stub.Proxy<? extends A> proxy, B b2) {
        runAnimators.valueOf(proxy, "a");
        return AudioAttributesImplApi21Parcelizer.ag$a(proxy, b2);
    }
}
