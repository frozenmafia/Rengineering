package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class ReferralSummaryRequest extends CommonRequest {
    private int userId;

    public ReferralSummaryRequest(int i, onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
        this.userId = i;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int i) {
        this.userId = i;
    }
}
