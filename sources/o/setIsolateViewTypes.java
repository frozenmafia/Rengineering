package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/* loaded from: classes7.dex */
public final class setIsolateViewTypes {
    public static <T> T ah$a(Class<T> cls, InvocationHandler invocationHandler) {
        markViewHoldersUpdated.toString(invocationHandler);
        markViewHoldersUpdated.toString(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
