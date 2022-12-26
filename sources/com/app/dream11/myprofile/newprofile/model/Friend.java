package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class Friend implements Serializable {
    private static final long serialVersionUID = -3712781141116579202L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "id")
    private Integer id;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "imageUrl")
    private String imageUrl;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "teamName")
    private String teamName;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "userFullName")
    private String userFullName;

    public Integer getUserId() {
        return this.id;
    }

    public void setUserId(Integer num) {
        this.id = num;
    }

    public String getAvatarUrl() {
        return this.imageUrl;
    }

    public void setAvatarUrl(String str) {
        this.imageUrl = str;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public String getUserFullName() {
        return this.userFullName;
    }

    public String toString() {
        return "Friend{id=" + this.id + ", imageUrl='" + this.imageUrl + "', teamName='" + this.teamName + "', userFullName='" + this.userFullName + "'}";
    }
}
