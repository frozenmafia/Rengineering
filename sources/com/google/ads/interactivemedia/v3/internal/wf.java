package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class wf {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final hi[] f1326b;
    public final vz[] c;
    public final bk d;
    public final Object e;

    public wf(hi[] hiVarArr, vz[] vzVarArr, bk bkVar, Object obj) {
        this.f1326b = hiVarArr;
        this.c = (vz[]) vzVarArr.clone();
        this.d = bkVar;
        this.e = obj;
        this.a = hiVarArr.length;
    }

    public final boolean a(wf wfVar, int i) {
        return wfVar != null && cp.V(this.f1326b[i], wfVar.f1326b[i]) && cp.V(this.c[i], wfVar.c[i]);
    }

    public final boolean b(int i) {
        return this.f1326b[i] != null;
    }
}
