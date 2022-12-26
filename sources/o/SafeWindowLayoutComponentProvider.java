package o;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes5.dex */
public class SafeWindowLayoutComponentProvider {
    final ThreadMode HaptikSDK$c;
    final Method ag$a;
    String ah$a;
    final boolean toString;
    final Class<?> valueOf;
    final int values;

    public SafeWindowLayoutComponentProvider(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.ag$a = method;
        this.HaptikSDK$c = threadMode;
        this.valueOf = cls;
        this.values = i;
        this.toString = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SafeWindowLayoutComponentProvider) {
            ah$a();
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = (SafeWindowLayoutComponentProvider) obj;
            safeWindowLayoutComponentProvider.ah$a();
            return this.ah$a.equals(safeWindowLayoutComponentProvider.ah$a);
        }
        return false;
    }

    private void ah$a() {
        synchronized (this) {
            if (this.ah$a == null) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(this.ag$a.getDeclaringClass().getName());
                sb.append('#');
                sb.append(this.ag$a.getName());
                sb.append('(');
                sb.append(this.valueOf.getName());
                this.ah$a = sb.toString();
            }
        }
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }
}
