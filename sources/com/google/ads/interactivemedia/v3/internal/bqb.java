package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes4.dex */
public final class bqb extends bnk implements RandomAccess, bqc {
    private static final bqb a;

    /* renamed from: b  reason: collision with root package name */
    private final List f939b;

    static {
        bqb bqbVar = new bqb(10);
        a = bqbVar;
        bqbVar.b();
    }

    public bqb() {
        this(10);
    }

    private static String j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bnz) {
            return ((bnz) obj).z();
        }
        return bpr.f((byte[]) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.f939b.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof bqc) {
            collection = ((bqc) collection).h();
        }
        boolean addAll = this.f939b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f939b.clear();
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpq
    public final /* synthetic */ bpq d(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f939b);
        return new bqb(arrayList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final bqc e() {
        return c() ? new brw(this) : this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final Object f(int i) {
        return this.f939b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public final String get(int i) {
        Object obj = this.f939b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bnz) {
            bnz bnzVar = (bnz) obj;
            String z = bnzVar.z();
            if (bnzVar.o()) {
                this.f939b.set(i, z);
            }
            return z;
        }
        byte[] bArr = (byte[]) obj;
        String f = bpr.f(bArr);
        if (bpr.h(bArr)) {
            this.f939b.set(i, f);
        }
        return f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final List h() {
        return Collections.unmodifiableList(this.f939b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqc
    public final void i(bnz bnzVar) {
        a();
        this.f939b.add(bnzVar);
        this.modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.f939b.remove(i);
        this.modCount++;
        return j(remove);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return j(this.f939b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f939b.size();
    }

    public bqb(int i) {
        this(new ArrayList(i));
    }

    private bqb(ArrayList arrayList) {
        this.f939b = arrayList;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
