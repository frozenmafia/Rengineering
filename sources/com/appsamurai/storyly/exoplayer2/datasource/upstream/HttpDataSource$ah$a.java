package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class HttpDataSource$ah$a {
    private final Map<String, String> ag$a = new HashMap();
    private Map<String, String> ah$a;

    public Map<String, String> ah$a() {
        Map<String, String> map;
        synchronized (this) {
            if (this.ah$a == null) {
                this.ah$a = Collections.unmodifiableMap(new HashMap(this.ag$a));
            }
            map = this.ah$a;
        }
        return map;
    }
}
