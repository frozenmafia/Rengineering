package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.Transition;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Semialign$padZipWith$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends ICustomTabsService.Stub.Proxy<? extends A>, ? extends ICustomTabsService.Stub.Proxy<? extends B>>, C> {
    final /* synthetic */ Transition $fa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Semialign$padZipWith$1(Transition transition) {
        super(1);
        this.$fa = transition;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [C, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final C invoke(cancel<? extends ICustomTabsService.Stub.Proxy<? extends A>, ? extends ICustomTabsService.Stub.Proxy<? extends B>> cancelVar) {
        runAnimators.valueOf(cancelVar, "it");
        return this.$fa.invoke(cancelVar.ag$a(), cancelVar.ah$a());
    }
}
