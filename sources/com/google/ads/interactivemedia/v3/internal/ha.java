package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ha {
    private static final ta s = new ta(new Object());
    public final be a;

    /* renamed from: b  reason: collision with root package name */
    public final ta f1075b;
    public final long c;
    public final long d;
    public final int e;
    public final eu f;
    public final boolean g;
    public final ui h;
    public final wf i;
    public final List j;
    public final ta k;
    public final boolean l;
    public final int m;
    public final au n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1076o;
    public volatile long p;
    public volatile long q;
    public volatile long r;

    public ha(be beVar, ta taVar, long j, long j2, int i, eu euVar, boolean z, ui uiVar, wf wfVar, List list, ta taVar2, boolean z2, int i2, au auVar, long j3, long j4, long j5, boolean z3) {
        this.a = beVar;
        this.f1075b = taVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = euVar;
        this.g = z;
        this.h = uiVar;
        this.i = wfVar;
        this.j = list;
        this.k = taVar2;
        this.l = z2;
        this.m = i2;
        this.n = auVar;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.f1076o = z3;
    }

    public static ha g(wf wfVar) {
        be beVar = be.a;
        ta taVar = s;
        return new ha(beVar, taVar, C.TIME_UNSET, 0L, 1, null, false, ui.a, wfVar, avb.o(), taVar, false, 0, au.a, 0L, 0L, 0L, false);
    }

    public static ta h() {
        return s;
    }

    public final ha a(ta taVar) {
        return new ha(this.a, this.f1075b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, taVar, this.l, this.m, this.n, this.p, this.q, this.r, this.f1076o);
    }

    public final ha b(ta taVar, long j, long j2, long j3, long j4, ui uiVar, wf wfVar, List list) {
        return new ha(this.a, taVar, j2, j3, this.e, this.f, this.g, uiVar, wfVar, list, this.k, this.l, this.m, this.n, this.p, j4, j, this.f1076o);
    }

    public final ha c(boolean z, int i) {
        return new ha(this.a, this.f1075b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.f1076o);
    }

    public final ha d(eu euVar) {
        return new ha(this.a, this.f1075b, this.c, this.d, this.e, euVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.f1076o);
    }

    public final ha e(int i) {
        return new ha(this.a, this.f1075b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.f1076o);
    }

    public final ha f(be beVar) {
        return new ha(beVar, this.f1075b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.f1076o);
    }
}
