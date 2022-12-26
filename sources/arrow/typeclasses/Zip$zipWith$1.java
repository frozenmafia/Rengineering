package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Transition;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Zip$zipWith$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends A, ? extends B>, C> {
    final /* synthetic */ Transition $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Zip$zipWith$1(Transition transition) {
        super(1);
        this.$f = transition;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [C, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final C invoke(cancel<? extends A, ? extends B> cancelVar) {
        runAnimators.valueOf(cancelVar, "it");
        return this.$f.invoke(cancelVar.ag$a(), cancelVar.ah$a());
    }
}
