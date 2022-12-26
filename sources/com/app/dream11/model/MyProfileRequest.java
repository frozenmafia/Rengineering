package com.app.dream11.model;

import o.onActionViewExpanded;
/* loaded from: classes6.dex */
public class MyProfileRequest extends CommonRequest {
    private String UserFullName;
    private String allowSmsNotification;
    private String dob;
    private String gender;
    private String name;
    private String profAddress;
    private String profCity;
    private String profPincode;
    private String stateId;
    private String telephoneNum;

    public MyProfileRequest(onActionViewExpanded onactionviewexpanded, IEventDataProvider iEventDataProvider) {
        super(onactionviewexpanded, iEventDataProvider);
    }

    public String getTelephoneNum() {
        return this.telephoneNum;
    }

    public void setTelephoneNum(String str) {
        this.telephoneNum = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUserFullName(String str) {
        this.UserFullName = str;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public String getAddress() {
        return this.profAddress;
    }

    public void setAddress(String str) {
        this.profAddress = str;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String str) {
        this.dob = str;
    }

    public String getStateid() {
        return this.stateId;
    }

    public void setStateid(String str) {
        this.stateId = str;
    }

    public String getCity() {
        return this.profCity;
    }

    public void setCity(String str) {
        this.profCity = str;
    }

    public String getPincode() {
        return this.profPincode;
    }

    public void setPincode(String str) {
        this.profPincode = str;
    }

    public String getProfAddress() {
        return this.profAddress;
    }

    public void setProfAddress(String str) {
        this.profAddress = str;
    }

    public String getStateId() {
        return this.stateId;
    }

    public void setStateId(String str) {
        this.stateId = str;
    }

    public String getProfCity() {
        return this.profCity;
    }

    public void setProfCity(String str) {
        this.profCity = str;
    }

    public String getProfPincode() {
        return this.profPincode;
    }

    public void setProfPincode(String str) {
        this.profPincode = str;
    }

    public String getUserFullName() {
        return this.UserFullName;
    }

    public String getAllowSmsNotification() {
        return this.allowSmsNotification;
    }

    public void setAllowSmsNotification(String str) {
        this.allowSmsNotification = str;
    }
}
