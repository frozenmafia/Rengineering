package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
/* loaded from: classes4.dex */
public final class aom extends aow {
    private List h;

    public aom(anl anlVar, age ageVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", ageVar, i, 31, null, null, null);
        this.h = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.g.aG(-1L);
        this.g.aC(-1L);
        if (this.h == null) {
            this.h = (List) this.d.invoke(null, this.a.b());
        }
        List list = this.h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.g) {
            this.g.aG(((Long) this.h.get(0)).longValue());
            this.g.aC(((Long) this.h.get(1)).longValue());
        }
    }
}
