package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = af.class)
/* loaded from: classes4.dex */
public abstract class br {
    public static br create(bq bqVar, String str, String str2, String str3, String str4, int i, int i2) {
        return new af(bqVar, str, str2, str4, str3, i, i2);
    }

    public abstract int connectionTimeoutMs();

    public abstract String content();

    public abstract String id();

    public abstract int readTimeoutMs();

    public abstract bq requestType();

    public abstract String url();

    public abstract String userAgent();
}
