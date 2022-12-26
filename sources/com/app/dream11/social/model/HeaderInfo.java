package com.app.dream11.social.model;

import com.app.dream11.core.service.graphql.api.type.UserType;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class HeaderInfo implements Serializable {
    String imgUrl;
    long loyaltyLevel;
    String officialTickUrl;
    String teamName;
    UserType userType;

    public HeaderInfo(String str, long j, String str2, UserType userType, String str3) {
        this.teamName = str;
        this.loyaltyLevel = j;
        this.imgUrl = str2;
        this.userType = userType;
        this.officialTickUrl = str3;
    }

    public HeaderInfo() {
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public long getLoyaltyLevel() {
        return this.loyaltyLevel;
    }

    public void setLoyaltyLevel(long j) {
        this.loyaltyLevel = j;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public UserType getUserType() {
        return this.userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getOfficialTickUrl() {
        return this.officialTickUrl;
    }

    public void setOfficialTickUrl(String str) {
        this.officialTickUrl = str;
    }
}
