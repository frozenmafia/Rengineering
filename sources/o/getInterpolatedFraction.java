package o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class getInterpolatedFraction implements getTypeMask {
    private final Map<String, List<toBoundsCompat>> valueOf;
    private volatile Map<String, String> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getInterpolatedFraction(Map<String, List<toBoundsCompat>> map) {
        this.valueOf = Collections.unmodifiableMap(map);
    }

    @Override // o.getTypeMask
    public Map<String, String> ah$a() {
        if (this.values == null) {
            synchronized (this) {
                if (this.values == null) {
                    this.values = Collections.unmodifiableMap(valueOf());
                }
            }
        }
        return this.values;
    }

    private Map<String, String> valueOf() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<toBoundsCompat>> entry : this.valueOf.entrySet()) {
            String valueOf2 = valueOf(entry.getValue());
            if (!TextUtils.isEmpty(valueOf2)) {
                hashMap.put(entry.getKey(), valueOf2);
            }
        }
        return hashMap;
    }

    private String valueOf(List<toBoundsCompat> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String ag$a = list.get(i).ag$a();
            if (!TextUtils.isEmpty(ag$a)) {
                sb.append(ag$a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.valueOf + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof getInterpolatedFraction) {
            return this.valueOf.equals(((getInterpolatedFraction) obj).valueOf);
        }
        return false;
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    /* loaded from: classes3.dex */
    static final class valueOf implements toBoundsCompat {
        private final String toString;

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf(String str) {
            this.toString = str;
        }

        @Override // o.toBoundsCompat
        public String ag$a() {
            return this.toString;
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.toString + "'}";
        }

        public boolean equals(Object obj) {
            if (obj instanceof valueOf) {
                return this.toString.equals(((valueOf) obj).toString);
            }
            return false;
        }

        public int hashCode() {
            return this.toString.hashCode();
        }
    }
}
