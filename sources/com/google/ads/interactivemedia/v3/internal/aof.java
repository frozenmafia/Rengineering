package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aof extends aow {
    private static volatile Long h;
    private static final Object i = new Object();

    public aof(anl anlVar, age ageVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "N0mA2OgFUnHXhnZTWHrO10/LZw/fChWm76LMkbZzvR9G3lxQkMoE65IWMn9zBWSu", "uxIInGM9FQ+1gujg5A7z9IJxIqStl6tvqqzSbuEi494=", ageVar, i2, 22, null, null, null);
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
            this.g.ah(h.longValue());
        }
    }
}
