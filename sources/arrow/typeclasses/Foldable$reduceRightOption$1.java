package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Foldable$reduceRightOption$1 extends Lambda implements Styleable.ChangeBounds<A, A> {
    public static final Foldable$reduceRightOption$1 INSTANCE = new Foldable$reduceRightOption$1();

    Foldable$reduceRightOption$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final A invoke(A a) {
        return a;
    }
}
