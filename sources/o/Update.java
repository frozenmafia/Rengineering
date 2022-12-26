package o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.TranslationAnimationCreator;
/* loaded from: classes7.dex */
public final class Update {
    public static final boolean values(AtomicBoolean atomicBoolean, Object obj, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener) {
        runAnimators.ag$a(atomicBoolean, "$this$getValue");
        runAnimators.ag$a(transitionPositionListener, "prop");
        return atomicBoolean.get();
    }

    public static final void ah$a(AtomicBoolean atomicBoolean, Object obj, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, boolean z) {
        runAnimators.ag$a(atomicBoolean, "$this$setValue");
        runAnimators.ag$a(transitionPositionListener, "prop");
        atomicBoolean.set(z);
    }

    public static final <T> void ah$a(AtomicReference<T> atomicReference, Object obj, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, T t) {
        runAnimators.ag$a(atomicReference, "$this$setValue");
        runAnimators.ag$a(transitionPositionListener, "prop");
        atomicReference.set(t);
    }
}
