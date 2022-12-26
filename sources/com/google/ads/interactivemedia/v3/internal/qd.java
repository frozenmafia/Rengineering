package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class qd implements ru {
    public final String t;
    public final List u;
    public final boolean v;

    /* JADX INFO: Access modifiers changed from: protected */
    public qd(String str, List list, boolean z) {
        this.t = str;
        this.u = Collections.unmodifiableList(list);
        this.v = z;
    }
}
