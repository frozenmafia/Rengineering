package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aoo extends aow {
    private final StackTraceElement[] h;

    public aoo(anl anlVar, age ageVar, int i, StackTraceElement[] stackTraceElementArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", ageVar, i, 45, null, null, null);
        this.h = stackTraceElementArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        int i;
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            anf anfVar = new anf((String) this.d.invoke(null, stackTraceElementArr));
            synchronized (this.g) {
                this.g.ap(anfVar.a.longValue());
                if (anfVar.f649b.booleanValue()) {
                    age ageVar = this.g;
                    if (anfVar.c.booleanValue()) {
                        i = aga.a;
                    } else {
                        i = aga.f539b;
                    }
                    ageVar.aM(i);
                } else {
                    this.g.aM(aga.c);
                }
            }
        }
    }
}
