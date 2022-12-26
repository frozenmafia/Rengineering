package arrow.typeclasses;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.reserveEndViewTransition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Applicative$replicate$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends A, ? extends List<? extends A>>, List<? extends A>> {
    public static final Applicative$replicate$1 INSTANCE = new Applicative$replicate$1();

    Applicative$replicate$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final List<A> invoke(cancel<? extends A, ? extends List<? extends A>> cancelVar) {
        runAnimators.valueOf(cancelVar, "<name for destructuring parameter 0>");
        return reserveEndViewTransition.valueOf(reserveEndViewTransition.ag$a(cancelVar.valueOf()), (List) cancelVar.values());
    }
}
