package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import java.util.List;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class UserRewardsInfo implements Serializable {
    private static final long serialVersionUID = -5010232499995117410L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "availedRewards")
    private List<MyReward> myRewards;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "nextRewards")
    private NextRewardsInfo nextRewards;

    public void setNextRewards(NextRewardsInfo nextRewardsInfo) {
        this.nextRewards = nextRewardsInfo;
    }

    public void setMyRewards(List<MyReward> list) {
        this.myRewards = list;
    }

    public List<MyReward> getMyRewards() {
        return this.myRewards;
    }

    public NextRewardsInfo getNextRewards() {
        return this.nextRewards;
    }

    public String toString() {
        return "UserRewardsInfo{nextRewards=" + this.nextRewards + ", myRewards=" + this.myRewards + '}';
    }
}
