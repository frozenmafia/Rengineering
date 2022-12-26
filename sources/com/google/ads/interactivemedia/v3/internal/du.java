package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes4.dex */
public final class du implements cx {
    private final cx a;

    /* renamed from: b  reason: collision with root package name */
    private long f1020b;
    private Uri c;
    private Map d;

    public du(cx cxVar) {
        af.s(cxVar);
        this.a = cxVar;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.a.a(bArr, i, i2);
        if (a != -1) {
            this.f1020b += a;
        }
        return a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final long b(db dbVar) throws IOException {
        this.c = dbVar.a;
        this.d = Collections.emptyMap();
        long b2 = this.a.b(dbVar);
        Uri c = c();
        af.s(c);
        this.c = c;
        this.d = e();
        return b2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        return this.a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() throws IOException {
        this.a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Map e() {
        return this.a.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void f(dv dvVar) {
        af.s(dvVar);
        this.a.f(dvVar);
    }

    public final long g() {
        return this.f1020b;
    }

    public final Uri h() {
        return this.c;
    }

    public final Map i() {
        return this.d;
    }

    public final void j() {
        this.f1020b = 0L;
    }
}
