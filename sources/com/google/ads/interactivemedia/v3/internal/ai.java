package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
/* loaded from: classes4.dex */
public final class ai {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final ad f567b;
    public final ac c;
    public final al d;
    public final x e;
    public final ag f;

    static {
        new v().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ai(String str, y yVar, ae aeVar, ac acVar, al alVar, ag agVar) {
        this.a = str;
        this.f567b = aeVar;
        this.c = acVar;
        this.d = alVar;
        this.e = yVar;
        this.f = agVar;
    }

    public static ai a(Uri uri) {
        v vVar = new v();
        vVar.c(uri);
        return vVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ai) {
            ai aiVar = (ai) obj;
            return cp.V(this.a, aiVar.a) && this.e.equals(aiVar.e) && cp.V(this.f567b, aiVar.f567b) && cp.V(this.c, aiVar.c) && cp.V(this.d, aiVar.d) && cp.V(this.f, aiVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        ad adVar = this.f567b;
        int hashCode2 = adVar != null ? adVar.hashCode() : 0;
        return ((((((((hashCode * 31) + hashCode2) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31;
    }
}
