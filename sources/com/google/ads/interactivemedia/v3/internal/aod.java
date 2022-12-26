package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
/* loaded from: classes4.dex */
public final class aod implements Callable {
    private final anl a;

    /* renamed from: b  reason: collision with root package name */
    private final age f661b;

    public aod(anl anlVar, age ageVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = anlVar;
        this.f661b = ageVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        if (this.a.k() != null) {
            this.a.k().get();
        }
        afv c = this.a.c();
        if (c != null) {
            try {
                synchronized (this.f661b) {
                    age ageVar = this.f661b;
                    byte[] aw = c.aw();
                    ageVar.aT(aw, aw.length, boy.a());
                }
                return null;
            } catch (bpt | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
