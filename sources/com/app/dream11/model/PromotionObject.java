package com.app.dream11.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class PromotionObject extends BaseObservable implements Serializable {
    String description;
    boolean isSelected;
    double promotionAmount;
    int promotionId;
    double reducedEntryFee;

    public String getDescription() {
        return this.description;
    }

    public double getPromotionAmount() {
        return this.promotionAmount;
    }

    public int getPromotionId() {
        return this.promotionId;
    }

    @Bindable
    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
        notifyPropertyChanged(364);
    }

    public double getReducedEntryFee() {
        return this.reducedEntryFee;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setPromotionAmount(double d) {
        this.promotionAmount = d;
    }

    public void setPromotionId(int i) {
        this.promotionId = i;
    }

    public void setReducedEntryFee(double d) {
        this.reducedEntryFee = d;
    }
}
