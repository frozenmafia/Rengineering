package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
/* loaded from: classes4.dex */
public final class amz extends alo {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public long f645b;

    public amz() {
        this.a = -1L;
        this.f645b = -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alo
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.a));
        hashMap.put(1, Long.valueOf(this.f645b));
        return hashMap;
    }

    public amz(String str) {
        this.a = -1L;
        this.f645b = -1L;
        HashMap a = a(str);
        if (a != null) {
            this.a = ((Long) a.get(0)).longValue();
            this.f645b = ((Long) a.get(1)).longValue();
        }
    }
}
