package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class auj extends atx {
    final Object a;

    /* renamed from: b  reason: collision with root package name */
    int f724b;
    final /* synthetic */ aus c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auj(aus ausVar, int i) {
        this.c = ausVar;
        this.a = ausVar.a[i];
        this.f724b = i;
    }

    final void a() {
        int i = this.f724b;
        if (i != -1) {
            aus ausVar = this.c;
            if (i <= ausVar.c && atc.o(ausVar.a[i], this.a)) {
                return;
            }
        }
        this.f724b = this.c.c(this.a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.f724b;
        if (i == -1) {
            return null;
        }
        return this.c.f729b[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.f724b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        Object obj2 = this.c.f729b[i];
        if (atc.o(obj2, obj)) {
            return obj;
        }
        this.c.C(this.f724b, obj);
        return obj2;
    }
}
