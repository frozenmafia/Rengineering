package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
/* loaded from: classes4.dex */
public final class aoe extends aow {
    private final Map h;
    private final View i;

    public aoe(anl anlVar, age ageVar, int i, Map map, View view, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anlVar, "RKC3mFMqGi7xOgQ7s39JMoZe9bnzGCFipcdUUf0vlgHDkBg7SvMkVmBGpwLs06ia", "8Xr1ilYJHo+oWZQAYAG91DIHBuqEmXK8yHtxL6KkyfU=", ageVar, i, 85, null, null, null);
        this.h = map;
        this.i = view;
    }

    private final long c(int i) {
        Map map = this.h;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.h.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aow
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.d.invoke(null, new long[]{c(1), c(2)}, this.a.b(), this.i);
        long j = jArr[0];
        this.h.put(1, Long.valueOf(jArr[1]));
        long j2 = jArr[2];
        this.h.put(2, Long.valueOf(jArr[3]));
        synchronized (this.g) {
            this.g.ae(j);
            this.g.ad(j2);
        }
    }
}
