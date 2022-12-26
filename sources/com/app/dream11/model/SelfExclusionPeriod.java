package com.app.dream11.model;
/* loaded from: classes6.dex */
public class SelfExclusionPeriod {
    private int id;
    private String text;

    public SelfExclusionPeriod(String str, int i) {
        this.text = str;
        this.id = i;
    }

    public String getText() {
        return this.text;
    }

    public int getId() {
        return this.id;
    }
}
