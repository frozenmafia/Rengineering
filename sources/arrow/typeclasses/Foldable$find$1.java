package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.ITrustedWebActivityCallback;
import o.Styleable;
import o.Transition;
import o.asBinder;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Foldable$find$1 extends Lambda implements Transition<A, asBinder<? extends ICustomTabsService.Stub.Proxy<? extends A>>, asBinder<? extends ICustomTabsService.Stub.Proxy<? extends A>>> {
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Foldable$find$1(Styleable.ChangeBounds changeBounds) {
        super(2);
        this.$f = changeBounds;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Foldable$find$1) obj, (asBinder<? extends ICustomTabsService.Stub.Proxy<? extends Foldable$find$1>>) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final asBinder<ICustomTabsService.Stub.Proxy<A>> invoke(A a, asBinder<? extends ICustomTabsService.Stub.Proxy<? extends A>> asbinder) {
        runAnimators.valueOf(asbinder, "lb");
        return ((Boolean) this.$f.invoke(a)).booleanValue() ? asBinder.ah$a.toString(new ITrustedWebActivityCallback(a)) : asbinder;
    }
}
