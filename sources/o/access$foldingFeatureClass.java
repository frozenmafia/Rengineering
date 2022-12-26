package o;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import o.getType;
/* loaded from: classes8.dex */
public class access$foldingFeatureClass {
    public final Map<Class<? extends Throwable>, Integer> valueOf = new HashMap();

    public Integer toString(Throwable th) {
        int i = 20;
        Throwable th2 = th;
        do {
            Integer valueOf = valueOf(th2);
            if (valueOf == null) {
                th2 = th2.getCause();
                i--;
                if (i <= 0 || th2 == th) {
                    break;
                }
            } else {
                return valueOf;
            }
        } while (th2 != null);
        getType.window_release.toString.ah$a().ag$a(Level.FINE, "No specific message resource ID found for " + th);
        return null;
    }

    protected Integer valueOf(Throwable th) {
        Class<?> cls = th.getClass();
        Integer num = this.valueOf.get(cls);
        if (num == null) {
            Class<? extends Throwable> cls2 = null;
            for (Map.Entry<Class<? extends Throwable>, Integer> entry : this.valueOf.entrySet()) {
                Class<? extends Throwable> key = entry.getKey();
                if (key.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(key))) {
                    num = entry.getValue();
                    cls2 = key;
                }
            }
        }
        return num;
    }
}
