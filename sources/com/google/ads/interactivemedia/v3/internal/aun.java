package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* loaded from: classes4.dex */
final class aun extends aur {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aun(aus ausVar) {
        super(ausVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.aur
    public final /* synthetic */ Object a(int i) {
        return new auk(this.f728b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int e = this.f728b.e(key);
            return e != -1 && atc.o(this.f728b.a[e], value);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int F = axb.F(key);
            int f = this.f728b.f(key, F);
            if (f == -1 || !atc.o(this.f728b.a[f], value)) {
                return false;
            }
            this.f728b.k(f, F);
            return true;
        }
        return false;
    }
}
