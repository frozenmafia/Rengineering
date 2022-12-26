package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.UUID;
/* loaded from: classes4.dex */
public final class mv {
    private final HashMap a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private UUID f1179b = i.d;
    private nz e = oc.a;
    private final wn f = new wn();
    private int[] c = new int[0];
    private final long d = 300000;

    public final nf a(of ofVar) {
        return new nf(this.f1179b, this.e, ofVar, this.a, this.c, this.f, 300000L, null, null, null);
    }

    public final void b(int... iArr) {
        for (int i : iArr) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            af.u(z);
        }
        this.c = (int[]) iArr.clone();
    }

    public final void c(UUID uuid, nz nzVar) {
        af.s(uuid);
        this.f1179b = uuid;
        this.e = nzVar;
    }
}
