package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
import o.loadFont;
/* loaded from: classes6.dex */
public class NextRewardsInfo implements Serializable {
    private static final long serialVersionUID = -1861505487193517867L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "level")
    private Integer level;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "rewards")
    private List<MyReward> rewards;
    private List<MyReward> rewardsToDisplay;

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setRewards(List<MyReward> list) {
        this.rewards = list;
    }

    public Integer getLevel() {
        return this.level;
    }

    public List<MyReward> getRewards() {
        return this.rewards;
    }

    public List<MyReward> getRewardsToDisplay() {
        if (this.rewardsToDisplay == null) {
            this.rewardsToDisplay = new ArrayList();
            if (loadFont.ag$a(this.rewards)) {
                if (this.rewards.size() > 3) {
                    this.rewardsToDisplay.addAll(this.rewards.subList(0, 3));
                } else {
                    this.rewardsToDisplay.addAll(this.rewards);
                }
            }
        }
        return this.rewardsToDisplay;
    }

    public String toString() {
        return "NextRewardsInfo{level=" + this.level + ", rewards=" + this.rewards + '}';
    }
}
