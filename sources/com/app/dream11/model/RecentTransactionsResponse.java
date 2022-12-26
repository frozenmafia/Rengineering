package com.app.dream11.model;

import java.util.List;
/* loaded from: classes3.dex */
public class RecentTransactionsResponse {
    private List<RecentTransaction> recentTransactions;
    private TotalStats totalStats;

    public TotalStats getTotalStats() {
        return this.totalStats;
    }

    public void setTotalStats(TotalStats totalStats) {
        this.totalStats = totalStats;
    }

    public List<RecentTransaction> getRecentTransactions() {
        return this.recentTransactions;
    }

    public void setRecentTransactions(List<RecentTransaction> list) {
        this.recentTransactions = list;
    }
}
