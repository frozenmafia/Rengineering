package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aor extends aow {
    private static volatile Long h;
    private static final Object i = new Object();

    public aor(anl anlVar, age ageVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "5BhEc19mhLCb3gixLpO/usqpdcrz8iDHUvKRNr8tUAX9rUzF0wog6vEOJrftvcpW", "yZHUQ89G8fTgEsMNs0hBrXwZIrb4VL1iE12C/t/Y3UE=", ageVar, i2, 33, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            this.g.aF(h.longValue());
        }
    }
}
