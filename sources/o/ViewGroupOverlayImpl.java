package o;

import o.Styleable;
import o.TranslationAnimationCreator;
/* loaded from: classes5.dex */
public interface ViewGroupOverlayImpl<T, V> extends TranslationAnimationCreator.TransitionPositionListener<V>, Styleable.ChangeBounds<T, V> {

    /* loaded from: classes5.dex */
    public interface valueOf<T, V> extends TranslationAnimationCreator.TransitionPositionListener.valueOf<V>, Styleable.ChangeBounds<T, V> {
    }

    V get(T t);

    Object getDelegate(T t);

    valueOf<T, V> getGetter();
}
