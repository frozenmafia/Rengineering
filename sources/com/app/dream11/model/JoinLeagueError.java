package com.app.dream11.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import o.isFullSpan;
/* loaded from: classes3.dex */
public class JoinLeagueError implements Serializable {
    private static final long serialVersionUID = 1;
    private double Balance;
    private int CashBonusReject;
    private String JoinedTeamIds;
    private int MaxCountVar;
    private double RemainingAmt;
    private String cashbonusText;
    private double cbDed;
    private double depDed;
    private boolean isvalidBalancePresnet;
    @Deprecated
    int joined;
    @Deprecated
    private boolean key;
    private String leagueConfirmMsg;
    @isFullSpan(valueOf = "leagueId", values = {"id", "LeagueId"})
    private String leagueId;
    private LeagueJoinError msg;
    private int pIsFamilyIssue;
    @Deprecated
    private String popup;
    private String transactionId;
    private double winDed;
    private double validBalance = -1.0d;
    private double uwBalance = -1.0d;
    private double blockedCashBonusBalance = 0.0d;
    private List<Integer> teamIds = Collections.emptyList();

    public double getRemainingAmt() {
        return this.RemainingAmt;
    }

    public void setRemainingAmt(double d) {
        this.RemainingAmt = d;
    }

    public int getMaxCountVar() {
        return this.MaxCountVar;
    }

    public void setMaxCountVar(int i) {
        this.MaxCountVar = i;
    }

    public List<Integer> getSelectedTeamIds() {
        return this.teamIds;
    }

    public void setSelectedTeamIds(List<Integer> list) {
        this.teamIds = list;
    }

    public String getJoinedTeamIds() {
        return this.JoinedTeamIds;
    }

    public void setJoinedTeamIds(String str) {
        this.JoinedTeamIds = str;
    }

    public LeagueJoinError getMsg() {
        return this.msg;
    }

    public void setMsg(LeagueJoinError leagueJoinError) {
        this.msg = leagueJoinError;
    }

    public int getpIsFamilyIssue() {
        return this.pIsFamilyIssue;
    }

    public void setpIsFamilyIssue(int i) {
        this.pIsFamilyIssue = i;
    }

    public boolean isvalidBalancePresnet() {
        return this.isvalidBalancePresnet;
    }

    public void setIsvalidBalancePresnet(boolean z) {
        this.isvalidBalancePresnet = z;
    }

    public double getValidBalance() {
        return this.validBalance;
    }

    public void setUwBalance(double d) {
        this.uwBalance = d;
    }

    public double getUwBalance() {
        return this.uwBalance;
    }

    public void setValidBalance(double d) {
        this.validBalance = d;
    }

    public double getUserBalance() {
        return this.Balance;
    }

    public void setUserBalance(double d) {
        this.Balance = d;
    }

    public double getBalance() {
        return this.Balance;
    }

    public void setBalance(double d) {
        this.Balance = d;
    }

    public int getCashBonusReject() {
        return this.CashBonusReject;
    }

    public void setCashBonusReject(int i) {
        this.CashBonusReject = i;
    }

    public String getLeagueConfirmMsg() {
        return this.leagueConfirmMsg;
    }

    public void setLeagueConfirmMsg(String str) {
        this.leagueConfirmMsg = str;
    }

    public String getLeagueId() {
        return this.leagueId;
    }

    public void setLeagueId(String str) {
        this.leagueId = str;
    }

    public String getLeagueQueueLeagueId() {
        return this.leagueId;
    }

    public Double getDepositDebit() {
        return Double.valueOf(this.depDed);
    }

    public Double getCashbackDebit() {
        return Double.valueOf(this.cbDed);
    }

    public void setCbDed(double d) {
        this.cbDed = d;
    }

    public Double getWiningDebit() {
        return Double.valueOf(this.winDed);
    }

    public String getCashbonusText() {
        return this.cashbonusText;
    }

    public double getBlockedCashbonus() {
        return this.blockedCashBonusBalance;
    }

    public void setBlockedCashBonusBalance(double d) {
        this.blockedCashBonusBalance = d;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setCashbonusText(String str) {
        this.cashbonusText = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public void setDepDed(double d) {
        this.depDed = d;
    }

    public void setWinDed(double d) {
        this.winDed = d;
    }

    public String getPopup() {
        return this.popup;
    }

    public void setPopup(String str) {
        this.popup = str;
    }

    public boolean isKey() {
        return this.key;
    }

    public void setKey(boolean z) {
        this.key = z;
    }

    public int getJoined() {
        return this.joined;
    }
}
