package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
/* loaded from: classes4.dex */
public final class ani extends alo {
    public Long a;

    /* renamed from: b  reason: collision with root package name */
    public Long f651b;

    public ani() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alo
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(1, this.f651b);
        return hashMap;
    }

    public ani(String str) {
        HashMap a = a(str);
        if (a != null) {
            this.a = (Long) a.get(0);
            this.f651b = (Long) a.get(1);
        }
    }
}
