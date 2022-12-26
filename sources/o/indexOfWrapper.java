package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes5.dex */
public abstract class indexOfWrapper<T> {
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        markViewHoldersUpdated.toString(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
