package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
/* loaded from: classes4.dex */
public interface ajo {
    void b(ajn ajnVar);

    void f(AdError.AdErrorType adErrorType, int i, String str);

    void g(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str);

    void h(String str);

    void i(ViewGroup viewGroup, CompanionData companionData, String str, CompanionAdSlot companionAdSlot, ajq ajqVar, all allVar);

    void j(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData);

    void k();
}
