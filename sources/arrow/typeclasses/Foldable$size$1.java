package arrow.typeclasses;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class Foldable$size$1 extends Lambda implements Styleable.ChangeBounds<A, Long> {
    public static final Foldable$size$1 INSTANCE = new Foldable$size$1();

    Foldable$size$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Long invoke(A a) {
        return 1;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Long invoke(Object obj) {
        return Long.valueOf(invoke((Foldable$size$1) obj));
    }
}
