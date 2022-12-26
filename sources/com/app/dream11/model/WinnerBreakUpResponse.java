package com.app.dream11.model;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public class WinnerBreakUpResponse {
    private String CurrencySymbol;
    private ArrayList<BreakUp> Multiple;

    public ArrayList<BreakUp> getMultiple() {
        return this.Multiple;
    }

    public void setMultiple(ArrayList<BreakUp> arrayList) {
        this.Multiple = arrayList;
    }

    public String getCurrencySymbol() {
        return this.CurrencySymbol;
    }

    public void setCurrencySymbol(String str) {
        this.CurrencySymbol = str;
    }
}
