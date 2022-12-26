package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class WithLifecycleStateKt {
    private String valueOf;
    private final Map<String, Object> values;

    public WithLifecycleStateKt(String str) {
        runAnimators.ag$a(str, "eventName");
        this.valueOf = str;
        this.values = new HashMap();
    }

    public final String ah$a() {
        return this.valueOf;
    }

    public final WithLifecycleStateKt ah$a(String str, Object obj) {
        runAnimators.ag$a(str, "propName");
        this.values.put(str, obj);
        return this;
    }

    public final WithLifecycleStateKt valueOf(Map<String, Object> map) {
        runAnimators.ag$a(map, "properties");
        this.values.putAll(map);
        return this;
    }

    public final Map<String, Object> valueOf() {
        return this.values;
    }

    public final Object toString(String str) {
        runAnimators.ag$a(str, "propName");
        return this.values.get(str);
    }
}
