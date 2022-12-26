package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aop extends aow {
    public aop(anl anlVar, age ageVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "sdX902x/AS9226TxUXaqji9wP1uHqRQA8nkg2YMN1TcruTTaw008l9z5V3jZGjLO", "z3i9M2k4RJ/f7GArNBcGbUcpUFpuRmLev6S20UO7Vqs=", ageVar, i, 51, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.g) {
            ani aniVar = new ani((String) this.d.invoke(null, new Object[0]));
            this.g.Y(aniVar.a.longValue());
            this.g.Z(aniVar.f651b.longValue());
        }
    }
}
