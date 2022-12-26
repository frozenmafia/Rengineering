package com.app.dream11.model;
/* loaded from: classes3.dex */
public class UserInfo {
    private String Address;
    private String City;
    private String CommMobNum;
    private String CountryId;
    private String DateOfBirth;
    private String EmailId;
    private String Gender;
    private String MobileNum;
    private String StateId;
    private String TeamName;
    private String UserFullName;
    public int UserId;
    private String UtmRef;
    private String UtmSource;
    private String VerifiedStatus;
    private String Zipcode;
    private String country;
    private String countryCode;
    private boolean isOldReferralUser;
    private String shortRefCode;
    private String state;

    public String getMobileNum() {
        return this.MobileNum;
    }

    public void setMobileNum(String str) {
        this.MobileNum = str;
    }

    public String getState() {
        if (this.state == null) {
            this.state = "";
        }
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public String getZipcode() {
        return this.Zipcode;
    }

    public void setZipcode(String str) {
        this.Zipcode = str;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String str) {
        this.City = str;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    public void setDateOfBirth(String str) {
        this.DateOfBirth = str;
    }

    public String getTeamName() {
        return this.TeamName;
    }

    public void setTeamName(String str) {
        this.TeamName = str;
    }

    public String getStateId() {
        return this.StateId;
    }

    public void setStateId(String str) {
        this.StateId = str;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String str) {
        this.Gender = str;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String str) {
        this.Address = str;
    }

    public String getCountryId() {
        return this.CountryId;
    }

    public void setCountryId(String str) {
        this.CountryId = str;
    }

    public String getUserFullName() {
        return this.UserFullName;
    }

    public void setUserFullName(String str) {
        this.UserFullName = str;
    }

    public String getEmailId() {
        return this.EmailId;
    }

    public void setEmailId(String str) {
        this.EmailId = str;
    }

    public int getUserId() {
        return this.UserId;
    }

    public void setUserId(int i) {
        this.UserId = i;
    }

    public String getUtmRef() {
        return this.UtmRef;
    }

    public String getShortRefCode() {
        return this.shortRefCode;
    }

    public String getUtmSource() {
        return this.UtmSource;
    }

    public boolean isOldReferralUser() {
        return this.isOldReferralUser;
    }

    public String getVerifiedStatus() {
        return this.VerifiedStatus;
    }

    public String getCommMobNum() {
        return this.CommMobNum;
    }
}
