package com.app.dream11.model;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import o.isFullSpan;
/* loaded from: classes.dex */
public class RegisteredUserInfo {
    private String MobileNum;
    private String TeamName;
    private String UserFullName;
    private int UserSegment;
    private String UtmRef;
    private String UtmSource;
    @isFullSpan(valueOf = "IsMobileVerified")
    private String isMobileVerified;
    private String shortRefCode = "";
    private String utmfullstring = "";

    public void setIsMobileVerified(String str) {
        this.isMobileVerified = str;
    }

    public String getUserFullName() {
        return this.UserFullName;
    }

    public void setUserFullName(String str) {
        this.UserFullName = str;
    }

    public String getMobileNum() {
        return this.MobileNum;
    }

    public void setMobileNum(String str) {
        this.MobileNum = str;
    }

    public String getTeamName() {
        return this.TeamName;
    }

    public void setTeamName(String str) {
        this.TeamName = str;
    }

    public int getUserSegment() {
        return this.UserSegment;
    }

    public void setUserSegment(int i) {
        this.UserSegment = i;
    }

    public String getUtmSource() {
        return this.UtmSource;
    }

    public void setUtmSource(String str) {
        this.UtmSource = str;
    }

    public String getUtmRef() {
        return this.UtmRef;
    }

    public void setUtmRef(String str) {
        this.UtmRef = str;
    }

    public String getShortRefCode() {
        return this.shortRefCode;
    }

    public void setShortRefCode(String str) {
        this.shortRefCode = str;
    }

    public boolean isMobileVerified() {
        return this.isMobileVerified.equalsIgnoreCase(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public String getUtmFullString() {
        return this.utmfullstring;
    }

    public void setUtmFullString(String str) {
        this.utmfullstring = str;
    }
}
