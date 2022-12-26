package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bmh implements bjg {
    final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bjf f887b;
    private final /* synthetic */ int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bmh(Class cls, bjf bjfVar, int i) {
        this.c = i;
        this.a = cls;
        this.f887b = bjfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        if (this.c != 0) {
            if (bnaVar.c() == this.a) {
                return this.f887b;
            }
            return null;
        }
        Class<?> c = bnaVar.c();
        if (this.a.isAssignableFrom(c)) {
            return new bmg(this, c);
        }
        return null;
    }

    public final String toString() {
        if (this.c != 0) {
            return "Factory[type=" + this.a.getName() + ",adapter=" + this.f887b + "]";
        }
        return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.f887b + "]";
    }
}
