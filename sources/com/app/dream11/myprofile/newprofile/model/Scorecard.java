package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class Scorecard implements Serializable {
    private static final long serialVersionUID = 7711793054956656155L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "state")
    private String state;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "status")
    private String status;

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "Scorecard{state='" + this.state + "', status='" + this.status + "'}";
    }
}
