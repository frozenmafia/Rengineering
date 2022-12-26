package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aoc extends aow {
    public aoc(anl anlVar, age ageVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", ageVar, i, 24, null, null, null);
    }

    private final void c() {
        AdvertisingIdClient g = this.a.g();
        if (g == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = g.getInfo();
            String d = ano.d(info.getId());
            if (d != null) {
                synchronized (this.g) {
                    this.g.ab(d);
                    this.g.aa(info.isLimitAdTrackingEnabled());
                    this.g.aL(afo.f);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (!this.a.o()) {
            synchronized (this.g) {
                this.g.ab((String) this.d.invoke(null, this.a.b()));
            }
            return;
        }
        c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        f();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    public final void f() throws Exception {
        if (this.a.p()) {
            super.f();
        } else if (this.a.o()) {
            c();
        }
    }
}
