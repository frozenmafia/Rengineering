package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* loaded from: classes4.dex */
final class awo extends avk {
    private final transient avf a;

    /* renamed from: b  reason: collision with root package name */
    private final transient Object[] f745b;
    private final transient int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awo(avf avfVar, Object[] objArr, int i) {
        this.a = avfVar;
        this.f745b = objArr;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final int a(Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.a.get(key));
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk, com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final axd iterator() {
        return d().listIterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public final boolean f() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avk
    final avb i() {
        return new awn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
