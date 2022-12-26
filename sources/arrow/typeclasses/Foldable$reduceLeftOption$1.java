package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Foldable$reduceLeftOption$1 extends Lambda implements Styleable.ChangeBounds<A, A> {
    public static final Foldable$reduceLeftOption$1 INSTANCE = new Foldable$reduceLeftOption$1();

    Foldable$reduceLeftOption$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final A invoke(A a) {
        return a;
    }
}
