package androidx.core.util;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class PairKt {
    public static final <F, S> F component1(Pair<F, S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return pair.second;
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(Pair<F, S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(kotlin.Pair<? extends F, ? extends S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return (F) pair.first;
    }

    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return (S) pair.second;
    }

    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(android.util.Pair<F, S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(kotlin.Pair<? extends F, ? extends S> pair) {
        runAnimators.ag$a(pair, "<this>");
        return new android.util.Pair<>(pair.getFirst(), pair.getSecond());
    }
}
