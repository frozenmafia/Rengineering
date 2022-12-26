package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class FetchVerificationResponse implements Serializable {
    private static final long serialVersionUID = 121;
    private String AccountNum;
    private String BUnVerReason;
    private String BankBranch;
    private String BankFilePath;
    private String BankName;
    private String CommEmailId;
    private String CommMobNum;
    private String DateOfBirth;
    private String IFSCCode;
    private String IsBankIssue;
    private String IsCommEmailVerified;
    private String IsMobileVerified;
    private String IsPanIssue;
    private String IsRejected;
    private String MaskedAccountNum;
    private String MaskedPan;
    private String PUnVerReason;
    private String PanFilePath;
    private String PanNumber;
    private String StateId;
    private String UserFullName;
    private String VerifiedStatus;
    private String VerifiedStatusText;
    private PanStatus panVerificationInfo;
    private String revertTimeMessage;

    public String getVerifiedStatusText() {
        return this.VerifiedStatusText;
    }

    public PanStatus getPanVerificationInfo() {
        return this.panVerificationInfo;
    }

    public String getVerifiedStatus() {
        return this.VerifiedStatus;
    }

    public void setVerifiedStatus(String str) {
        this.VerifiedStatus = str;
    }

    public String getAccountNum() {
        return this.AccountNum;
    }

    public void setAccountNum(String str) {
        this.AccountNum = str;
    }

    public String getBUnVerReason() {
        return this.BUnVerReason;
    }

    public void setBUnVerReason(String str) {
        this.BUnVerReason = str;
    }

    public String getIFSCCode() {
        return this.IFSCCode;
    }

    public void setIFSCCode(String str) {
        this.IFSCCode = str;
    }

    public String getPanFilePath() {
        return this.PanFilePath;
    }

    public void setPanFilePath(String str) {
        this.PanFilePath = str;
    }

    public String getBankName() {
        return this.BankName;
    }

    public void setBankName(String str) {
        this.BankName = str;
    }

    public String getIsMobileVerified() {
        return this.IsMobileVerified;
    }

    public void setIsMobileVerified(String str) {
        this.IsMobileVerified = str;
    }

    public String getCommMobNum() {
        return this.CommMobNum;
    }

    public void setCommMobNum(String str) {
        this.CommMobNum = str;
    }

    public String getIsRejected() {
        return this.IsRejected;
    }

    public void setIsRejected(String str) {
        this.IsRejected = str;
    }

    public String getPanNumber() {
        return this.PanNumber;
    }

    public void setPanNumber(String str) {
        this.PanNumber = str;
    }

    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    public void setDateOfBirth(String str) {
        this.DateOfBirth = str;
    }

    public String getBankFilePath() {
        return this.BankFilePath;
    }

    public void setBankFilePath(String str) {
        this.BankFilePath = str;
    }

    public String getPUnVerReason() {
        return this.PUnVerReason;
    }

    public void setPUnVerReason(String str) {
        this.PUnVerReason = str;
    }

    public String getStateId() {
        return this.StateId;
    }

    public void setStateId(String str) {
        this.StateId = str;
    }

    public String getIsCommEmailVerified() {
        return this.IsCommEmailVerified;
    }

    public void setIsCommEmailVerified(String str) {
        this.IsCommEmailVerified = str;
    }

    public String getIsPanIssue() {
        return this.IsPanIssue;
    }

    public void setIsPanIssue(String str) {
        this.IsPanIssue = str;
    }

    public String getUserFullName() {
        return this.UserFullName;
    }

    public void setUserFullName(String str) {
        this.UserFullName = str;
    }

    public String getCommEmailId() {
        return this.CommEmailId;
    }

    public void setCommEmailId(String str) {
        this.CommEmailId = str;
    }

    public String getIsBankIssue() {
        return this.IsBankIssue;
    }

    public void setIsBankIssue(String str) {
        this.IsBankIssue = str;
    }

    public String getBankBranch() {
        return this.BankBranch;
    }

    public void setBankBranch(String str) {
        this.BankBranch = str;
    }

    public String getRevertTimeMessage() {
        return this.revertTimeMessage;
    }

    public void setRevertTimeMessage(String str) {
        this.revertTimeMessage = str;
    }

    public String getMaskedPanNumber() {
        return this.MaskedPan;
    }

    public void setMaskedPanNumber(String str) {
        this.MaskedPan = str;
    }

    public String getMaskedAccountNum() {
        return this.MaskedAccountNum;
    }

    public void setMaskedAccountNum(String str) {
        this.MaskedAccountNum = str;
    }
}
