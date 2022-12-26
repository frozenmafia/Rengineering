package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class LeaderTours implements Serializable {
    private static final long serialVersionUID = 121;
    String TourName;
    String TourPriority;
    String TourShortName;
    String TourTag;
    int id;

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getTourName() {
        return this.TourName;
    }

    public void setTourName(String str) {
        this.TourName = str;
    }

    public String getTourTag() {
        return this.TourTag;
    }

    public void setTourTag(String str) {
        this.TourTag = str;
    }

    public String getTourShortName() {
        return this.TourShortName;
    }

    public void setTourShortName(String str) {
        this.TourShortName = str;
    }

    public String getTourPriority() {
        return this.TourPriority;
    }

    public void setTourPriority(String str) {
        this.TourPriority = str;
    }
}
