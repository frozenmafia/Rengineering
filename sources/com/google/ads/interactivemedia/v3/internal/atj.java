package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class atj extends awc {
    final transient Map a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ atw f712b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public atj(atw atwVar, Map map) {
        this.f712b = atwVar;
        this.a = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return axb.r(key, this.f712b.c(key, (Collection) entry.getValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awc
    protected final Set b() {
        return new ath(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.a;
        atw atwVar = this.f712b;
        map = atwVar.a;
        if (map2 == map) {
            atwVar.o();
        } else {
            axb.x(new ati(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        atc.k(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) axb.o(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.f712b.c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awc, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f712b.x();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.f712b.a();
        a.addAll(collection);
        atw.t(this.f712b, collection.size());
        collection.clear();
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
