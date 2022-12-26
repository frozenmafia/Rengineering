package com.app.dream11.model;
/* loaded from: classes3.dex */
public class RecentTransaction {
    private String ActionDesc;
    private String ActionTransType;
    private String ActionType;
    private double Amount;
    private String ChannelSource;
    private String CreatedAt;
    private String Currency;
    private String ExpDate;
    private String InvoiceNo;
    private int IsInvoice;
    private String LeagueId;
    private String RoundStartTime;
    private String TourShortName;
    private String TransactionId;
    private String TxnTime;
    private String UserId;
    private String WithdrawStatus;
    private String id;

    public String getRoundStartTime() {
        return this.RoundStartTime;
    }

    public String getId() {
        return this.id;
    }

    public String getInvoiceNo() {
        return this.InvoiceNo;
    }

    public String getTourShortName() {
        return this.TourShortName;
    }

    public String getCurrency() {
        return this.Currency;
    }

    public String getCreatedAt() {
        return this.CreatedAt;
    }

    public double getAmount() {
        return this.Amount;
    }

    public String getUserId() {
        return this.UserId;
    }

    public String getTransactionId() {
        return this.TransactionId;
    }

    public String getActionType() {
        return this.ActionType;
    }

    public String getTxnTime() {
        return this.TxnTime;
    }

    public String getActionDesc() {
        return this.ActionDesc;
    }

    public String getChannelSource() {
        return this.ChannelSource;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInvoiceNo(String str) {
        this.InvoiceNo = str;
    }

    public void setTourShortName(String str) {
        this.TourShortName = str;
    }

    public void setCurrency(String str) {
        this.Currency = str;
    }

    public void setCreatedAt(String str) {
        this.CreatedAt = str;
    }

    public void setAmount(double d) {
        this.Amount = d;
    }

    public void setUserId(String str) {
        this.UserId = str;
    }

    public void setTransactionId(String str) {
        this.TransactionId = str;
    }

    public void setRoundStartTime(String str) {
        this.RoundStartTime = str;
    }

    public void setActionType(String str) {
        this.ActionType = str;
    }

    public void setTxnTime(String str) {
        this.TxnTime = str;
    }

    public void setActionDesc(String str) {
        this.ActionDesc = str;
    }

    public void setChannelSource(String str) {
        this.ChannelSource = str;
    }

    public int getIsInvoice() {
        return this.IsInvoice;
    }

    public void setIsInvoice(int i) {
        this.IsInvoice = i;
    }

    public String getActionTransType() {
        return this.ActionTransType;
    }

    public void setActionTransType(String str) {
        this.ActionTransType = str;
    }

    public String getWithdrawStatus() {
        return this.WithdrawStatus;
    }

    public void setWithdrawStatus(String str) {
        this.WithdrawStatus = str;
    }

    public String getLeagueId() {
        return this.LeagueId;
    }

    public void setLeagueId(String str) {
        this.LeagueId = str;
    }

    public String getExpDate() {
        return this.ExpDate;
    }

    public void setExpDate(String str) {
        this.ExpDate = str;
    }
}
