package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;
/* loaded from: classes4.dex */
public class ad {
    public final Uri a;
    public final aa c;
    public final List e;
    public final avb g;
    public final Object h;

    /* renamed from: b  reason: collision with root package name */
    public final String f477b = null;
    public final u d = null;
    public final String f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ad(Uri uri, aa aaVar, List list, avb avbVar) {
        this.a = uri;
        this.c = aaVar;
        this.e = list;
        this.g = avbVar;
        aux j = avb.j();
        if (avbVar.size() > 0) {
            ah ahVar = (ah) avbVar.get(0);
            throw null;
        }
        j.f();
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad) {
            ad adVar = (ad) obj;
            if (this.a.equals(adVar.a)) {
                String str = adVar.f477b;
                if (cp.V(null, null) && cp.V(this.c, adVar.c)) {
                    u uVar = adVar.d;
                    if (cp.V(null, null) && this.e.equals(adVar.e)) {
                        String str2 = adVar.f;
                        if (cp.V(null, null) && this.g.equals(adVar.g)) {
                            Object obj2 = adVar.h;
                            if (cp.V(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        aa aaVar = this.c;
        return ((((((hashCode * 961) + (aaVar == null ? 0 : aaVar.hashCode())) * 961) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31;
    }
}
