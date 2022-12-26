package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aoq extends aow {
    private final anr h;
    private long i;

    public aoq(anl anlVar, age ageVar, int i, anr anrVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", ageVar, i, 53, null, null, null);
        this.h = anrVar;
        if (anrVar != null) {
            this.i = anrVar.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.h != null) {
            this.g.az(((Long) this.d.invoke(null, Long.valueOf(this.i))).longValue());
        }
    }
}
