package o;

import o.TransitionUtils;
/* loaded from: classes5.dex */
public interface TransitionValues<T, V> extends ViewGroupOverlayImpl<T, V>, TransitionUtils.MatrixEvaluator<V> {

    /* loaded from: classes7.dex */
    public interface valueOf<T, V> extends TransitionUtils.MatrixEvaluator.valueOf<V>, Transition<T, V, setAnimationMatrix> {
    }

    valueOf<T, V> getSetter();
}
