package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class auo extends aur {
    final /* synthetic */ aus a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auo(aus ausVar) {
        super(ausVar);
        this.a = ausVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.aur
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int F = axb.F(obj);
        int d = this.a.d(obj, F);
        if (d != -1) {
            this.a.j(d, F);
            return true;
        }
        return false;
    }
}
