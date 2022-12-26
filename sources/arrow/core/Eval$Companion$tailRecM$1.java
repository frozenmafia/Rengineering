package arrow.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.Styleable;
import o.asBinder;
import o.asBinder$ag$a;
import o.runAnimators;
import o.setDefaultImpl;
import o.setDefaultImpl$ah$a;
/* loaded from: classes6.dex */
public final class Eval$Companion$tailRecM$1 extends Lambda implements Styleable.ChangeBounds<setDefaultImpl<? extends A, ? extends B>, asBinder<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eval$Companion$tailRecM$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public final asBinder<B> invoke(setDefaultImpl<? extends A, ? extends B> setdefaultimpl) {
        runAnimators.valueOf(setdefaultimpl, "eval");
        if (setdefaultimpl instanceof setDefaultImpl$ah$a) {
            return asBinder.ah$a.values((asBinder$ag$a) ((setDefaultImpl$ah$a) setdefaultimpl).ah$a(), (Styleable.ChangeBounds<? super asBinder$ag$a, ? extends ICustomTabsCallback.Default<Object, ? extends setDefaultImpl<? extends asBinder$ag$a, ? extends B>>>) this.$f);
        }
        if (setdefaultimpl instanceof setDefaultImpl.values) {
            return asBinder.ah$a.ah$a(((setDefaultImpl.values) setdefaultimpl).ag$a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
