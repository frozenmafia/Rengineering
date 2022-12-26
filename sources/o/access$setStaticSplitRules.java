package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public final class access$setStaticSplitRules {
    public static final values valueOf = new values(null);
    private final Method ag$a;
    private final Method ah$a;
    private final Method values;

    public access$setStaticSplitRules(Method method, Method method2, Method method3) {
        this.ag$a = method;
        this.ah$a = method2;
        this.values = method3;
    }

    public final Object ah$a(String str) {
        runAnimators.ag$a(str, "closer");
        Method method = this.ag$a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.ah$a;
                runAnimators.toString(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean valueOf(Object obj) {
        if (obj != null) {
            try {
                Method method = this.values;
                runAnimators.toString(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        public final access$setStaticSplitRules valueOf() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = method;
                method3 = method2;
            }
            return new access$setStaticSplitRules(method, method3, method2);
        }
    }
}
