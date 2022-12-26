package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class lt {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1162b;
    public final String c;

    public lt(String str, String str2, String str3) {
        this.a = str;
        this.f1162b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lt ltVar = (lt) obj;
        return cp.V(this.a, ltVar.a) && cp.V(this.f1162b, ltVar.f1162b) && cp.V(this.c, ltVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.f1162b;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }
}
