package com.app.dream11.matchcentre.offer;

import com.app.dream11.core.service.graphql.api.MyPromotionsQuery;
import java.io.Serializable;
import java.util.List;
import o.TimeCycleSplineSet;
/* loaded from: classes3.dex */
public class OfferVm implements Serializable {
    OfferVm$ah$a handler;
    private boolean isEventTriggered = false;
    private boolean isPerfEventsTriggered;
    public List<MyPromotionsQuery.PromotionFeedBanner> response;

    public OfferVm(boolean z) {
        this.isPerfEventsTriggered = false;
        this.isPerfEventsTriggered = z;
    }

    public List<MyPromotionsQuery.PromotionFeedBanner> getResponse() {
        return this.response;
    }

    public void setResponse(List<MyPromotionsQuery.PromotionFeedBanner> list) {
        this.response = list;
    }

    public OfferVm$ah$a getHandler() {
        return this.handler;
    }

    public void setHandler(OfferVm$ah$a offerVm$ah$a) {
        this.handler = offerVm$ah$a;
    }

    public String getContentDescriptionForBannerImage(int i) {
        return (i != 0 || this.isPerfEventsTriggered) ? "" : "Feed_Banner";
    }

    public boolean enableTracker(int i) {
        if (i != 0 || this.isPerfEventsTriggered || this.isEventTriggered) {
            return false;
        }
        this.isEventTriggered = true;
        return true;
    }

    public String getLoadInstanceId() {
        return TimeCycleSplineSet.ah$a.values();
    }

    public String getSource() {
        return TimeCycleSplineSet.ah$a.ag$a();
    }
}
