package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class brm implements Map.Entry, Comparable {
    final /* synthetic */ brp a;

    /* renamed from: b  reason: collision with root package name */
    private final Comparable f958b;
    private Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brm(brp brpVar, Comparable comparable, Object obj) {
        this.a = brpVar;
        this.f958b = comparable;
        this.c = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f958b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f958b.compareTo(((brm) obj).f958b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f958b, entry.getKey()) && b(this.c, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f958b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f958b;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.c;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.a.o();
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f958b);
        String valueOf2 = String.valueOf(this.c);
        return valueOf + "=" + valueOf2;
    }
}
