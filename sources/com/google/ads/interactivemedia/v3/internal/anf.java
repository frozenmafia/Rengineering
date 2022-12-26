package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
/* loaded from: classes4.dex */
public final class anf extends alo {
    public Long a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f649b;
    public Boolean c;

    public anf() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alo
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.f649b);
        hashMap.put(2, this.c);
        return hashMap;
    }

    public anf(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.f649b = (Boolean) a.get(1);
            this.c = (Boolean) a.get(2);
        }
    }
}
