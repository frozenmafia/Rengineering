package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class Rule implements Serializable {
    private static final long serialVersionUID = 8392809730839496411L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "desc")
    private String desc;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "isCompleted")
    private Boolean isCompleted;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "remaining")
    private double remaining;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "total")
    private double total;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "type")
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public void setIsCompleted(Boolean bool) {
        this.isCompleted = bool;
    }

    public Double getRemaining() {
        return Double.valueOf(this.remaining);
    }

    public Double getTotal() {
        return Double.valueOf(this.total);
    }

    public String getMessage() {
        return this.desc;
    }

    public void setRemaining(double d) {
        this.remaining = d;
    }

    public void setTotal(double d) {
        this.total = d;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String toString() {
        return "Rule{type='" + this.type + "', isCompleted=" + this.isCompleted + ", remaining=" + this.remaining + ", total=" + this.total + ", otherMessage='" + this.desc + "'}";
    }
}
