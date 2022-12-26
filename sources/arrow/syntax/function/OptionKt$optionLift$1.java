package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class OptionKt$optionLift$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsService.Stub.Proxy<? extends P1>, ICustomTabsService.Stub.Proxy<? extends R>> {
    final /* synthetic */ Styleable.ChangeBounds $this_optionLift;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionKt$optionLift$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$this_optionLift = changeBounds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<R> invoke(ICustomTabsService.Stub.Proxy<? extends P1> proxy) {
        runAnimators.valueOf(proxy, "it");
        return proxy.ag$a(this.$this_optionLift);
    }
}
