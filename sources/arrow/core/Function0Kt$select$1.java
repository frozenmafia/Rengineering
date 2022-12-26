package arrow.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.runAnimators;
import o.setDefaultImpl;
import o.setDefaultImpl$ah$a;
/* loaded from: classes6.dex */
public final class Function0Kt$select$1 extends Lambda implements Styleable.ChangeBounds<setDefaultImpl<? extends A, ? extends B>, ICustomTabsCallback.Stub.Proxy<? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Default $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function0Kt$select$1(ICustomTabsCallback.Default r1) {
        super(1);
        this.$f = r1;
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Stub.Proxy<B> invoke(setDefaultImpl<? extends A, ? extends B> setdefaultimpl) {
        runAnimators.valueOf(setdefaultimpl, "it");
        if (setdefaultimpl instanceof setDefaultImpl.values) {
            return ICustomTabsCallback.Stub.Proxy.ag$a.ah$a(((setDefaultImpl.values) setdefaultimpl).ag$a());
        } else if (setdefaultimpl instanceof setDefaultImpl$ah$a) {
            return ICustomTabsCallback.Stub.Proxy.ag$a.ah$a(((setDefaultImpl$ah$a) setdefaultimpl).ah$a()).values(this.$f);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
