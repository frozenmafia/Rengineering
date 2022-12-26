package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class ber {
    private HashMap a = new HashMap();

    public final bes a() {
        HashMap hashMap = this.a;
        if (hashMap == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        bes besVar = new bes(Collections.unmodifiableMap(hashMap));
        this.a = null;
        return besVar;
    }
}
