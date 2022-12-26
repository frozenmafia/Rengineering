package com.google.ads.interactivemedia.v3.internal;

import android.media.metrics.LogSessionId;
/* loaded from: classes4.dex */
public final class iv {
    private final iu a;

    static {
        if (cp.a < 31) {
            new iv();
        } else {
            iu iuVar = iu.a;
        }
    }

    public iv() {
        this((iu) null);
        af.w(cp.a < 31);
    }

    private iv(iu iuVar) {
        this.a = iuVar;
    }

    public final LogSessionId a() {
        iu iuVar = this.a;
        af.s(iuVar);
        return iuVar.f1107b;
    }

    public iv(LogSessionId logSessionId) {
        this(new iu(logSessionId));
    }
}
