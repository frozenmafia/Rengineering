package o;

import o.ChangeImageTransform;
import o.TransitionSet;
/* loaded from: classes5.dex */
public interface TranslationAnimationCreator<R> extends TransitionSet.TransitionSetListener<R>, ChangeImageTransform.AnonymousClass3<R> {

    /* loaded from: classes5.dex */
    public interface TransitionPositionListener<V> extends TransitionSet.TransitionSetListener<V> {

        /* loaded from: classes5.dex */
        public interface valueOf<V> extends TranslationAnimationCreator<V> {
        }

        boolean isConst();

        boolean isLateinit();
    }

    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // o.TransitionSet.TransitionSetListener
    boolean isSuspend();
}
