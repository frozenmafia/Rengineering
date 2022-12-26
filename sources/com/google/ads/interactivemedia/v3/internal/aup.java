package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aup extends aur {
    final /* synthetic */ aus a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aup(aus ausVar) {
        super(ausVar);
        this.a = ausVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.aur
    public final Object a(int i) {
        return this.a.f729b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int F = axb.F(obj);
        int f = this.a.f(obj, F);
        if (f != -1) {
            this.a.k(f, F);
            return true;
        }
        return false;
    }
}
