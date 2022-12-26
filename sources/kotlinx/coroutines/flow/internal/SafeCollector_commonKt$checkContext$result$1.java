package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.getPathName;
import o.setNonPrimaryAlpha;
/* loaded from: classes7.dex */
public final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements Transition<Integer, PropertyValuesHolderUtils.toString, Integer> {
    final /* synthetic */ SafeCollector<?> $this_checkContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.$this_checkContext = safeCollector;
    }

    @Override // o.Transition
    public /* synthetic */ Integer invoke(Integer num, PropertyValuesHolderUtils.toString tostring) {
        return invoke(num.intValue(), tostring);
    }

    public final Integer invoke(int i, PropertyValuesHolderUtils.toString tostring) {
        PropertyValuesHolderUtils.valueOf<?> key = tostring.getKey();
        PropertyValuesHolderUtils.toString tostring2 = this.$this_checkContext.collectContext.get(key);
        if (key != getPathName.valueOf) {
            return Integer.valueOf(tostring != tostring2 ? Integer.MIN_VALUE : i + 1);
        }
        getPathName getpathname = (getPathName) tostring2;
        getPathName ag$a = setNonPrimaryAlpha.ag$a((getPathName) tostring, getpathname);
        if (ag$a != getpathname) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ag$a + ", expected child of " + getpathname + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
        if (getpathname != null) {
            i++;
        }
        return Integer.valueOf(i);
    }
}
