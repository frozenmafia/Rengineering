package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aum extends AbstractMap implements Serializable, aua {
    private final aus a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set f726b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aum(aus ausVar) {
        this.a = ausVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a.p = this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f726b;
        if (set == null) {
            aun aunVar = new aun(this.a);
            this.f726b = aunVar;
            return aunVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        aus ausVar = this.a;
        int e = ausVar.e(obj);
        if (e == -1) {
            return null;
        }
        return ausVar.a[e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.q(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        aus ausVar = this.a;
        int F = axb.F(obj);
        int f = ausVar.f(obj, F);
        if (f == -1) {
            return null;
        }
        Object obj2 = ausVar.a[f];
        ausVar.k(f, F);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
