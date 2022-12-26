package irjuc.irjuc.cqqlq.irjuc.jmjou;

import java.util.HashMap;
import java.util.Map;
import o.beginAsyncSectionFallback;
/* loaded from: classes5.dex */
public class jmjou$ag$a {
    public Map<String, Object> ah$a = new HashMap();

    public <T> T values(Class<T> cls, Object obj) {
        if (!values(cls)) {
            synchronized (jmjou$ag$a.class) {
                if (!values(cls)) {
                    this.ah$a.put(cls.getCanonicalName(), obj);
                }
            }
        }
        return (T) this.ah$a.get(cls.getCanonicalName());
    }

    public <T> boolean values(Class<T> cls) {
        if (beginAsyncSectionFallback.toString(cls, "ObjectFactory", "tClass")) {
            return false;
        }
        return this.ah$a.containsKey(cls.getCanonicalName());
    }
}
