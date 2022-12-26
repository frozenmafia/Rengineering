package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class LeaderBoardRoundRequest extends CommonRequest {
    int gamerId;
    int tourId;

    public LeaderBoardRoundRequest(int i, int i2, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.tourId = i;
        this.gamerId = i2;
    }

    public int getTourId() {
        return this.tourId;
    }

    public int getGamerId() {
        return this.gamerId;
    }
}
