package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.avb;
import com.google.ads.interactivemedia.v3.internal.avk;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class l extends e {
    private int bitrate;
    private boolean disableUi;
    private boolean enableFocusSkipButton;
    private boolean enablePreloading;
    private int loadVideoTimeout;
    private avb<String> mimeTypes;
    private double playAdsAfterTime;
    private byte set$0;
    private avk<UiElement> uiElements;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l() {
    }

    private l(f fVar) {
        this.bitrate = fVar.bitrate();
        this.mimeTypes = fVar.mimeTypes();
        this.uiElements = fVar.uiElements();
        this.enablePreloading = fVar.enablePreloading();
        this.enableFocusSkipButton = fVar.enableFocusSkipButton();
        this.playAdsAfterTime = fVar.playAdsAfterTime();
        this.disableUi = fVar.disableUi();
        this.loadVideoTimeout = fVar.loadVideoTimeout();
        this.set$0 = (byte) 63;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l(f fVar, k kVar) {
        this(fVar);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public f build() {
        if (this.set$0 != 63) {
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" bitrate");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" enablePreloading");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" enableFocusSkipButton");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" playAdsAfterTime");
            }
            if ((this.set$0 & 16) == 0) {
                sb.append(" disableUi");
            }
            if ((this.set$0 & 32) == 0) {
                sb.append(" loadVideoTimeout");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new n(this.bitrate, this.mimeTypes, this.uiElements, this.enablePreloading, this.enableFocusSkipButton, this.playAdsAfterTime, this.disableUi, this.loadVideoTimeout, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setBitrate(int i) {
        this.bitrate = i;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setDisableUi(boolean z) {
        this.disableUi = z;
        this.set$0 = (byte) (this.set$0 | 16);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setEnableFocusSkipButton(boolean z) {
        this.enableFocusSkipButton = z;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setEnablePreloading(boolean z) {
        this.enablePreloading = z;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setLoadVideoTimeout(int i) {
        this.loadVideoTimeout = i;
        this.set$0 = (byte) (this.set$0 | 32);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setMimeTypes(List<String> list) {
        this.mimeTypes = list == null ? null : avb.m(list);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setPlayAdsAfterTime(double d) {
        this.playAdsAfterTime = d;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setUiElements(Set<UiElement> set) {
        this.uiElements = set == null ? null : avk.l(set);
        return this;
    }
}
