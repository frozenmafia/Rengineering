package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class auk extends atx {
    final aus a;

    /* renamed from: b  reason: collision with root package name */
    final Object f725b;
    int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auk(aus ausVar, int i) {
        this.a = ausVar;
        this.f725b = ausVar.f729b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            aus ausVar = this.a;
            if (i <= ausVar.c && atc.o(this.f725b, ausVar.f729b[i])) {
                return;
            }
        }
        this.c = this.a.e(this.f725b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object getKey() {
        return this.f725b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atx, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            this.a.q(this.f725b, obj);
            return null;
        }
        Object obj2 = this.a.a[i];
        if (atc.o(obj2, obj)) {
            return obj;
        }
        this.a.B(this.c, obj);
        return obj2;
    }
}
