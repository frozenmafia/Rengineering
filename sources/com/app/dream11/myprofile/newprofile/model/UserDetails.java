package com.app.dream11.myprofile.newprofile.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class UserDetails extends BaseObservable implements Serializable {
    private static final long serialVersionUID = -5010232499995117410L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "accountVerified")
    private Boolean accountVerified = true;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "allowTeamNameChange")
    private Boolean allowTeamNameChange;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "imageUrl")
    private String avatarUrl;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "bgUrl")
    private String bgUrl;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "emailId")
    private String emailId;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "isSelfProfile")
    private Boolean isSelfProfile;
    private String location;
    private String longDesc;
    private String name;
    private String officialTick;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "commMobNum")
    private String phoneNumber;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "playingSince")
    private String playingSince;
    private String shortDesc;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "shortRefCode")
    private String shortRefCode;
    private boolean shouldShowFb;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "state")
    private String state;
    private String tagLine;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "teamName")
    private String teamName;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "userFullName")
    private String userFullName;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "userId")
    private Integer userId;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "userLevelInfo")
    private UserLevelInfo userLevelInfo;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "userRewardsInfo")
    private UserRewardsInfo userRewardsInfo;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "utmRef")
    private String utmRef;
    private String website;

    public Boolean getIsSelfProfile() {
        return this.isSelfProfile;
    }

    public void setSelfProfile(Boolean bool) {
        this.isSelfProfile = bool;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public String getUtmRef() {
        return this.utmRef;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public String getState() {
        return this.state;
    }

    public String getShortRefCode() {
        return this.shortRefCode;
    }

    public Boolean getAllowTeamNameChange() {
        return this.allowTeamNameChange;
    }

    public UserLevelInfo getUserLevelInfo() {
        return this.userLevelInfo;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getBgUrl() {
        return this.bgUrl;
    }

    public void setBgUrl(String str) {
        this.bgUrl = str;
    }

    public Boolean getAccountVerified() {
        return this.accountVerified;
    }

    public void setAccountVerified(Boolean bool) {
        this.accountVerified = bool;
    }

    public String getPlayingSince() {
        return this.playingSince;
    }

    public UserRewardsInfo getUserRewardsInfo() {
        return this.userRewardsInfo;
    }

    public void setUserRewardsInfo(UserRewardsInfo userRewardsInfo) {
        this.userRewardsInfo = userRewardsInfo;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setEmailId(String str) {
        this.emailId = str;
    }

    public void setUserFullName(String str) {
        this.userFullName = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setAllowTeamNameChange(Boolean bool) {
        this.allowTeamNameChange = bool;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public void setUserLevelInfo(UserLevelInfo userLevelInfo) {
        this.userLevelInfo = userLevelInfo;
    }

    public String getUserFullName() {
        return this.userFullName;
    }

    public String getOfficialTick() {
        return this.officialTick;
    }

    public void setOfficialTick(String str) {
        this.officialTick = str;
    }

    public String getTagLine() {
        return this.tagLine;
    }

    public void setTagLine(String str) {
        this.tagLine = str;
    }

    public String getShortDesc() {
        return this.shortDesc;
    }

    public void setShortDesc(String str) {
        this.shortDesc = str;
    }

    public String getLongDesc() {
        return this.longDesc;
    }

    public void setLongDesc(String str) {
        this.longDesc = str;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String str) {
        this.website = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "UserDetails{isSelfProfile=" + this.isSelfProfile + ", userId=" + this.userId + ", emailId='" + this.emailId + "', utmRef='" + this.utmRef + "', teamName='" + this.teamName + "', userFullName='" + this.userFullName + "', phoneNumber='" + this.phoneNumber + "', avatarUrl='" + this.avatarUrl + "', state='" + this.state + "', bgUrl='" + this.bgUrl + "', shortRefCode='" + this.shortRefCode + "', playingSince='" + this.playingSince + "', allowTeamNameChange=" + this.allowTeamNameChange + ", userLevelInfo=" + this.userLevelInfo + ", userRewardsInfo=" + this.userRewardsInfo + ", accountVerified=" + this.accountVerified + '}';
    }

    public void shouldShowImportFb(boolean z) {
        this.shouldShowFb = z;
        notifyPropertyChanged(398);
    }

    @Bindable
    public boolean isShouldShowFb() {
        return this.shouldShowFb;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setPlayingSince(String str) {
        this.playingSince = str;
    }

    public void setShortRefCode(String str) {
        this.shortRefCode = str;
    }
}
