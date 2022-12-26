package com.google.ads.interactivemedia.v3.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class anw extends aow {
    public anw(anl anlVar, age ageVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "6vt+8E5GP5AwoxquDM0Y7lVJzS23/VCjNo5D8xB8rgAaaF6IhToGZhlIAUkgigHl", "jx9F7EAIAhvEI8G+/hWsHBitt0z+K8moFRn7/w45eYc=", ageVar, i, 49, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.g.aK(aga.c);
        try {
            this.g.aK(((Boolean) this.d.invoke(null, this.a.b())).booleanValue() ? aga.f539b : aga.a);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
