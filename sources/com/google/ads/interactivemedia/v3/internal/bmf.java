package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bmf implements bjg {
    final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Class f885b;
    final /* synthetic */ bjf c;
    private final /* synthetic */ int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bmf(Class cls, Class cls2, bjf bjfVar, int i) {
        this.d = i;
        this.a = cls;
        this.f885b = cls2;
        this.c = bjfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bmf(Class cls, Class cls2, bjf bjfVar, int i, byte[] bArr) {
        this.d = i;
        this.f885b = cls;
        this.a = cls2;
        this.c = bjfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        if (this.d != 0) {
            Class c = bnaVar.c();
            if (c == this.f885b || c == this.a) {
                return this.c;
            }
            return null;
        }
        Class c2 = bnaVar.c();
        if (c2 == this.a || c2 == this.f885b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        if (this.d == 0) {
            return "Factory[type=" + this.a.getName() + "+" + this.f885b.getName() + ",adapter=" + this.c + "]";
        }
        return "Factory[type=" + this.a.getName() + "+" + this.f885b.getName() + ",adapter=" + this.c + "]";
    }
}
