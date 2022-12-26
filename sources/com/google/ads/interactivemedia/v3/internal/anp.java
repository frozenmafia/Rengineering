package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
/* loaded from: classes4.dex */
public final class anp extends alo {
    public Long a;

    /* renamed from: b  reason: collision with root package name */
    public Long f657b;
    public Long c;
    public Long d;
    public Long e;

    public anp() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alo
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.f657b);
        hashMap.put(2, this.c);
        hashMap.put(3, this.d);
        hashMap.put(4, this.e);
        return hashMap;
    }

    public anp(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.f657b = (Long) a.get(1);
            this.c = (Long) a.get(2);
            this.d = (Long) a.get(3);
            this.e = (Long) a.get(4);
        }
    }
}
