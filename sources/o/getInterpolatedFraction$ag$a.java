package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.getInterpolatedFraction;
/* loaded from: classes3.dex */
public final class getInterpolatedFraction$ag$a {
    private static final String ag$a;
    private static final Map<String, List<toBoundsCompat>> values;
    private boolean valueOf = true;
    private Map<String, List<toBoundsCompat>> toString = values;
    private boolean ah$a = true;

    static {
        String valueOf = valueOf();
        ag$a = valueOf;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(valueOf)) {
            hashMap.put("User-Agent", Collections.singletonList(new getInterpolatedFraction.valueOf(valueOf)));
        }
        values = Collections.unmodifiableMap(hashMap);
    }

    public getInterpolatedFraction$ag$a toString(String str, String str2) {
        return toString(str, new getInterpolatedFraction.valueOf(str2));
    }

    public getInterpolatedFraction$ag$a toString(String str, toBoundsCompat toboundscompat) {
        if (this.ah$a && "User-Agent".equalsIgnoreCase(str)) {
            return ah$a(str, toboundscompat);
        }
        ah$a();
        values(str).add(toboundscompat);
        return this;
    }

    public getInterpolatedFraction$ag$a ah$a(String str, toBoundsCompat toboundscompat) {
        ah$a();
        if (toboundscompat == null) {
            this.toString.remove(str);
        } else {
            List<toBoundsCompat> values2 = values(str);
            values2.clear();
            values2.add(toboundscompat);
        }
        if (this.ah$a && "User-Agent".equalsIgnoreCase(str)) {
            this.ah$a = false;
        }
        return this;
    }

    private List<toBoundsCompat> values(String str) {
        List<toBoundsCompat> list = this.toString.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.toString.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    private void ah$a() {
        if (this.valueOf) {
            this.valueOf = false;
            this.toString = values();
        }
    }

    public getInterpolatedFraction ag$a() {
        this.valueOf = true;
        return new getInterpolatedFraction(this.toString);
    }

    private Map<String, List<toBoundsCompat>> values() {
        HashMap hashMap = new HashMap(this.toString.size());
        for (Map.Entry<String, List<toBoundsCompat>> entry : this.toString.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return hashMap;
    }

    static String valueOf() {
        String property = System.getProperty("http.agent");
        if (TextUtils.isEmpty(property)) {
            return property;
        }
        int length = property.length();
        StringBuilder sb = new StringBuilder(property.length());
        for (int i = 0; i < length; i++) {
            char charAt = property.charAt(i);
            if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                sb.append(charAt);
            } else {
                sb.append('?');
            }
        }
        return sb.toString();
    }
}
