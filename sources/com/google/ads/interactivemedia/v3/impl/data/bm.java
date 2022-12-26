package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = ad.class)
/* loaded from: classes4.dex */
public abstract class bm {
    public static bm create(long j, bk bkVar, bl blVar) {
        return new ad(j, bkVar, blVar, null);
    }

    public abstract bk component();

    public abstract bp loggableException();

    public abstract bl method();

    public abstract long timestamp();

    static bm create(long j, bk bkVar, bl blVar, bp bpVar) {
        return new ad(j, bkVar, blVar, bpVar);
    }

    public static bm create(long j, bk bkVar, bl blVar, Throwable th) {
        return create(j, bkVar, blVar, bp.create(th));
    }
}
