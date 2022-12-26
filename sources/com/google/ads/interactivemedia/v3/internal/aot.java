package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aot extends aow {
    private final View h;

    public aot(anl anlVar, age ageVar, int i, View view, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", ageVar, i, 57, null, null, null);
        this.h = view;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.h != null) {
            Boolean bool = (Boolean) aqb.y.f();
            Boolean bool2 = (Boolean) aqb.A.f();
            anp anpVar = new anp((String) this.d.invoke(null, this.h, this.a.b().getResources().getDisplayMetrics(), bool, bool2));
            age g = afu.g();
            g.l(anpVar.a.longValue());
            g.n(anpVar.f657b.longValue());
            g.o(anpVar.c.longValue());
            if (bool2.booleanValue()) {
                g.m(anpVar.e.longValue());
            }
            if (bool.booleanValue()) {
                g.k(anpVar.d.longValue());
            }
            this.g.aI((afu) g.aX());
        }
    }
}
