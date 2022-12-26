package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* loaded from: classes4.dex */
public final class cj implements bm {
    @Override // com.google.ads.interactivemedia.v3.internal.bm
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bm
    public final bu b(Looper looper, Handler.Callback callback) {
        return new cl(new Handler(looper, callback));
    }
}
