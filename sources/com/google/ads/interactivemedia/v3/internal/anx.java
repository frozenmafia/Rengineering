package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes4.dex */
public final class anx extends aow {
    private static final ayg i = new ayg();
    private final Context h;

    public anx(anl anlVar, age ageVar, int i2, Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "joxZSCFIfSio2J1Z0g3HMtlcDGNvogfMyrj1e2b+qPNv6DXnDVXfwkgCXW9zFWFC", "iJiFXDBrMwFOGpG8WmWNKc3sGwXbWv8N6fPQac0mMm0=", ageVar, i2, 29, null, null, null);
        this.h = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.g.W(ExifInterface.LONGITUDE_EAST);
        AtomicReference b2 = i.b(this.h.getPackageName());
        if (b2.get() == null) {
            synchronized (b2) {
                if (b2.get() == null) {
                    b2.set((String) this.d.invoke(null, this.h));
                }
            }
        }
        String str = (String) b2.get();
        synchronized (this.g) {
            this.g.W(com.google.ads.interactivemedia.v3.impl.data.ai.a(str.getBytes(), true));
        }
    }
}
