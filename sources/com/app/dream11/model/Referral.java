package com.app.dream11.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class Referral {
    private List<ActiveReferralUserState> active = new ArrayList();
    private List<CompletedReferralUserState> completed = new ArrayList();

    public List<ActiveReferralUserState> getActive() {
        return this.active;
    }

    public void setActive(List<ActiveReferralUserState> list) {
        this.active = list;
    }

    public List<CompletedReferralUserState> getCompleted() {
        return this.completed;
    }

    public void setCompleted(List<CompletedReferralUserState> list) {
        this.completed = list;
    }
}
