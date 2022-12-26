package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aoa extends aow {
    private static volatile Long h;
    private static final Object i = new Object();

    public aoa(anl anlVar, age ageVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "XFxH1z0dBuMDP7aWA+P/3WKwW9qr8sC2ASjEfciaKHfSLryjCNl4cmJgfsh2Tylb", "r0MNv9zqwvoUwASL1pBJjOA1OkDa8Kcs5NaA6VOkJEI=", ageVar, i2, 44, null, null, null);
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
            this.g.X(h.longValue());
        }
    }
}
