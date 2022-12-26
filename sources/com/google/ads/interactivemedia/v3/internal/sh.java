package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class sh extends ef {

    /* renamed from: b  reason: collision with root package name */
    private final int f1266b;
    private final int c;
    private final int[] d;
    private final int[] e;
    private final be[] f;
    private final Object[] g;
    private final HashMap h;

    public sh(Collection collection, ue ueVar) {
        super(ueVar);
        int size = collection.size();
        this.d = new int[size];
        this.e = new int[size];
        this.f = new be[size];
        this.g = new Object[size];
        this.h = new HashMap();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            sj sjVar = (sj) it.next();
            be[] beVarArr = this.f;
            be j = sjVar.a.j();
            beVarArr[i3] = j;
            this.e[i3] = i;
            this.d[i3] = i2;
            i += j.c();
            i2 += this.f[i3].b();
            Object[] objArr = this.g;
            Object obj = sjVar.f1267b;
            objArr[i3] = obj;
            this.h.put(obj, Integer.valueOf(i3));
            i3++;
        }
        this.f1266b = i;
        this.c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int b() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final int c() {
        return this.f1266b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef
    protected final int r(Object obj) {
        Integer num = (Integer) this.h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef
    protected final int s(int i) {
        return cp.b(this.d, i + 1, false, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef
    protected final int t(int i) {
        return cp.b(this.e, i + 1, false, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef
    protected final int u(int i) {
        return this.d[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef
    protected final int v(int i) {
        return this.e[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef
    protected final be w(int i) {
        return this.f[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ef
    protected final Object z(int i) {
        return this.g[i];
    }
}
