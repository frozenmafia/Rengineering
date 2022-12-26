package arrow.core;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SortedMapK$show$1 extends Lambda implements Styleable.ChangeBounds<Pair<? extends A, ? extends B>, cancel<? extends A, ? extends B>> {
    public static final SortedMapK$show$1 INSTANCE = new SortedMapK$show$1();

    SortedMapK$show$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<A, B> invoke(Pair<? extends A, ? extends B> pair) {
        runAnimators.valueOf(pair, "it");
        return runAnimators.valueOf(pair, "$this$toTuple2");
    }
}
