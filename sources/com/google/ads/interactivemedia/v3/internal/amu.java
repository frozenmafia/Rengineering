package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
/* loaded from: classes4.dex */
public final class amu extends alo {
    public Long a;

    /* renamed from: b  reason: collision with root package name */
    public Long f643b;
    public Long c;

    public amu() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alo
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.f643b);
        hashMap.put(2, this.c);
        return hashMap;
    }

    public amu(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.f643b = (Long) a.get(1);
            this.c = (Long) a.get(2);
        }
    }
}
