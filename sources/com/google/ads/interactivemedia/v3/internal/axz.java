package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public final class axz extends axs {

    /* renamed from: b */
    private axy f762b;

    public axz(auv auvVar, Executor executor, Callable callable) {
        super(auvVar);
        this.f762b = new axx(this, callable, executor);
        q();
    }

    public static /* synthetic */ void w(axz axzVar) {
        axzVar.f762b = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axm
    protected final void i() {
        axy axyVar = this.f762b;
        if (axyVar != null) {
            axyVar.h();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axs
    final void p() {
        axy axyVar = this.f762b;
        if (axyVar != null) {
            axyVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.axs
    public final void s(axr axrVar) {
        super.s(axrVar);
        if (axrVar == axr.OUTPUT_FUTURE_DONE) {
            this.f762b = null;
        }
    }
}
