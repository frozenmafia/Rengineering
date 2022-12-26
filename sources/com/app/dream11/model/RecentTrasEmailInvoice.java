package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes3.dex */
public class RecentTrasEmailInvoice extends CommonRequest {
    String InvLeagueId;
    String InvTransId;

    public RecentTrasEmailInvoice(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getInvLeagueId() {
        return this.InvLeagueId;
    }

    public void setInvLeagueId(String str) {
        this.InvLeagueId = str;
    }

    public String getInvTransId() {
        return this.InvTransId;
    }

    public void setInvTransId(String str) {
        this.InvTransId = str;
    }
}
