package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public final class bdq {
    private static final bdq a = new bdq();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f808b = new AtomicReference(new bdz().e());

    public static bdq a() {
        return a;
    }

    public final void b(bdh bdhVar) throws GeneralSecurityException {
        synchronized (this) {
            bdz bdzVar = new bdz((bdz) this.f808b.get());
            bdzVar.f(bdhVar);
            this.f808b.set(bdzVar.e());
        }
    }

    public final void c(bdi bdiVar) throws GeneralSecurityException {
        synchronized (this) {
            bdz bdzVar = new bdz((bdz) this.f808b.get());
            bdzVar.g(bdiVar);
            this.f808b.set(bdzVar.e());
        }
    }

    public final void d(bdr bdrVar) throws GeneralSecurityException {
        synchronized (this) {
            bdz bdzVar = new bdz((bdz) this.f808b.get());
            bdzVar.h(bdrVar);
            this.f808b.set(bdzVar.e());
        }
    }

    public final void e(bds bdsVar) throws GeneralSecurityException {
        synchronized (this) {
            bdz bdzVar = new bdz((bdz) this.f808b.get());
            bdzVar.i(bdsVar);
            this.f808b.set(bdzVar.e());
        }
    }
}
