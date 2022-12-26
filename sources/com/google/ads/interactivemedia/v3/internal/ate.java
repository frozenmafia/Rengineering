package com.google.ads.interactivemedia.v3.internal;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes4.dex */
public final class ate {
    private static final Object a;

    static {
        Object b2 = b();
        a = b2;
        if (b2 != null) {
            c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (b2 == null) {
            return;
        }
        d(b2);
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void d(Object obj) {
        try {
            Method c = c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return;
            }
            c.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
