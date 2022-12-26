package o;

import java.lang.reflect.Type;
/* loaded from: classes5.dex */
public final class getSpan {
    public static boolean values(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public static <T> Class<T> ah$a(Class<T> cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
