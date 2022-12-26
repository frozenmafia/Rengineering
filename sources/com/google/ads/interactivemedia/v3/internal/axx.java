package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class axx extends axy {
    final /* synthetic */ axz a;
    private final Callable c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axx(axz axzVar, Callable callable, Executor executor) {
        super(axzVar, executor);
        this.a = axzVar;
        atc.k(callable);
        this.c = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final Object a() throws Exception {
        return this.c.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    final String b() {
        return this.c.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axy
    final void c(Object obj) {
        this.a.j(obj);
    }
}
