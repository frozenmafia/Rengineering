package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class dq {
    private final Map a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map f1017b;

    public final Map a() {
        Map map;
        synchronized (this) {
            if (this.f1017b == null) {
                this.f1017b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            map = this.f1017b;
        }
        return map;
    }
}
