package com.app.dream11.model.viewmodel;

import com.app.dream11.model.AvatarDetails;
import java.util.List;
/* loaded from: classes6.dex */
public class MyProfileHeaderViewItem {
    private List<AvatarDetails> avatarList;
    private String avtarUrl;
    private boolean changeAvatarVisibility;
    private boolean editProfileVisibility;
    private boolean isSelfProfile;
    private String leaguePlayedHeader;
    private String leaguePlayedValue;
    private String leagueWonHeader;
    private String leagueWonValue;
    private String name;
    private boolean stateIconVisibility;
    private String stateName;

    public List<AvatarDetails> getAvatarList() {
        return this.avatarList;
    }

    public void setAvatarList(List<AvatarDetails> list) {
        this.avatarList = list;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getAvtarUrl() {
        return this.avtarUrl;
    }

    public void setAvtarUrl(String str) {
        this.avtarUrl = str;
    }

    public boolean isEditProfileVisibility() {
        return this.editProfileVisibility;
    }

    public void setEditProfileVisibility(boolean z) {
        this.editProfileVisibility = z;
    }

    public boolean isChangeAvatarVisibility() {
        return this.changeAvatarVisibility;
    }

    public void setChangeAvatarVisibility(boolean z) {
        this.changeAvatarVisibility = z;
    }

    public String getLeaguePlayedHeader() {
        return this.leaguePlayedHeader;
    }

    public void setLeaguePlayedHeader(String str) {
        this.leaguePlayedHeader = str;
    }

    public String getLeaguePlayedValue() {
        return this.leaguePlayedValue;
    }

    public void setLeaguePlayedValue(String str) {
        this.leaguePlayedValue = str;
    }

    public String getLeagueWonHeader() {
        return this.leagueWonHeader;
    }

    public void setLeagueWonHeader(String str) {
        this.leagueWonHeader = str;
    }

    public String getLeagueWonValue() {
        return this.leagueWonValue;
    }

    public void setLeagueWonValue(String str) {
        this.leagueWonValue = str;
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String str) {
        this.stateName = str;
    }

    public boolean isStateIconVisibility() {
        return this.stateIconVisibility;
    }

    public void setStateIconVisibility(boolean z) {
        this.stateIconVisibility = z;
    }

    public boolean isSelfProfile() {
        return this.isSelfProfile;
    }

    public void setSelfProfile(boolean z) {
        this.isSelfProfile = z;
    }
}
