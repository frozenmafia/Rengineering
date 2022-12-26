package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class destroyItem {
    public static <K, V> HashMap<K, V> values() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> valueOf() {
        return values();
    }

    public static <K, V> Map<K, V> values(K k, V v) {
        Map<K, V> valueOf = valueOf();
        valueOf.put(k, v);
        return valueOf;
    }

    public static <K, V> Map<K, V> ah$a(K k, V v, K k2, V v2) {
        Map<K, V> valueOf = valueOf();
        valueOf.put(k, v);
        valueOf.put(k2, v2);
        return valueOf;
    }

    public static <K, V> Map<K, V> ah$a(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> valueOf = valueOf();
        valueOf.put(k, v);
        valueOf.put(k2, v2);
        valueOf.put(k3, v3);
        return valueOf;
    }

    public static <K, V> Map<K, V> toString(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> valueOf = valueOf();
        valueOf.put(k, v);
        valueOf.put(k2, v2);
        valueOf.put(k3, v3);
        valueOf.put(k4, v4);
        return valueOf;
    }

    public static <K, V> Map<K, V> ag$a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> valueOf = valueOf();
        valueOf.put(k, v);
        valueOf.put(k2, v2);
        valueOf.put(k3, v3);
        valueOf.put(k4, v4);
        valueOf.put(k5, v5);
        return valueOf;
    }

    public static <K, V> Map<K, V> ag$a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K, V> valueOf = valueOf();
        valueOf.put(k, v);
        valueOf.put(k2, v2);
        valueOf.put(k3, v3);
        valueOf.put(k4, v4);
        valueOf.put(k5, v5);
        valueOf.put(k6, v6);
        return valueOf;
    }

    public static <K, V> Map<K, V> valueOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Map<K, V> valueOf = valueOf();
        valueOf.put(k, v);
        valueOf.put(k2, v2);
        valueOf.put(k3, v3);
        valueOf.put(k4, v4);
        valueOf.put(k5, v5);
        valueOf.put(k6, v6);
        valueOf.put(k7, v7);
        return valueOf;
    }

    public static <K, V> toString<K, V> ah$a() {
        return new toString<>();
    }

    /* loaded from: classes.dex */
    public static final class toString<K, V> {
        private boolean toString;
        private Map valueOf;

        private toString() {
            this.valueOf = destroyItem.values();
            this.toString = true;
        }

        public toString<K, V> toString(K k, V v) {
            if (!this.toString) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.valueOf.put(k, v);
            return this;
        }

        public Map<K, V> valueOf() {
            if (!this.toString) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.toString = false;
            return this.valueOf;
        }
    }
}
