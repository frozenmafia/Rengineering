package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes3.dex */
public final class EntryFeeModel {
    private final double amount;

    public static /* synthetic */ EntryFeeModel copy$default(EntryFeeModel entryFeeModel, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = entryFeeModel.amount;
        }
        return entryFeeModel.copy(d);
    }

    public final double component1() {
        return this.amount;
    }

    public final EntryFeeModel copy(double d) {
        return new EntryFeeModel(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EntryFeeModel) && runAnimators.values(Double.valueOf(this.amount), Double.valueOf(((EntryFeeModel) obj).amount));
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.amount);
    }

    public String toString() {
        double d = this.amount;
        return "EntryFeeModel(amount=" + d + ")";
    }

    public EntryFeeModel(double d) {
        this.amount = d;
    }

    public final double getAmount() {
        return this.amount;
    }
}
