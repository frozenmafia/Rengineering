package com.app.dream11.model;

import java.util.List;
/* loaded from: classes3.dex */
public class PaymentOptionList {
    private List<PaymentOptions> gatwayNames;
    private boolean isFooterVisible;
    private List<SaveCardDetails> saveCardLists;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public List<PaymentOptions> getGatwayNames() {
        return this.gatwayNames;
    }

    public void setGatwayNames(List<PaymentOptions> list) {
        this.gatwayNames = list;
    }

    public boolean isFootarVisible() {
        return this.isFooterVisible;
    }

    public void setFootarVisible(boolean z) {
        this.isFooterVisible = z;
    }

    public List<SaveCardDetails> getSaveCardLists() {
        return this.saveCardLists;
    }

    public void setSaveCardLists(List<SaveCardDetails> list) {
        this.saveCardLists = list;
    }
}
