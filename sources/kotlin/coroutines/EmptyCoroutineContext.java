package kotlin.coroutines;

import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class EmptyCoroutineContext implements PropertyValuesHolderUtils, Serializable {
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    @Override // o.PropertyValuesHolderUtils
    public <R> R fold(R r, Transition<? super R, ? super PropertyValuesHolderUtils.toString, ? extends R> transition) {
        runAnimators.ag$a(transition, "operation");
        return r;
    }

    @Override // o.PropertyValuesHolderUtils
    public <E extends PropertyValuesHolderUtils.toString> E get(PropertyValuesHolderUtils.valueOf<E> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // o.PropertyValuesHolderUtils
    public PropertyValuesHolderUtils plus(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        runAnimators.ag$a(propertyValuesHolderUtils, "context");
        return propertyValuesHolderUtils;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // o.PropertyValuesHolderUtils
    public PropertyValuesHolderUtils minusKey(PropertyValuesHolderUtils.valueOf<?> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        return this;
    }
}
