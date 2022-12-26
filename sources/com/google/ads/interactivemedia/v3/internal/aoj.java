package com.google.ads.interactivemedia.v3.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aoj extends aow {
    private static volatile String h;
    private static final Object i = new Object();

    public aoj(anl anlVar, age ageVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "Cv0JAL9ptzpRvgIi9AFTFGn0l5MhpPgpRN4VfZybymKMuiqBn9AG0bgJaX/QotAk", "/xONYRXeBwNZknPQ1yARx5KZSPQPbfL2mKAb1nbkf2s=", ageVar, i2, 1, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.g.ak(ExifInterface.LONGITUDE_EAST);
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            this.g.ak(h);
        }
    }
}
