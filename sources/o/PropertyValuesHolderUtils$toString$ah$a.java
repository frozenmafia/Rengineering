package o;

import com.sendbird.android.constant.StringSet;
import kotlin.coroutines.EmptyCoroutineContext;
import o.PropertyValuesHolderUtils;
/* loaded from: classes5.dex */
public final class PropertyValuesHolderUtils$toString$ah$a {
    public static PropertyValuesHolderUtils toString(PropertyValuesHolderUtils.toString tostring, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        runAnimators.ag$a(propertyValuesHolderUtils, "context");
        return PropertyValuesHolderUtils$ah$a.valueOf(tostring, propertyValuesHolderUtils);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends PropertyValuesHolderUtils.toString> E valueOf(PropertyValuesHolderUtils.toString tostring, PropertyValuesHolderUtils.valueOf<E> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        if (runAnimators.values(tostring.getKey(), valueof)) {
            runAnimators.values((Object) tostring, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
            return tostring;
        }
        return null;
    }

    public static <R> R values(PropertyValuesHolderUtils.toString tostring, R r, Transition<? super R, ? super PropertyValuesHolderUtils.toString, ? extends R> transition) {
        runAnimators.ag$a(transition, "operation");
        return transition.invoke(r, tostring);
    }

    public static PropertyValuesHolderUtils ag$a(PropertyValuesHolderUtils.toString tostring, PropertyValuesHolderUtils.valueOf<?> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        boolean values = runAnimators.values(tostring.getKey(), valueof);
        Object obj = tostring;
        if (values) {
            obj = EmptyCoroutineContext.INSTANCE;
        }
        return (PropertyValuesHolderUtils) obj;
    }
}
