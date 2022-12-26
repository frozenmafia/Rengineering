package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
/* loaded from: classes7.dex */
final class SafeCollector$collectContextSize$1 extends Lambda implements Transition<Integer, PropertyValuesHolderUtils.toString, Integer> {
    public static final SafeCollector$collectContextSize$1 INSTANCE = new SafeCollector$collectContextSize$1();

    SafeCollector$collectContextSize$1() {
        super(2);
    }

    public final Integer invoke(int i, PropertyValuesHolderUtils.toString tostring) {
        return Integer.valueOf(i + 1);
    }

    @Override // o.Transition
    public /* synthetic */ Integer invoke(Integer num, PropertyValuesHolderUtils.toString tostring) {
        return invoke(num.intValue(), tostring);
    }
}
