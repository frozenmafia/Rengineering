package arrow.core;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MapK$show$1 extends Lambda implements Styleable.ChangeBounds<Pair<? extends K, ? extends A>, cancel<? extends K, ? extends A>> {
    public static final MapK$show$1 INSTANCE = new MapK$show$1();

    MapK$show$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<K, A> invoke(Pair<? extends K, ? extends A> pair) {
        runAnimators.valueOf(pair, "it");
        return runAnimators.valueOf(pair, "$this$toTuple2");
    }
}
