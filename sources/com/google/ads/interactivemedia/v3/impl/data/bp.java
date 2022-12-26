package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = ae.class)
/* loaded from: classes4.dex */
public abstract class bp {
    static bp create(String str, String str2) {
        return new ae(str, str2);
    }

    public static bp create(Throwable th) {
        return new ae(th.getClass().getName(), th.getMessage());
    }

    public abstract String message();

    public abstract String name();
}
