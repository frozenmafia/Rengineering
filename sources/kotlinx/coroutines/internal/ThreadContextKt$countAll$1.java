package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.VectorDrawableCompat;
/* loaded from: classes5.dex */
public final class ThreadContextKt$countAll$1 extends Lambda implements Transition<Object, PropertyValuesHolderUtils.toString, Object> {
    public static final ThreadContextKt$countAll$1 INSTANCE = new ThreadContextKt$countAll$1();

    ThreadContextKt$countAll$1() {
        super(2);
    }

    @Override // o.Transition
    public final Object invoke(Object obj, PropertyValuesHolderUtils.toString tostring) {
        if (tostring instanceof VectorDrawableCompat.VectorDrawableDelegateState) {
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? tostring : Integer.valueOf(intValue + 1);
        }
        return obj;
    }
}
