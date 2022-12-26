package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.esp.EspVersion;
import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = v.class)
/* loaded from: classes7.dex */
public abstract class bd {
    public static bd create(int i, int i2, int i3) {
        return new v(i, i2, i3);
    }

    public static bd create(EspVersion espVersion) {
        return create(espVersion.getMajorVersion(), espVersion.getMinorVersion(), espVersion.getMicroVersion());
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();
}
