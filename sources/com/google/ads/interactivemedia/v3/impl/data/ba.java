package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = s.class)
/* loaded from: classes4.dex */
public abstract class ba {
    public static ba create(String str, String str2, String str3, String str4) {
        return new s(str, str2, str3, str4);
    }

    public abstract String addtlConsent();

    public abstract String gdprApplies();

    public abstract String tcString();

    public abstract String uspString();
}
