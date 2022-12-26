package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class brp extends AbstractMap {
    private final int a;
    private boolean d;
    private volatile bro e;

    /* renamed from: b  reason: collision with root package name */
    private List f960b = Collections.emptyList();
    private Map c = Collections.emptyMap();
    private Map f = Collections.emptyMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ brp(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static brp c(int i) {
        return new bri(i);
    }

    private final int l(Comparable comparable) {
        int size = this.f960b.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((brm) this.f960b.get(size)).a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((brm) this.f960b.get(i2)).a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i) {
        o();
        Object value = ((brm) this.f960b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.f960b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new brm(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.d) {
            return;
        }
        if (this.c.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.c);
        }
        this.c = unmodifiableMap;
        if (this.f.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f);
        }
        this.f = unmodifiableMap2;
        this.d = true;
    }

    public final int b() {
        return this.f960b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f960b.isEmpty()) {
            this.f960b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.c.isEmpty() ? brl.a() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int l = l(comparable);
        if (l >= 0) {
            return ((brm) this.f960b.get(l)).setValue(obj);
        }
        o();
        if (this.f960b.isEmpty() && !(this.f960b instanceof ArrayList)) {
            this.f960b = new ArrayList(this.a);
        }
        int i = -(l + 1);
        if (i >= this.a) {
            return n().put(comparable, obj);
        }
        int size = this.f960b.size();
        int i2 = this.a;
        if (size == i2) {
            brm brmVar = (brm) this.f960b.remove(i2 - 1);
            n().put(brmVar.a(), brmVar.getValue());
        }
        this.f960b.add(i, new brm(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new bro(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brp)) {
            return super.equals(obj);
        }
        brp brpVar = (brp) obj;
        int size = size();
        if (size != brpVar.size()) {
            return false;
        }
        int b2 = b();
        if (b2 == brpVar.b()) {
            for (int i = 0; i < b2; i++) {
                if (!g(i).equals(brpVar.g(i))) {
                    return false;
                }
            }
            if (b2 != size) {
                return this.c.equals(brpVar.c);
            }
            return true;
        }
        return entrySet().equals(brpVar.entrySet());
    }

    public final Map.Entry g(int i) {
        return (Map.Entry) this.f960b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = l(comparable);
        if (l >= 0) {
            return ((brm) this.f960b.get(l)).getValue();
        }
        return this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b2 = b();
        int i = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            i += ((brm) this.f960b.get(i2)).hashCode();
        }
        return this.c.size() > 0 ? i + this.c.hashCode() : i;
    }

    public final boolean j() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int l = l(comparable);
        if (l >= 0) {
            return m(l);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f960b.size() + this.c.size();
    }
}
