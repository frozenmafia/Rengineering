package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class isInBackStack {
    public static final isInBackStack toString = new isInBackStack();

    private isInBackStack() {
    }

    public static final Class<?> toString(String str) {
        if (isStateAtLeast.values(isInBackStack.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, isInBackStack.class);
            return null;
        }
    }

    public static final Method values(Class<?> cls, String str, Class<?>... clsArr) {
        if (isStateAtLeast.values(isInBackStack.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(cls, "clazz");
            runAnimators.ag$a(str, "methodName");
            runAnimators.ag$a(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, isInBackStack.class);
            return null;
        }
    }

    public static final Object ah$a(Class<?> cls, Method method, Object obj, Object... objArr) {
        if (isStateAtLeast.values(isInBackStack.class)) {
            return null;
        }
        try {
            runAnimators.ag$a(cls, "clazz");
            runAnimators.ag$a(method, "method");
            runAnimators.ag$a(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, isInBackStack.class);
            return null;
        }
    }
}
