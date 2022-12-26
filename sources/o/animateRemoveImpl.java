package o;

import java.util.concurrent.Executor;
/* loaded from: classes7.dex */
public final class animateRemoveImpl extends endChangeAnimationIfNecessary {
    public static <V> animateAddImpl<V> values(V v) {
        if (v == null) {
            return (animateAddImpl<V>) resetAnimation.valueOf;
        }
        return new resetAnimation(v);
    }

    public static animateAddImpl<Void> values() {
        return resetAnimation.valueOf;
    }

    public static <I, O> animateAddImpl<O> valueOf(animateAddImpl<I> animateaddimpl, hasPendingUpdates<? super I, ? extends O> haspendingupdates, Executor executor) {
        return getBoundAdapter.toString(animateaddimpl, haspendingupdates, executor);
    }
}
