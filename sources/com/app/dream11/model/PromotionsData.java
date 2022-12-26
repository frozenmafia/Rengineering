package com.app.dream11.model;

import java.io.Serializable;
import java.util.List;
import o.isFullSpan;
/* loaded from: classes3.dex */
public class PromotionsData implements Serializable {
    @isFullSpan(valueOf = "allPromotions", values = {"AllPromotions"})
    List<PromotionObject> allPromotions;
    @isFullSpan(valueOf = "minReducedEntryFee", values = {"MinReducedEntryFee"})
    Double minReducedEntryFee;
    @isFullSpan(valueOf = "selectedPromotionId", values = {"bestPromotionId"})
    int selectedPromotionId = Integer.MIN_VALUE;

    public Double getMinReducedEntryFee() {
        return this.minReducedEntryFee;
    }

    public List<PromotionObject> getAllPromotions() {
        return this.allPromotions;
    }

    public int getSelectedPromotionId() {
        return this.selectedPromotionId;
    }

    public void setSelectedPromotionId(int i) {
        this.selectedPromotionId = i;
    }

    public void setAllPromotions(List<PromotionObject> list) {
        this.allPromotions = list;
    }

    public void setMinReducedEntryFee(Double d) {
        this.minReducedEntryFee = d;
    }
}
