package o;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* loaded from: classes7.dex */
public abstract class computeStateRestorationPolicy<T> extends indexOfWrapper<T> {
    public final TypeVariable<?> values;

    protected computeStateRestorationPolicy() {
        Type capture = capture();
        markViewHoldersUpdated.toString(capture instanceof TypeVariable, "%s should be a type variable.", capture);
        this.values = (TypeVariable) capture;
    }

    public final int hashCode() {
        return this.values.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof computeStateRestorationPolicy) {
            return this.values.equals(((computeStateRestorationPolicy) obj).values);
        }
        return false;
    }

    public String toString() {
        return this.values.toString();
    }
}
