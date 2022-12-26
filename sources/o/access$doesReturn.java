package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.HardwareFoldingFeature;
import org.greenrobot.eventbus.EventBusException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class access$doesReturn {
    private static final Map<Class<?>, List<SafeWindowLayoutComponentProvider>> toString = new ConcurrentHashMap();
    private static final access$doesReturn$ah$a[] values = new access$doesReturn$ah$a[4];
    private final boolean ag$a;
    private final boolean ah$a;
    private List<access$windowExtensionsClass> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public access$doesReturn(List<access$windowExtensionsClass> list, boolean z, boolean z2) {
        this.valueOf = list;
        this.ah$a = z;
        this.ag$a = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<SafeWindowLayoutComponentProvider> ag$a(Class<?> cls) {
        List<SafeWindowLayoutComponentProvider> values2;
        Map<Class<?>, List<SafeWindowLayoutComponentProvider>> map = toString;
        List<SafeWindowLayoutComponentProvider> list = map.get(cls);
        if (list != null) {
            return list;
        }
        if (this.ag$a) {
            values2 = valueOf(cls);
        } else {
            values2 = values(cls);
        }
        if (values2.isEmpty()) {
            throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
        }
        map.put(cls, values2);
        return values2;
    }

    private List<SafeWindowLayoutComponentProvider> values(Class<?> cls) {
        SafeWindowLayoutComponentProvider[] values2;
        access$doesReturn$ah$a values3 = values();
        values3.ag$a(cls);
        while (values3.ah$a != null) {
            values3.invoke = valueOf(values3);
            if (values3.invoke != null) {
                for (SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider : values3.invoke.values()) {
                    if (values3.ag$a(safeWindowLayoutComponentProvider.ag$a, safeWindowLayoutComponentProvider.valueOf)) {
                        values3.HaptikSDK$b.add(safeWindowLayoutComponentProvider);
                    }
                }
            } else {
                values(values3);
            }
            values3.ah$a();
        }
        return toString(values3);
    }

    private List<SafeWindowLayoutComponentProvider> toString(access$doesReturn$ah$a access_doesreturn_ah_a) {
        ArrayList arrayList = new ArrayList(access_doesreturn_ah_a.HaptikSDK$b);
        access_doesreturn_ah_a.ag$a();
        synchronized (values) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                access$doesReturn$ah$a[] access_doesreturn_ah_aArr = values;
                if (access_doesreturn_ah_aArr[i] == null) {
                    access_doesreturn_ah_aArr[i] = access_doesreturn_ah_a;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    private access$doesReturn$ah$a values() {
        synchronized (values) {
            for (int i = 0; i < 4; i++) {
                access$doesReturn$ah$a[] access_doesreturn_ah_aArr = values;
                access$doesReturn$ah$a access_doesreturn_ah_a = access_doesreturn_ah_aArr[i];
                if (access_doesreturn_ah_a != null) {
                    access_doesreturn_ah_aArr[i] = null;
                    return access_doesreturn_ah_a;
                }
            }
            return new access$doesReturn$ah$a();
        }
    }

    private access$isPublic valueOf(access$doesReturn$ah$a access_doesreturn_ah_a) {
        if (access_doesreturn_ah_a.invoke != null && access_doesreturn_ah_a.invoke.ag$a() != null) {
            access$isPublic ag$a = access_doesreturn_ah_a.invoke.ag$a();
            if (access_doesreturn_ah_a.ah$a == ag$a.valueOf()) {
                return ag$a;
            }
        }
        List<access$windowExtensionsClass> list = this.valueOf;
        if (list != null) {
            for (access$windowExtensionsClass access_windowextensionsclass : list) {
                access$isPublic values2 = access_windowextensionsclass.values(access_doesreturn_ah_a.ah$a);
                if (values2 != null) {
                    return values2;
                }
            }
            return null;
        }
        return null;
    }

    private List<SafeWindowLayoutComponentProvider> valueOf(Class<?> cls) {
        access$doesReturn$ah$a values2 = values();
        values2.ag$a(cls);
        while (values2.ah$a != null) {
            values(values2);
            values2.ah$a();
        }
        return toString(values2);
    }

    private void values(access$doesReturn$ah$a access_doesreturn_ah_a) {
        Method[] methods;
        try {
            try {
                methods = access_doesreturn_ah_a.ah$a.getDeclaredMethods();
            } catch (LinkageError e) {
                String str = "Could not inspect methods of " + access_doesreturn_ah_a.ah$a.getName();
                throw new EventBusException(this.ag$a ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e);
            }
        } catch (Throwable unused) {
            methods = access_doesreturn_ah_a.ah$a.getMethods();
            access_doesreturn_ah_a.ag$a = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    HardwareFoldingFeature.Type.Companion companion = (HardwareFoldingFeature.Type.Companion) method.getAnnotation(HardwareFoldingFeature.Type.Companion.class);
                    if (companion != null) {
                        Class<?> cls = parameterTypes[0];
                        if (access_doesreturn_ah_a.ag$a(method, cls)) {
                            access_doesreturn_ah_a.HaptikSDK$b.add(new SafeWindowLayoutComponentProvider(method, cls, companion.ah$a(), companion.valueOf(), companion.ag$a()));
                        }
                    }
                } else if (this.ah$a && method.isAnnotationPresent(HardwareFoldingFeature.Type.Companion.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.ah$a && method.isAnnotationPresent(HardwareFoldingFeature.Type.Companion.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }
}
