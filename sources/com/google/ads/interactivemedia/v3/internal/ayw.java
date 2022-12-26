package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ayw extends ayp {
    final /* synthetic */ ayx a;

    /* renamed from: b  reason: collision with root package name */
    private final Callable f770b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ayw(ayx ayxVar, Callable callable) {
        this.a = ayxVar;
        atc.k(callable);
        this.f770b = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final Object a() throws Exception {
        return this.f770b.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final String b() {
        return this.f770b.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final void d(Throwable th) {
        this.a.o(th);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final void e(Object obj) {
        this.a.j(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final boolean g() {
        return this.a.isDone();
    }
}
