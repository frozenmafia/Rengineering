package o;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getSceneRoot {
    private static getSceneRoot$ag$a ag$a;
    public static final getSceneRoot valueOf = new getSceneRoot();
    private static final getSceneRoot$ag$a toString = new getSceneRoot$ag$a(null, null, null);

    private getSceneRoot() {
    }

    public final String ah$a(BaseContinuationImpl baseContinuationImpl) {
        runAnimators.ag$a(baseContinuationImpl, "continuation");
        getSceneRoot$ag$a getsceneroot_ag_a = ag$a;
        if (getsceneroot_ag_a == null) {
            getsceneroot_ag_a = valueOf(baseContinuationImpl);
        }
        if (getsceneroot_ag_a == toString) {
            return null;
        }
        Method method = getsceneroot_ag_a.ah$a;
        Object invoke = method != null ? method.invoke(baseContinuationImpl.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = getsceneroot_ag_a.ag$a;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = getsceneroot_ag_a.valueOf;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }

    private final getSceneRoot$ag$a valueOf(BaseContinuationImpl baseContinuationImpl) {
        try {
            getSceneRoot$ag$a getsceneroot_ag_a = new getSceneRoot$ag$a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            ag$a = getsceneroot_ag_a;
            return getsceneroot_ag_a;
        } catch (Exception unused) {
            getSceneRoot$ag$a getsceneroot_ag_a2 = toString;
            ag$a = getsceneroot_ag_a2;
            return getsceneroot_ag_a2;
        }
    }
}
