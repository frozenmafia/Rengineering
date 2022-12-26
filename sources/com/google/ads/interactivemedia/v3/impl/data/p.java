package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
/* loaded from: classes4.dex */
public final /* synthetic */ class p {
    public static boolean a(BaseDisplayContainer baseDisplayContainer, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        return resizeAndPositionVideoMsgData.x().intValue() >= 0 && resizeAndPositionVideoMsgData.width().intValue() >= 0 && resizeAndPositionVideoMsgData.x().intValue() + resizeAndPositionVideoMsgData.width().intValue() <= baseDisplayContainer.getAdContainer().getWidth() && resizeAndPositionVideoMsgData.y().intValue() >= 0 && resizeAndPositionVideoMsgData.height().intValue() >= 0 && resizeAndPositionVideoMsgData.y().intValue() + resizeAndPositionVideoMsgData.height().intValue() <= baseDisplayContainer.getAdContainer().getHeight();
    }
}
