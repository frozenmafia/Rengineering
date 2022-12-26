package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes4.dex */
public final class bql extends LinkedHashMap {
    private static final bql a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f945b;

    static {
        bql bqlVar = new bql();
        a = bqlVar;
        bqlVar.c();
    }

    private bql() {
        this.f945b = true;
    }

    public static bql a() {
        return a;
    }

    private static int f(Object obj) {
        if (obj instanceof byte[]) {
            return bpr.b((byte[]) obj);
        }
        if (obj instanceof bpm) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void g() {
        if (!this.f945b) {
            throw new UnsupportedOperationException();
        }
    }

    public final bql b() {
        return isEmpty() ? new bql() : new bql(this);
    }

    public final void c() {
        this.f945b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d(bql bqlVar) {
        g();
        if (bqlVar.isEmpty()) {
            return;
        }
        putAll(bqlVar);
    }

    public final boolean e() {
        return this.f945b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                    equals = value.equals(obj2);
                    continue;
                } else {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += f(entry.getValue()) ^ f(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        bpr.i(obj);
        bpr.i(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            bpr.i(obj);
            bpr.i(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    private bql(Map map) {
        super(map);
        this.f945b = true;
    }
}
