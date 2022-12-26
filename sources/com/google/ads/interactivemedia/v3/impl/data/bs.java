package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = ag.class)
/* loaded from: classes4.dex */
public abstract class bs {
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    private static bs create(String str, String str2, String str3, int i) {
        return new ag(str, str2, str3, i);
    }

    public static bs forError(String str, int i) {
        return create(str, "", "unknown", i);
    }

    public static bs forResponse(String str, String str2) {
        return forResponse(str, str2, "unknown");
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();

    public static bs forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }
}
