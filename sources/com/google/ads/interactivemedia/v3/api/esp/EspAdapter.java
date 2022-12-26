package com.google.ads.interactivemedia.v3.api.esp;

import android.content.Context;
/* loaded from: classes4.dex */
public interface EspAdapter {
    void collectSignals(Context context, EspCollectSignalsCallback espCollectSignalsCallback);

    EspVersion getSDKVersion();

    EspVersion getVersion();

    void initialize(Context context, EspInitializeCallback espInitializeCallback);
}
