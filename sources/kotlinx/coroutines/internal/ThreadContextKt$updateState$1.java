package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.VectorDrawableCompat;
import o.removeOnPageChangeListener;
/* loaded from: classes5.dex */
public final class ThreadContextKt$updateState$1 extends Lambda implements Transition<removeOnPageChangeListener, PropertyValuesHolderUtils.toString, removeOnPageChangeListener> {
    public static final ThreadContextKt$updateState$1 INSTANCE = new ThreadContextKt$updateState$1();

    ThreadContextKt$updateState$1() {
        super(2);
    }

    @Override // o.Transition
    public final removeOnPageChangeListener invoke(removeOnPageChangeListener removeonpagechangelistener, PropertyValuesHolderUtils.toString tostring) {
        if (tostring instanceof VectorDrawableCompat.VectorDrawableDelegateState) {
            VectorDrawableCompat.VectorDrawableDelegateState<?> vectorDrawableDelegateState = (VectorDrawableCompat.VectorDrawableDelegateState) tostring;
            removeonpagechangelistener.valueOf(vectorDrawableDelegateState, vectorDrawableDelegateState.ag$a(removeonpagechangelistener.valueOf));
        }
        return removeonpagechangelistener;
    }
}
