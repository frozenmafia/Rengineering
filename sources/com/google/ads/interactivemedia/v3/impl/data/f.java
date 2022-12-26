package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.ass;
import com.google.ads.interactivemedia.v3.internal.avb;
import com.google.ads.interactivemedia.v3.internal.avk;
@ass(a = n.class)
/* loaded from: classes4.dex */
public abstract class f {
    public static e builder(AdsRenderingSettings adsRenderingSettings) {
        g gVar = (g) adsRenderingSettings;
        l lVar = new l();
        lVar.setBitrate(gVar.getBitrateKbps());
        lVar.setDisableUi(gVar.getDisableUi());
        lVar.setEnablePreloading(gVar.getEnablePreloading());
        lVar.setEnableFocusSkipButton(gVar.getFocusSkipButtonWhenAvailable());
        lVar.setLoadVideoTimeout(gVar.getLoadVideoTimeout());
        lVar.setMimeTypes(gVar.getMimeTypes());
        lVar.setPlayAdsAfterTime(gVar.getPlayAdsAfterTime());
        lVar.setUiElements(gVar.getUiElements());
        return lVar;
    }

    public abstract int bitrate();

    public abstract boolean disableUi();

    public abstract boolean enableFocusSkipButton();

    public abstract boolean enablePreloading();

    public abstract int loadVideoTimeout();

    public abstract avb<String> mimeTypes();

    public abstract double playAdsAfterTime();

    abstract e toBuilder();

    public abstract avk<UiElement> uiElements();
}
