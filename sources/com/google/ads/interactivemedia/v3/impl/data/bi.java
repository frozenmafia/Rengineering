package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = ac.class)
/* loaded from: classes4.dex */
public abstract class bi {
    public static bi create(String str, String str2, boolean z, String str3, int i) {
        return new ac(str, str2, z, str3, i);
    }

    public abstract String appSetId();

    public abstract int appSetIdScope();

    public abstract String deviceId();

    public abstract String idType();

    public abstract boolean isLimitedAdTracking();
}
