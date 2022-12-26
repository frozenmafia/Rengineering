package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class zu {
    public final zx a;

    /* renamed from: b  reason: collision with root package name */
    public final zx f1387b;

    public zu(zx zxVar, zx zxVar2) {
        this.a = zxVar;
        this.f1387b = zxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zu zuVar = (zu) obj;
        return this.a.equals(zuVar.a) && this.f1387b.equals(zuVar.f1387b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.f1387b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String concat = this.a.equals(this.f1387b) ? "" : ", ".concat(String.valueOf(String.valueOf(this.f1387b)));
        return "[" + valueOf + concat + "]";
    }
}
