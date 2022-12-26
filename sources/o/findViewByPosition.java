package o;

import java.util.Map;
/* loaded from: classes5.dex */
public class findViewByPosition {
    private Map<String, Object> ag$a;
    private String values;

    public findViewByPosition(String str, Map<String, Object> map) {
        this.values = str;
        this.ag$a = map;
    }

    public Map<String, Object> ag$a() {
        return this.ag$a;
    }

    public String ah$a() {
        Map map = (Map) this.ag$a.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String valueOf() {
        return this.values;
    }
}
