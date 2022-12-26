package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;
/* loaded from: classes4.dex */
public abstract class e {
    public abstract f build();

    abstract e setBitrate(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e setDisableUi(boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e setEnableFocusSkipButton(boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e setEnablePreloading(boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e setLoadVideoTimeout(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e setMimeTypes(List<String> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e setPlayAdsAfterTime(double d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract e setUiElements(Set<UiElement> set);
}
