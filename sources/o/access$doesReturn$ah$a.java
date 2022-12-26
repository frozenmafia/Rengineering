package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
class access$doesReturn$ah$a {
    boolean ag$a;
    Class<?> ah$a;
    access$isPublic invoke;
    Class<?> values;
    final List<SafeWindowLayoutComponentProvider> HaptikSDK$b = new ArrayList();
    final Map<Class, Object> toString = new HashMap();
    final Map<String, Class> ah$b = new HashMap();
    final StringBuilder valueOf = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(Class<?> cls) {
        this.ah$a = cls;
        this.values = cls;
        this.ag$a = false;
        this.invoke = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        this.HaptikSDK$b.clear();
        this.toString.clear();
        this.ah$b.clear();
        this.valueOf.setLength(0);
        this.values = null;
        this.ah$a = null;
        this.ag$a = false;
        this.invoke = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ag$a(Method method, Class<?> cls) {
        Object put = this.toString.put(cls, method);
        if (put == null) {
            return true;
        }
        if (put instanceof Method) {
            if (!ah$a((Method) put, cls)) {
                throw new IllegalStateException();
            }
            this.toString.put(cls, this);
        }
        return ah$a(method, cls);
    }

    private boolean ah$a(Method method, Class<?> cls) {
        this.valueOf.setLength(0);
        this.valueOf.append(method.getName());
        StringBuilder sb = this.valueOf;
        sb.append('>');
        sb.append(cls.getName());
        String sb2 = this.valueOf.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        Class put = this.ah$b.put(sb2, declaringClass);
        if (put == null || put.isAssignableFrom(declaringClass)) {
            return true;
        }
        this.ah$b.put(sb2, put);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a() {
        if (this.ag$a) {
            this.ah$a = null;
            return;
        }
        Class<? super Object> superclass = this.ah$a.getSuperclass();
        this.ah$a = superclass;
        String name = superclass.getName();
        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
            this.ah$a = null;
        }
    }
}
