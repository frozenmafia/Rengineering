package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
/* loaded from: classes4.dex */
public abstract class atw extends atz implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map a;

    /* renamed from: b */
    private transient int f718b;

    public atw(Map map) {
        atc.e(map.isEmpty());
        this.a = map;
    }

    public static /* synthetic */ void n(atw atwVar, Object obj) {
        Object obj2;
        Map map = atwVar.a;
        atc.k(map);
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            atwVar.f718b -= size;
        }
    }

    public static /* synthetic */ void q(atw atwVar) {
        atwVar.f718b++;
    }

    public static /* synthetic */ void r(atw atwVar) {
        atwVar.f718b--;
    }

    public static /* synthetic */ void s(atw atwVar, int i) {
        atwVar.f718b += i;
    }

    public static /* synthetic */ void t(atw atwVar, int i) {
        atwVar.f718b -= i;
    }

    public abstract Collection a();

    public Collection b(Collection collection) {
        throw null;
    }

    public Collection c(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd
    public final int d() {
        return this.f718b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atz
    final Collection e() {
        return new aty(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atz
    public final Iterator f() {
        return new atk(this, null);
    }

    public final List g(Object obj, List list, att attVar) {
        if (list instanceof RandomAccess) {
            return new atp(this, obj, list, attVar);
        }
        return new atv(this, obj, list, attVar);
    }

    public final Map i() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atz
    Map j() {
        throw null;
    }

    public final Map k() {
        Map map = this.a;
        if (map instanceof NavigableMap) {
            return new atn(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new atq(this, (SortedMap) map);
        }
        return new atj(this, map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atz
    Set l() {
        throw null;
    }

    public final Set m() {
        Map map = this.a;
        if (map instanceof NavigableMap) {
            return new ato(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new atr(this, (SortedMap) map);
        }
        return new atm(this, map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd
    public final void o() {
        for (Collection collection : this.a.values()) {
            collection.clear();
        }
        this.a.clear();
        this.f718b = 0;
    }

    public final void p(Map map) {
        this.a = map;
        this.f718b = 0;
        for (Collection collection : map.values()) {
            atc.e(!collection.isEmpty());
            this.f718b += collection.size();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atz, com.google.ads.interactivemedia.v3.internal.awd
    public final void u(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Collection a = a();
            if (a.add(obj2)) {
                this.f718b++;
                this.a.put(obj, a);
                return;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f718b++;
        }
    }
}
