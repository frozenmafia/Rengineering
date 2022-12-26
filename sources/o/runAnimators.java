package o;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;
/* loaded from: classes.dex */
public class runAnimators {
    public static int toString(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int values(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    private runAnimators() {
    }

    public static String values(String str, Object obj) {
        return str + obj;
    }

    public static void toString(Object obj) {
        if (obj == null) {
            ah$a();
        }
    }

    public static void values(Object obj, String str) {
        if (obj == null) {
            ag$a(str);
        }
    }

    public static void values() {
        throw ((KotlinNullPointerException) ag$a(new KotlinNullPointerException()));
    }

    public static void ah$a() {
        throw ((NullPointerException) ag$a(new NullPointerException()));
    }

    public static void ag$a(String str) {
        throw ((NullPointerException) ag$a(new NullPointerException(str)));
    }

    public static void ah$a(String str) {
        throw ((UninitializedPropertyAccessException) ag$a(new UninitializedPropertyAccessException(str)));
    }

    public static void valueOf(String str) {
        ah$a("lateinit property " + str + " has not been initialized");
    }

    public static void toString(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) ag$a(new IllegalStateException(str + " must not be null")));
    }

    public static void ah$a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) ag$a(new NullPointerException(str + " must not be null")));
    }

    public static void valueOf(Object obj, String str) {
        if (obj == null) {
            invoke(str);
        }
    }

    public static void ag$a(Object obj, String str) {
        if (obj == null) {
            HaptikSDK$b(str);
        }
    }

    private static void invoke(String str) {
        throw ((IllegalArgumentException) ag$a(new IllegalArgumentException(values(str))));
    }

    private static void HaptikSDK$b(String str) {
        throw ((NullPointerException) ag$a(new NullPointerException(values(str))));
    }

    private static String values(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static boolean values(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean valueOf(Double d, Double d2) {
        return d != null ? !(d2 == null || d.doubleValue() != d2.doubleValue()) : d2 == null;
    }

    public static boolean ah$a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static void toString(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void values(int i, String str) {
        toString("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void valueOf() {
        toString("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    private static <T extends Throwable> T ag$a(T t) {
        return (T) toString((Throwable) t, runAnimators.class.getName());
    }

    public static <T extends Throwable> T toString(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
