package com.google.ads.interactivemedia.v3.internal;

import com.sendbird.android.constant.StringSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
/* loaded from: classes4.dex */
public abstract class avf<K, V> implements Map<K, V>, Serializable {
    private transient avk a;

    /* renamed from: b  reason: collision with root package name */
    private transient avk f737b;
    private transient auv c;

    public static avf c(Map map) {
        if ((map instanceof avf) && !(map instanceof SortedMap)) {
            avf avfVar = (avf) map;
            if (!avfVar.i()) {
                return avfVar;
            }
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        avd avdVar = new avd(entrySet instanceof Collection ? entrySet.size() : 4);
        avdVar.d(entrySet);
        return avdVar.b();
    }

    public static avf d() {
        return awr.a;
    }

    public static avf j(Object obj) {
        axb.I("adBreakTime", obj);
        return awr.k(1, new Object[]{"adBreakTime", obj}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract auv a();

    @Override // java.util.Map
    /* renamed from: b */
    public auv values() {
        auv auvVar = this.c;
        if (auvVar == null) {
            auv a = a();
            this.c = a;
            return a;
        }
        return auvVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract avk e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return axb.s(this, obj);
    }

    abstract avk f();

    @Override // java.util.Map
    /* renamed from: g */
    public final avk entrySet() {
        avk avkVar = this.a;
        if (avkVar == null) {
            avk e = e();
            this.a = e;
            return e;
        }
        return avkVar;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public avk keySet() {
        avk avkVar = this.f737b;
        if (avkVar == null) {
            avk f = f();
            this.f737b = f;
            return f;
        }
        return avkVar;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return axb.b(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        axb.K(size, StringSet.size);
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    Object writeReplace() {
        return new ave(this);
    }
}
