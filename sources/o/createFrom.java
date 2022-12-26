package o;

import o.Styleable;
import o.TranslationAnimationCreator;
/* loaded from: classes5.dex */
public interface createFrom<V> extends TranslationAnimationCreator.TransitionPositionListener<V>, Styleable.ArcMotion<V> {

    /* loaded from: classes5.dex */
    public interface valueOf<V> extends TranslationAnimationCreator.TransitionPositionListener.valueOf<V>, Styleable.ArcMotion<V> {
    }

    V get();

    Object getDelegate();

    valueOf<V> getGetter();
}
