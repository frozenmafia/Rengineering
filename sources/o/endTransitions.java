package o;

import o.TranslationAnimationCreator;
/* loaded from: classes5.dex */
public abstract class endTransitions<V> implements TransitionManager<Object, V> {
    private V ag$a;

    protected void ag$a(TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, V v, V v2) {
        runAnimators.ag$a(transitionPositionListener, "property");
    }

    protected boolean ah$a(TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, V v, V v2) {
        runAnimators.ag$a(transitionPositionListener, "property");
        return true;
    }

    public endTransitions(V v) {
        this.ag$a = v;
    }

    @Override // o.TransitionManager
    public V ah$a(Object obj, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener) {
        runAnimators.ag$a(transitionPositionListener, "property");
        return this.ag$a;
    }

    @Override // o.TransitionManager
    public void toString(Object obj, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, V v) {
        runAnimators.ag$a(transitionPositionListener, "property");
        V v2 = this.ag$a;
        if (ah$a(transitionPositionListener, v2, v)) {
            this.ag$a = v;
            ag$a(transitionPositionListener, v2, v);
        }
    }
}
