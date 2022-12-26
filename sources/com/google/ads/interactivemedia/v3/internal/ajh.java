package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
/* loaded from: classes4.dex */
final class ajh implements biy {
    @Override // com.google.ads.interactivemedia.v3.internal.biy
    public final /* synthetic */ bis a(Object obj) {
        CompanionAdSlot companionAdSlot = (CompanionAdSlot) obj;
        int width = companionAdSlot.getWidth();
        int height = companionAdSlot.getHeight();
        return new bix(width + "x" + height);
    }
}
