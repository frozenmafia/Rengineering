package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class up implements wt {
    public final db g;
    public final int h;
    public final s i;
    public final int j;
    public final long l;
    public final long m;
    protected final du n;
    public final Object k = null;
    public final long f = ss.a();

    public up(cx cxVar, db dbVar, int i, s sVar, int i2, long j, long j2) {
        this.n = new du(cxVar);
        this.g = dbVar;
        this.h = i;
        this.i = sVar;
        this.j = i2;
        this.l = j;
        this.m = j2;
    }

    public final long k() {
        return this.n.g();
    }

    public final Uri l() {
        return this.n.h();
    }

    public final Map m() {
        return this.n.i();
    }
}
