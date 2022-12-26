package o;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class addOnChildAttachStateChangeListener {
    private final Map<String, String> ag$a = new HashMap();
    private final int toString;
    private final int valueOf;

    public addOnChildAttachStateChangeListener(int i, int i2) {
        this.toString = i;
        this.valueOf = i2;
    }

    public Map<String, String> ag$a() {
        Map<String, String> unmodifiableMap;
        synchronized (this) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.ag$a));
        }
        return unmodifiableMap;
    }

    public boolean ag$a(String str, String str2) {
        createScroller createscroller;
        synchronized (this) {
            String ah$a = ah$a(str);
            if (this.ag$a.size() >= this.toString && !this.ag$a.containsKey(ah$a)) {
                createscroller = createScroller.valueOf;
                createscroller.values("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.toString);
                return false;
            }
            String values = values(str2, this.valueOf);
            if (CommonUtils.ah$a(this.ag$a.get(ah$a), values)) {
                return false;
            }
            Map<String, String> map = this.ag$a;
            if (str2 == null) {
                values = "";
            }
            map.put(ah$a, values);
            return true;
        }
    }

    public void toString(Map<String, String> map) {
        createScroller createscroller;
        synchronized (this) {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String ah$a = ah$a(entry.getKey());
                if (this.ag$a.size() >= this.toString && !this.ag$a.containsKey(ah$a)) {
                    i++;
                }
                String value = entry.getValue();
                this.ag$a.put(ah$a, value == null ? "" : values(value, this.valueOf));
            }
            if (i > 0) {
                createscroller = createScroller.valueOf;
                createscroller.values("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.toString);
            }
        }
    }

    private String ah$a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        return values(str, this.valueOf);
    }

    public static String values(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > i ? trim.substring(0, i) : trim;
        }
        return str;
    }
}
