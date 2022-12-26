package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.PropertyValuesHolderUtils;
import o.ofPointF;
/* loaded from: classes7.dex */
public final class AndroidExceptionPreHandler extends ofPointF implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.toString);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        boolean z = false;
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
            method = null;
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(PropertyValuesHolderUtils propertyValuesHolderUtils, Throwable th) {
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method preHandler = preHandler();
            Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
