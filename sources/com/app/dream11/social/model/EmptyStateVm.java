package com.app.dream11.social.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class EmptyStateVm implements Serializable {
    private String desc;
    private int imageResId;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImageResId(int i) {
        this.imageResId = i;
    }

    public int getImageResId() {
        return this.imageResId;
    }
}
