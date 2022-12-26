package o;

import java.util.Map;
/* loaded from: classes6.dex */
public class onLoadComplete {
    private String toString;
    private Map<String, Object> values;

    public String valueOf() {
        return this.toString;
    }

    public long valueOf(String str) {
        Map<String, Object> map = this.values;
        if (map == null || !map.containsKey(str)) {
            return 0L;
        }
        return ((Long) this.values.get(str)).longValue();
    }
}
