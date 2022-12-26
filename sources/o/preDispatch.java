package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class preDispatch {
    private final Map<Class<?>, Object> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public preDispatch(preDispatch$ah$a predispatch_ah_a) {
        Map map;
        map = predispatch_ah_a.valueOf;
        this.values = Collections.unmodifiableMap(new HashMap(map));
    }

    public boolean ah$a(Class<? extends Object> cls) {
        return this.values.containsKey(cls);
    }
}
