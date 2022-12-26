package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class LeaderBoard implements Serializable {
    private static final long serialVersionUID = 3062904106220070290L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "rank")
    private Integer rank;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "tourId")
    private Integer tourId;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "tourName")
    private String tourName;

    public String getTourName() {
        return this.tourName;
    }

    public void setTourName(String str) {
        this.tourName = str;
    }

    public Integer getTourId() {
        return this.tourId;
    }

    public void setTourId(Integer num) {
        this.tourId = num;
    }

    public Integer getRank() {
        return this.rank;
    }

    public void setRank(Integer num) {
        this.rank = num;
    }

    public String toString() {
        return "LeaderBoard{tourName='" + this.tourName + "', tourId=" + this.tourId + ", rank=" + this.rank + '}';
    }
}
