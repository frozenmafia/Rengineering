package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.esp.EspVersion;
import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = u.class)
/* loaded from: classes7.dex */
public abstract class bc {
    public static bc create(EspVersion espVersion, EspVersion espVersion2, String str, String str2) {
        return create(bd.create(espVersion), bd.create(espVersion2), str, str2);
    }

    public abstract bd adapterVersion();

    public abstract String name();

    public abstract bd sdkVersion();

    public abstract String signals();

    public static bc create(bd bdVar, bd bdVar2, String str, String str2) {
        return new u(bdVar, bdVar2, str, str2);
    }
}
