package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.getRatingType;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Applicative$replicate$2 extends Lambda implements Styleable.ChangeBounds<cancel<? extends A, ? extends A>, A> {
    final /* synthetic */ getRatingType $MA;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Applicative$replicate$2(getRatingType getratingtype) {
        super(1);
        this.$MA = getratingtype;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((cancel<? extends Object, ? extends Object>) obj);
    }

    public final A invoke(cancel<? extends A, ? extends A> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        return this.$MA.toString(cancelVar.valueOf(), cancelVar.values());
    }
}
