package com.app.dream11.withdraw;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class WithdrawVM implements Serializable {
    private int amtLimit;
    ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private String globalErrorMsg;
    private String hint;
    private double maxWithdrawableLimit;
    private double minWithdrawableLimit;
    double winningBalance;

    public double getWinningBalance() {
        return this.winningBalance;
    }

    public void setWinningBalance(double d) {
        this.winningBalance = d;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return this.bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> arrayList) {
        this.bankAccounts = arrayList;
    }

    public void setMaxWithdrawableLimit(double d) {
        this.maxWithdrawableLimit = d;
    }

    public void setMinWithdrawableLimit(double d) {
        this.minWithdrawableLimit = d;
    }

    public double getMaxWithdrawableLimit() {
        return this.maxWithdrawableLimit;
    }

    public double getMinWithdrawableLimit() {
        return this.minWithdrawableLimit;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public String getHint() {
        return this.hint;
    }

    public int getAmtLimit() {
        return this.amtLimit;
    }

    public void setAmtLimit(int i) {
        this.amtLimit = i;
    }

    public String getGlobalErrorMsg() {
        return this.globalErrorMsg;
    }

    public void setGlobalErrorMsg(String str) {
        this.globalErrorMsg = str;
    }
}
