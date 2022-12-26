package o;

import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final valueOf ah$a = new valueOf(null);
    private volatile UUID ag$a;
    private int toString;
    private final Map<String, Object> valueOf;
    private final String values;

    public ContextAwareKt(String str, Map<String, Object> map, UUID uuid) {
        runAnimators.valueOf(str, StringSet.key);
        runAnimators.valueOf(map, "_fields");
        this.values = str;
        this.valueOf = map;
        this.ag$a = uuid;
        this.toString = -1;
    }

    public final String ag$a() {
        return this.values;
    }

    public final Map<String, Object> values() {
        return this.valueOf;
    }

    public final UUID ah$a() {
        return this.ag$a;
    }

    public final values HaptikSDK$a() {
        return new values(this.values, values(), this.ag$a);
    }

    public final Object toString(String str) {
        runAnimators.valueOf(str, "fieldKey");
        return values().get(str);
    }

    public final boolean valueOf(String str) {
        runAnimators.valueOf(str, "fieldKey");
        return values().containsKey(str);
    }

    public final String valueOf() {
        return this.values;
    }

    public String toString() {
        return "Record(key='" + this.values + "', fields=" + values() + ", mutationId=" + this.ag$a + ')';
    }

    public final Set<String> valueOf(ContextAwareKt contextAwareKt) {
        runAnimators.valueOf(contextAwareKt, "otherRecord");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<String, Object> entry : contextAwareKt.values().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            boolean containsKey = values().containsKey(key);
            Object obj = values().get(key);
            if (!containsKey || (!runAnimators.values(obj, value))) {
                this.valueOf.put(key, value);
                linkedHashSet.add(this.values + '.' + key);
                toString(value, obj);
            }
        }
        this.ag$a = contextAwareKt.ag$a;
        return linkedHashSet;
    }

    public final Set<String> HaptikSDK$c() {
        Set<String> keySet = values().keySet();
        ArrayList arrayList = new ArrayList(runAnimators.ag$a(keySet, "<this>"));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.values + '.' + ((String) it.next()));
        }
        return reserveEndViewTransition.onXdkEvent(arrayList);
    }

    private final void toString(Object obj, Object obj2) {
        synchronized (this) {
            int i = this.toString;
            if (i != -1) {
                this.toString = i + ActivityResultCaller.ag$a(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class values {
        private final String ah$a;
        private final Map<String, Object> toString;
        private UUID values;

        public values(String str, Map<String, ? extends Object> map, UUID uuid) {
            runAnimators.valueOf(str, StringSet.key);
            runAnimators.valueOf(map, "fields");
            this.ah$a = str;
            this.values = uuid;
            this.toString = new LinkedHashMap(map);
        }

        public final String ah$a() {
            return this.ah$a;
        }

        public final values ah$a(String str, Object obj) {
            runAnimators.valueOf(str, StringSet.key);
            this.toString.put(str, obj);
            return this;
        }

        public final values toString(Map<String, ? extends Object> map) {
            runAnimators.valueOf(map, "fields");
            this.toString.putAll(map);
            return this;
        }

        public final values values(UUID uuid) {
            this.values = uuid;
            return this;
        }

        public final ContextAwareKt valueOf() {
            return new ContextAwareKt(this.ah$a, this.toString, this.values);
        }
    }

    /* loaded from: classes.dex */
    public static final class valueOf {
        private valueOf() {
        }

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        public final values toString(String str) {
            runAnimators.valueOf(str, StringSet.key);
            return new values(str, new LinkedHashMap(), null);
        }
    }
}
