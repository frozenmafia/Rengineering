package com.app.dream11.withdraw;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class Bank implements Serializable {
    long id;
    String imageUrl;
    String name;
    String promotionText;
    String status;

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPromotionText() {
        return this.promotionText;
    }

    public void setPromotionText(String str) {
        this.promotionText = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getStatus() {
        return this.status;
    }
}
