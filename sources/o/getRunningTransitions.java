package o;

import o.TranslationAnimationCreator;
/* loaded from: classes5.dex */
final class getRunningTransitions<T> implements TransitionManager<Object, T> {
    private T values;

    @Override // o.TransitionManager
    public T ah$a(Object obj, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener) {
        runAnimators.ag$a(transitionPositionListener, "property");
        T t = this.values;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + transitionPositionListener.getName() + " should be initialized before get.");
    }

    @Override // o.TransitionManager
    public void toString(Object obj, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, T t) {
        runAnimators.ag$a(transitionPositionListener, "property");
        runAnimators.ag$a(t, "value");
        this.values = t;
    }
}
