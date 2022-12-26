package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aob extends aow {
    private final long h;

    public aob(anl anlVar, age ageVar, long j, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", ageVar, i, 25, null, null, null);
        this.h = j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.d.invoke(null, new Object[0])).longValue();
        synchronized (this.g) {
            this.g.ac(longValue);
            long j = this.h;
            if (j != 0) {
                this.g.aD(longValue - j);
                this.g.aE(this.h);
            }
        }
    }
}
