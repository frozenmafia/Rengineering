package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.Styleable;
/* loaded from: classes6.dex */
public final class OptionSemigroupK$combineK$1 extends Lambda implements Styleable.ArcMotion<ICustomTabsService.Stub.Proxy<? extends A>> {
    final /* synthetic */ ICustomTabsCallback.Default $y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSemigroupK$combineK$1(ICustomTabsCallback.Default r1) {
        super(0);
        this.$y = r1;
    }

    @Override // o.Styleable.ArcMotion
    public final ICustomTabsService.Stub.Proxy<A> invoke() {
        return (ICustomTabsService.Stub.Proxy) this.$y;
    }
}
