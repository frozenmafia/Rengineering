package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public final class onDispatchFirstPass {
    private static final Method toString;
    private static final Method valueOf;
    private static final Object values;

    public static void ag$a(Throwable th) {
        markViewHoldersUpdated.toString(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    static {
        Object ah$a = ah$a();
        values = ah$a;
        valueOf = ah$a == null ? null : values();
        toString = ah$a != null ? valueOf(ah$a) : null;
    }

    private static Object ah$a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method values() {
        return values("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Method valueOf(Object obj) {
        try {
            Method values2 = values("getStackTraceDepth", Throwable.class);
            if (values2 == null) {
                return null;
            }
            values2.invoke(obj, new Throwable());
            return values2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method values(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
