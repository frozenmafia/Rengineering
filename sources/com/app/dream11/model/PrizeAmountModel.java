package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes3.dex */
public final class PrizeAmountModel {
    private final double amount;

    public static /* synthetic */ PrizeAmountModel copy$default(PrizeAmountModel prizeAmountModel, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = prizeAmountModel.amount;
        }
        return prizeAmountModel.copy(d);
    }

    public final double component1() {
        return this.amount;
    }

    public final PrizeAmountModel copy(double d) {
        return new PrizeAmountModel(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrizeAmountModel) && runAnimators.values(Double.valueOf(this.amount), Double.valueOf(((PrizeAmountModel) obj).amount));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.amount);
    }

    public String toString() {
        double d = this.amount;
        return "PrizeAmountModel(amount=" + d + ")";
    }

    public PrizeAmountModel(double d) {
        this.amount = d;
    }

    public final double getAmount() {
        return this.amount;
    }
}
