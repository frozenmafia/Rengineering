package com.app.dream11.myprofile.newprofile.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import java.io.Serializable;
import java.util.Date;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class MyReward extends BaseObservable implements Serializable {
    private static final long serialVersionUID = -8780059830214631558L;
    private Date claimExpiry;
    private Date claimedOn;
    private String descUrl;
    private String description;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "expiry")
    private long expiry;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "id")
    private String id;
    private String imageUrl;
    private boolean isClaimed;
    private boolean isNextReward;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "isUsed")
    private boolean isUsed;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "label")
    private String label;
    private int level;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "redeemed")
    private long redemption;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "rewardId")
    private Long rewardId;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "subtitle")
    private String subTitle;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "title")
    private String title;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "type")
    private String type;
    private ClaimStatus claimStatus = ClaimStatus.NOT_STARTED;
    private RewardState rewardState = RewardState.$NONE;

    /* loaded from: classes6.dex */
    public enum ClaimStatus {
        NOT_STARTED,
        IN_PROGRESS,
        SUCCESSFULL
    }

    /* loaded from: classes6.dex */
    public enum RewardState {
        CLAIMED,
        EXPIRED,
        NOT_CLAIMED,
        $NONE
    }

    public boolean isClaimed() {
        return this.isClaimed;
    }

    public void setClaimed(boolean z) {
        this.isClaimed = z;
    }

    public Date getClaimedOn() {
        return this.claimedOn;
    }

    public void setClaimedOn(Date date) {
        this.claimedOn = date;
    }

    public Date getClaimExpiry() {
        return this.claimExpiry;
    }

    public void setClaimExpiry(Date date) {
        this.claimExpiry = date;
    }

    public void setRewardId(Long l) {
        this.rewardId = l;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public Long getExpiry() {
        return Long.valueOf(this.expiry);
    }

    public Boolean getIsUsed() {
        return Boolean.valueOf(this.isUsed);
    }

    public void setIsUsed(Boolean bool) {
        this.isUsed = bool.booleanValue();
    }

    public long getRedemption() {
        return this.redemption;
    }

    public void setExpiry(long j) {
        this.expiry = j;
    }

    public void setRedemption(long j) {
        this.redemption = j;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public int getLevel() {
        return this.level;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public boolean isNextReward() {
        return this.isNextReward;
    }

    public void setNextReward(boolean z) {
        this.isNextReward = z;
    }

    public RewardState getRewardState() {
        return this.rewardState;
    }

    public void setRewardState(RewardState rewardState) {
        this.rewardState = rewardState;
    }

    public String getDescUrl() {
        return this.descUrl;
    }

    public void setDescUrl(String str) {
        this.descUrl = str;
    }

    @Bindable
    public ClaimStatus getClaimStatus() {
        return this.claimStatus;
    }

    public void setClaimStatus(ClaimStatus claimStatus) {
        this.claimStatus = claimStatus;
        notifyPropertyChanged(29);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String toString() {
        return "MyReward{rewardId=" + this.rewardId + ", type='" + this.type + "', title='" + this.title + "', subTitle='" + this.subTitle + "', expiry=" + this.expiry + ", redemption=" + this.redemption + ", isUsed=" + this.isUsed + '}';
    }
}
