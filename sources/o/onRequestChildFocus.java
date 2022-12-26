package o;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public final class onRequestChildFocus {
    private final String ah$a;
    private final Map<Class<?>, Object> values;

    private onRequestChildFocus(String str, Map<Class<?>, Object> map) {
        this.ah$a = str;
        this.values = map;
    }

    public String ag$a() {
        return this.ah$a;
    }

    public <T extends Annotation> T toString(Class<T> cls) {
        return (T) this.values.get(cls);
    }

    public static onRequestChildFocus ag$a(String str) {
        return new onRequestChildFocus(str, Collections.emptyMap());
    }

    public static toString valueOf(String str) {
        return new toString(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onRequestChildFocus) {
            onRequestChildFocus onrequestchildfocus = (onRequestChildFocus) obj;
            return this.ah$a.equals(onrequestchildfocus.ah$a) && this.values.equals(onrequestchildfocus.values);
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.ah$a + ", properties=" + this.values.values() + "}";
    }

    /* loaded from: classes7.dex */
    public static final class toString {
        private Map<Class<?>, Object> ah$a = null;
        private final String toString;

        toString(String str) {
            this.toString = str;
        }

        public <T extends Annotation> toString ag$a(T t) {
            if (this.ah$a == null) {
                this.ah$a = new HashMap();
            }
            this.ah$a.put(t.annotationType(), t);
            return this;
        }

        public onRequestChildFocus ah$a() {
            Map unmodifiableMap;
            String str = this.toString;
            if (this.ah$a == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.ah$a));
            }
            return new onRequestChildFocus(str, unmodifiableMap);
        }
    }
}
