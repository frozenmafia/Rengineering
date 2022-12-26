package com.google.ads.interactivemedia.v3.internal;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* loaded from: classes4.dex */
final class ce extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final cg a;

    public ce(cg cgVar) {
        this.a = cgVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        cg.c(this.a, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
