package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
/* loaded from: classes4.dex */
public final class agy {
    private static agy a;

    /* renamed from: b  reason: collision with root package name */
    private float f553b = 0.0f;
    private agr c;
    private ags d;
    private final aez e;
    private final com.google.ads.interactivemedia.v3.impl.data.i f;

    public agy(com.google.ads.interactivemedia.v3.impl.data.i iVar, aez aezVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = iVar;
        this.e = aezVar;
    }

    public static agy b() {
        if (a == null) {
            a = new agy(new com.google.ads.interactivemedia.v3.impl.data.i(), new aez(), null, null, null);
        }
        return a;
    }

    public final float a() {
        return this.f553b;
    }

    public final void c(Context context) {
        this.c = new agr(new Handler(), context, new aez(), this, null, null);
    }

    public final void d(float f) {
        this.f553b = f;
        if (this.d == null) {
            this.d = ags.a();
        }
        for (agm agmVar : this.d.b()) {
            agmVar.h().h(f);
        }
    }

    public final void e() {
        agu.a().g(this);
        agu.a().d();
        if (agu.a().f()) {
            ahn.c().h();
        }
        this.c.a();
    }

    public final void f() {
        ahn.c().i();
        agu.a().e();
        this.c.b();
    }
}
