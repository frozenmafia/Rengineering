package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.VectorDrawableCompat;
/* loaded from: classes5.dex */
public final class ThreadContextKt$findOne$1 extends Lambda implements Transition<VectorDrawableCompat.VectorDrawableDelegateState<?>, PropertyValuesHolderUtils.toString, VectorDrawableCompat.VectorDrawableDelegateState<?>> {
    public static final ThreadContextKt$findOne$1 INSTANCE = new ThreadContextKt$findOne$1();

    ThreadContextKt$findOne$1() {
        super(2);
    }

    @Override // o.Transition
    public final VectorDrawableCompat.VectorDrawableDelegateState<?> invoke(VectorDrawableCompat.VectorDrawableDelegateState<?> vectorDrawableDelegateState, PropertyValuesHolderUtils.toString tostring) {
        if (vectorDrawableDelegateState != null) {
            return vectorDrawableDelegateState;
        }
        if (tostring instanceof VectorDrawableCompat.VectorDrawableDelegateState) {
            return (VectorDrawableCompat.VectorDrawableDelegateState) tostring;
        }
        return null;
    }
}
