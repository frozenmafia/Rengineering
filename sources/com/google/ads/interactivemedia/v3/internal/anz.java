package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class anz extends aow {
    public anz(anl anlVar, age ageVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "C6OPKdOx6rUdfDdOmaUimt8yM1FrOv7bKCITdJ0Uo74WwXDfvXouJ4oz4kHBjTSk", "dTWRHHPyYq/fNXOTAS/wjayGzv2SlrSwyDcB+vX+h5Q=", ageVar, i, 5, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.g.V(-1L);
        this.g.U(-1L);
        int[] iArr = (int[]) this.d.invoke(null, this.a.b());
        synchronized (this.g) {
            this.g.V(iArr[0]);
            this.g.U(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.g.T(i);
            }
        }
    }
}
