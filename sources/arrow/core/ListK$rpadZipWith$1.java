package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListK$rpadZipWith$1 extends Lambda implements Transition<ICustomTabsService.Stub.Proxy<? extends B>, A, C> {
    final /* synthetic */ Transition $fa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListK$rpadZipWith$1(Transition transition) {
        super(2);
        this.$fa = transition;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ICustomTabsService.Stub.Proxy) obj, (ICustomTabsService.Stub.Proxy) obj2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [C, java.lang.Object] */
    public final C invoke(ICustomTabsService.Stub.Proxy<? extends B> proxy, A a) {
        runAnimators.valueOf(proxy, "a");
        return this.$fa.invoke(a, proxy);
    }
}
