package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* loaded from: classes4.dex */
final class bkd implements Map.Entry {
    bkd a;

    /* renamed from: b  reason: collision with root package name */
    bkd f861b;
    bkd c;
    bkd d;
    bkd e;
    final Object f;
    Object g;
    int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkd() {
        this.f = null;
        this.e = this;
        this.d = this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkd(bkd bkdVar, Object obj, bkd bkdVar2, bkd bkdVar3) {
        this.a = bkdVar;
        this.f = obj;
        this.h = 1;
        this.d = bkdVar2;
        this.e = bkdVar3;
        bkdVar3.d = this;
        bkdVar2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.g;
            return obj3 == null ? entry.getValue() == null : obj3.equals(entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.g;
        this.g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }
}
