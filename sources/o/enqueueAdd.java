package o;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes4.dex */
public class enqueueAdd {
    private static boolean ah$a = false;
    private static Method toString;
    private static Method values;

    public static void ah$a(Canvas canvas, boolean z) {
        Method method;
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        ag$a();
        if (z) {
            try {
                Method method2 = toString;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z || (method = values) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    private static void ag$a() {
        Method method;
        if (ah$a) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                toString = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                values = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
            } else {
                toString = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                values = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            method = toString;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (method != null && values != null) {
            method.setAccessible(true);
            values.setAccessible(true);
            ah$a = true;
        }
    }
}
