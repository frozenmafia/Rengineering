package arrow.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.onTransact;
import o.runAnimators;
import o.setDefaultImpl;
import o.setDefaultImpl$ah$a;
/* loaded from: classes6.dex */
public final class IdKt$select$1 extends Lambda implements Styleable.ChangeBounds<setDefaultImpl<? extends A, ? extends B>, onTransact<? extends B>> {
    final /* synthetic */ ICustomTabsCallback.Default $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdKt$select$1(ICustomTabsCallback.Default r1) {
        super(1);
        this.$f = r1;
    }

    @Override // o.Styleable.ChangeBounds
    public final onTransact<B> invoke(setDefaultImpl<? extends A, ? extends B> setdefaultimpl) {
        runAnimators.valueOf(setdefaultimpl, "it");
        if (setdefaultimpl instanceof setDefaultImpl.values) {
            return onTransact.ah$a.values(((setDefaultImpl.values) setdefaultimpl).ag$a());
        } else if (setdefaultimpl instanceof setDefaultImpl$ah$a) {
            return onTransact.ah$a.values(((setDefaultImpl$ah$a) setdefaultimpl).ah$a()).ah$a(this.$f);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
