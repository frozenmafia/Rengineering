package o;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public final class isHideReplaced {
    private static isHideReplaced values;
    private final Class<?> HaptikSDK$a;
    private final Method HaptikSDK$c;
    private final Method ag$a;
    private final Class<?> ah$a;
    private final Method ah$b;
    private final Method invoke;
    public static final values valueOf = new values(null);
    private static final AtomicBoolean toString = new AtomicBoolean(false);

    public isHideReplaced(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        runAnimators.ag$a(cls, "skuDetailsParamsClazz");
        runAnimators.ag$a(cls2, "builderClazz");
        runAnimators.ag$a(method, "newBuilderMethod");
        runAnimators.ag$a(method2, "setTypeMethod");
        runAnimators.ag$a(method3, "setSkusListMethod");
        runAnimators.ag$a(method4, "buildMethod");
        this.HaptikSDK$a = cls;
        this.ah$a = cls2;
        this.invoke = method;
        this.ah$b = method2;
        this.HaptikSDK$c = method3;
        this.ag$a = method4;
    }

    public static final /* synthetic */ void ag$a(isHideReplaced ishidereplaced) {
        if (isStateAtLeast.values(isHideReplaced.class)) {
            return;
        }
        try {
            values = ishidereplaced;
        } catch (Throwable th) {
            isStateAtLeast.values(th, isHideReplaced.class);
        }
    }

    public static final /* synthetic */ AtomicBoolean valueOf() {
        if (isStateAtLeast.values(isHideReplaced.class)) {
            return null;
        }
        try {
            return toString;
        } catch (Throwable th) {
            isStateAtLeast.values(th, isHideReplaced.class);
            return null;
        }
    }

    public static final /* synthetic */ isHideReplaced values() {
        if (isStateAtLeast.values(isHideReplaced.class)) {
            return null;
        }
        try {
            return values;
        } catch (Throwable th) {
            isStateAtLeast.values(th, isHideReplaced.class);
            return null;
        }
    }

    public final Class<?> ah$a() {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            return this.HaptikSDK$a;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    public final Object toString(String str, List<String> list) {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            isInBackStack isinbackstack = isInBackStack.toString;
            Object ah$a = isInBackStack.ah$a(this.HaptikSDK$a, this.invoke, null, new Object[0]);
            if (ah$a == null) {
                return null;
            }
            isInBackStack isinbackstack2 = isInBackStack.toString;
            Object ah$a2 = isInBackStack.ah$a(this.ah$a, this.ah$b, ah$a, str);
            if (ah$a2 == null) {
                return null;
            }
            isInBackStack isinbackstack3 = isInBackStack.toString;
            Object ah$a3 = isInBackStack.ah$a(this.ah$a, this.HaptikSDK$c, ah$a2, list);
            if (ah$a3 == null) {
                return null;
            }
            isInBackStack isinbackstack4 = isInBackStack.toString;
            return isInBackStack.ah$a(this.ah$a, this.ag$a, ah$a3, new Object[0]);
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final isHideReplaced ah$a() {
            if (isHideReplaced.valueOf().get()) {
                return isHideReplaced.values();
            }
            values();
            isHideReplaced.valueOf().set(true);
            return isHideReplaced.values();
        }

        private final void values() {
            isInBackStack isinbackstack = isInBackStack.toString;
            Class<?> isinbackstack2 = isInBackStack.toString("com.android.billingclient.api.SkuDetailsParams");
            isInBackStack isinbackstack3 = isInBackStack.toString;
            Class<?> isinbackstack4 = isInBackStack.toString("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (isinbackstack2 == null || isinbackstack4 == null) {
                return;
            }
            isInBackStack isinbackstack5 = isInBackStack.toString;
            Method values = isInBackStack.values(isinbackstack2, "newBuilder", new Class[0]);
            isInBackStack isinbackstack6 = isInBackStack.toString;
            Method values2 = isInBackStack.values(isinbackstack4, "setType", String.class);
            isInBackStack isinbackstack7 = isInBackStack.toString;
            Method values3 = isInBackStack.values(isinbackstack4, "setSkusList", List.class);
            isInBackStack isinbackstack8 = isInBackStack.toString;
            Method values4 = isInBackStack.values(isinbackstack4, "build", new Class[0]);
            if (values == null || values2 == null || values3 == null || values4 == null) {
                return;
            }
            isHideReplaced.ag$a(new isHideReplaced(isinbackstack2, isinbackstack4, values, values2, values3, values4));
        }
    }
}
