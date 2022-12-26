package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.Transition;
import o.asBinder;
/* loaded from: classes6.dex */
public final class Option$foldRight$$inlined$let$lambda$1 extends Lambda implements Styleable.ArcMotion<asBinder<? extends B>> {
    final /* synthetic */ asBinder $initial$inlined;
    final /* synthetic */ Transition $operation$inlined;
    final /* synthetic */ ICustomTabsService.Stub.Proxy $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Option$foldRight$$inlined$let$lambda$1(ICustomTabsService.Stub.Proxy proxy, Transition transition, asBinder asbinder) {
        super(0);
        this.$option = proxy;
        this.$operation$inlined = transition;
        this.$initial$inlined = asbinder;
    }

    @Override // o.Styleable.ArcMotion
    public final asBinder<B> invoke() {
        return (asBinder) this.$operation$inlined.invoke(((ITrustedWebActivityCallback) this.$option).ag$a(), this.$initial$inlined);
    }
}
