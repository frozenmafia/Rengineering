package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.avb;
import com.google.ads.interactivemedia.v3.internal.avk;
/* loaded from: classes4.dex */
final class n extends f {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final avb<String> mimeTypes;
    private final double playAdsAfterTime;
    private final avk<UiElement> uiElements;

    private n(int i, avb<String> avbVar, avk<UiElement> avkVar, boolean z, boolean z2, double d, boolean z3, int i2) {
        this.bitrate = i;
        this.mimeTypes = avbVar;
        this.uiElements = avkVar;
        this.enablePreloading = z;
        this.enableFocusSkipButton = z2;
        this.playAdsAfterTime = d;
        this.disableUi = z3;
        this.loadVideoTimeout = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(int i, avb avbVar, avk avkVar, boolean z, boolean z2, double d, boolean z3, int i2, m mVar) {
        this(i, avbVar, avkVar, z, z2, d, z3, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.bitrate == fVar.bitrate()) {
                avb<String> avbVar = this.mimeTypes;
                if (avbVar == null) {
                    if (fVar.mimeTypes() != null) {
                        return false;
                    }
                } else if (!avbVar.equals(fVar.mimeTypes())) {
                    return false;
                }
                avk<UiElement> avkVar = this.uiElements;
                if (avkVar == null) {
                    if (fVar.uiElements() != null) {
                        return false;
                    }
                } else if (!avkVar.equals(fVar.uiElements())) {
                    return false;
                }
                return this.enablePreloading == fVar.enablePreloading() && this.enableFocusSkipButton == fVar.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(fVar.playAdsAfterTime()) && this.disableUi == fVar.disableUi() && this.loadVideoTimeout == fVar.loadVideoTimeout();
            }
            return false;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public avb<String> mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    e toBuilder() {
        return new l(this, null);
    }

    public String toString() {
        int i = this.bitrate;
        String valueOf = String.valueOf(this.mimeTypes);
        String valueOf2 = String.valueOf(this.uiElements);
        boolean z = this.enablePreloading;
        boolean z2 = this.enableFocusSkipButton;
        double d = this.playAdsAfterTime;
        boolean z3 = this.disableUi;
        int i2 = this.loadVideoTimeout;
        return "AdsRenderingSettingsData{bitrate=" + i + ", mimeTypes=" + valueOf + ", uiElements=" + valueOf2 + ", enablePreloading=" + z + ", enableFocusSkipButton=" + z2 + ", playAdsAfterTime=" + d + ", disableUi=" + z3 + ", loadVideoTimeout=" + i2 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public avk<UiElement> uiElements() {
        return this.uiElements;
    }

    public int hashCode() {
        int i = this.bitrate;
        avb<String> avbVar = this.mimeTypes;
        int hashCode = avbVar == null ? 0 : avbVar.hashCode();
        avk<UiElement> avkVar = this.uiElements;
        int hashCode2 = avkVar != null ? avkVar.hashCode() : 0;
        int i2 = true != this.enablePreloading ? 1237 : 1231;
        int i3 = true != this.enableFocusSkipButton ? 1237 : 1231;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003) ^ (true != this.disableUi ? 1237 : 1231)) * 1000003) ^ this.loadVideoTimeout;
    }
}
