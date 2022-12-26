package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class ProfileLeaderBoardRequest extends CommonRequest {
    boolean getTourList;
    int tourId;

    public ProfileLeaderBoardRequest(int i, boolean z, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.tourId = i;
        this.getTourList = z;
    }

    public int getTourId() {
        return this.tourId;
    }

    public void setTourId(int i) {
        this.tourId = i;
    }

    public void setGetTourList(boolean z) {
        this.getTourList = z;
    }

    public boolean isGetTourList() {
        return this.getTourList;
    }
}
