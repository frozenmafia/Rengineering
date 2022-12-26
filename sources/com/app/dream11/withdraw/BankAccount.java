package com.app.dream11.withdraw;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class BankAccount implements Serializable {
    String accountNumber;
    Bank bankDetails;
    String branch;
    private String errorMsg;
    String ifsc;
    String verificationId;

    public String getVerificationId() {
        return this.verificationId;
    }

    public void setVerificationId(String str) {
        this.verificationId = str;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public String getIfsc() {
        return this.ifsc;
    }

    public void setIfsc(String str) {
        this.ifsc = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public Bank getBankDetails() {
        return this.bankDetails;
    }

    public void setBankDetails(Bank bank) {
        this.bankDetails = bank;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }
}
