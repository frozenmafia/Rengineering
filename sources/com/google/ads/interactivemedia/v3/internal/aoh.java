package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes4.dex */
public final class aoh extends aow {
    private final amw h;
    private final long i;
    private final long j;

    public aoh(anl anlVar, age ageVar, int i, amw amwVar, long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", ageVar, i, 11, null, null, null);
        this.h = amwVar;
        this.i = j;
        this.j = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        amw amwVar = this.h;
        if (amwVar != null) {
            amu amuVar = new amu((String) this.d.invoke(null, amwVar.b(), Long.valueOf(this.i), Long.valueOf(this.j)));
            synchronized (this.g) {
                this.g.ai(amuVar.a.longValue());
                if (amuVar.f643b.longValue() >= 0) {
                    this.g.aA(amuVar.f643b.longValue());
                }
                if (amuVar.c.longValue() >= 0) {
                    this.g.O(amuVar.c.longValue());
                }
            }
        }
    }
}
