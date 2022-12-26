package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ajn {
    public final AdEvent.AdEventType a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.ads.interactivemedia.v3.impl.data.c f590b;
    public Map c;
    public List d = new ArrayList();
    AdProgressInfo e;
    public double f;

    public ajn(AdEvent.AdEventType adEventType, com.google.ads.interactivemedia.v3.impl.data.c cVar) {
        this.a = adEventType;
        this.f590b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return btn.c(this, obj, new String[0]);
    }

    public final int hashCode() {
        return btp.a(this, new String[0]);
    }
}
