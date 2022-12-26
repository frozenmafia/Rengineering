package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class anu extends aow {
    private final Activity h;
    private final View i;

    public anu(anl anlVar, age ageVar, int i, View view, Activity activity, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "uJ6tafbdnitpIiJcEDt3zh4lzBZEYeFsW45S60suhbKyZNy2K2MuNEbuksualim4", "Cv/m6MvBjdOit7tT7cC+xPCpFEqovwYj4XIOcXUxCMs=", ageVar, i, 62, null, null, null);
        this.i = view;
        this.h = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.i == null) {
            return;
        }
        boolean booleanValue = ((Boolean) aqb.m.f()).booleanValue();
        Object[] objArr = (Object[]) this.d.invoke(null, this.i, this.h, Boolean.valueOf(booleanValue));
        synchronized (this.g) {
            this.g.L(((Long) objArr[0]).longValue());
            this.g.N(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.g.M((String) objArr[2]);
            }
        }
    }
}
