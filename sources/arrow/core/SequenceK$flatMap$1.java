package arrow.core;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.Styleable;
import o.invalidateChildInParent;
/* loaded from: classes6.dex */
public final class SequenceK$flatMap$1 extends Lambda implements Styleable.ChangeBounds<A, invalidateChildInParent<? extends B>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SequenceK$flatMap$1(Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$f = changeBounds;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SequenceK$flatMap$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final invalidateChildInParent<B> invoke(A a) {
        ICustomTabsCallback.Default r2 = (ICustomTabsCallback.Default) this.$f.invoke(a);
        if (r2 != null) {
            return ((ICustomTabsService.Stub) r2).ah$a();
        }
        throw new TypeCastException("null cannot be cast to non-null type arrow.core.SequenceK<A>");
    }
}
