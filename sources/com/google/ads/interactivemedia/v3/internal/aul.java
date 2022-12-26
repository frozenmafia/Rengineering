package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* loaded from: classes4.dex */
final class aul extends aur {
    final /* synthetic */ aus a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aul(aus ausVar) {
        super(ausVar);
        this.a = ausVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.aur
    public final /* synthetic */ Object a(int i) {
        return new auj(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = this.a.c(key);
            return c != -1 && atc.o(value, this.a.f729b[c]);
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
            int d = this.a.d(key, F);
            if (d == -1 || !atc.o(value, this.a.f729b[d])) {
                return false;
            }
            this.a.j(d, F);
            return true;
        }
        return false;
    }
}
