package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aon extends aow {
    private final boolean h;

    public aon(anl anlVar, age ageVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "RjfRn/7K/Mx2/M8Fl6a7u1D5niklht4X0VG1cOixOa4SuaPG6Qd7la4v6f0IM/MO", "cZ2qwY2ZIJRch325gepGJtH7dQ9IcqmfWvaHdfiFi6Y=", ageVar, i, 61, null, null, null);
        this.h = anlVar.q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.d.invoke(null, this.a.b(), Boolean.valueOf(this.h))).longValue();
        synchronized (this.g) {
            this.g.ao(longValue);
        }
    }
}
