package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.AccountQuery;
import com.app.dream11.core.service.graphql.api.type.VerificationStatus;
import java.util.Iterator;
import java.util.List;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class FeatureAccountBalanceModel {
    private final double blockedCashBonus;
    private final double blockedWinnings;
    private final Boolean canWithdrawInstantly;
    private final String cardPaymentMode;
    private final double cashBonus;
    private final Double cashbackPercent;
    private final double depositedBalance;
    private final double totalBalance;
    private final double userCBNotify;
    private final double userDepNotify;
    private final AccountVerificationStatus verifiedStatus;
    private final double winningBalance;
    private final int withdrawalInProcessCount;

    /* loaded from: classes3.dex */
    public enum AccountVerificationStatus {
        VERIFIED,
        IN_PROGRESS,
        NOT_VERIFIED
    }

    public /* synthetic */ FeatureAccountBalanceModel(double d, double d2, double d3, double d4, double d5, double d6, AccountVerificationStatus accountVerificationStatus, Double d7, String str, double d8, double d9, int i, Boolean bool, getTargetTypes gettargettypes) {
        this(d, d2, d3, d4, d5, d6, accountVerificationStatus, d7, str, d8, d9, i, bool);
    }

    public final double component1() {
        return this.totalBalance;
    }

    public final double component10() {
        return this.userCBNotify;
    }

    public final double component11() {
        return this.userDepNotify;
    }

    public final int component12() {
        return this.withdrawalInProcessCount;
    }

    public final Boolean component13() {
        return this.canWithdrawInstantly;
    }

    public final double component2() {
        return this.depositedBalance;
    }

    public final double component3() {
        return this.winningBalance;
    }

    public final double component4() {
        return this.cashBonus;
    }

    public final double component5() {
        return this.blockedCashBonus;
    }

    public final double component6() {
        return this.blockedWinnings;
    }

    public final AccountVerificationStatus component7() {
        return this.verifiedStatus;
    }

    public final Double component8() {
        return this.cashbackPercent;
    }

    public final String component9() {
        return this.cardPaymentMode;
    }

    public final FeatureAccountBalanceModel copy(double d, double d2, double d3, double d4, double d5, double d6, AccountVerificationStatus accountVerificationStatus, Double d7, String str, double d8, double d9, int i, Boolean bool) {
        runAnimators.ag$a(str, "cardPaymentMode");
        return new FeatureAccountBalanceModel(d, d2, d3, d4, d5, d6, accountVerificationStatus, d7, str, d8, d9, i, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeatureAccountBalanceModel) {
            FeatureAccountBalanceModel featureAccountBalanceModel = (FeatureAccountBalanceModel) obj;
            return runAnimators.values(Double.valueOf(this.totalBalance), Double.valueOf(featureAccountBalanceModel.totalBalance)) && runAnimators.values(Double.valueOf(this.depositedBalance), Double.valueOf(featureAccountBalanceModel.depositedBalance)) && runAnimators.values(Double.valueOf(this.winningBalance), Double.valueOf(featureAccountBalanceModel.winningBalance)) && runAnimators.values(Double.valueOf(this.cashBonus), Double.valueOf(featureAccountBalanceModel.cashBonus)) && runAnimators.values(Double.valueOf(this.blockedCashBonus), Double.valueOf(featureAccountBalanceModel.blockedCashBonus)) && runAnimators.values(Double.valueOf(this.blockedWinnings), Double.valueOf(featureAccountBalanceModel.blockedWinnings)) && this.verifiedStatus == featureAccountBalanceModel.verifiedStatus && runAnimators.values(this.cashbackPercent, featureAccountBalanceModel.cashbackPercent) && runAnimators.values((Object) this.cardPaymentMode, (Object) featureAccountBalanceModel.cardPaymentMode) && runAnimators.values(Double.valueOf(this.userCBNotify), Double.valueOf(featureAccountBalanceModel.userCBNotify)) && runAnimators.values(Double.valueOf(this.userDepNotify), Double.valueOf(featureAccountBalanceModel.userDepNotify)) && this.withdrawalInProcessCount == featureAccountBalanceModel.withdrawalInProcessCount && runAnimators.values(this.canWithdrawInstantly, featureAccountBalanceModel.canWithdrawInstantly);
        }
        return false;
    }

    public int hashCode() {
        int doubleToLongBits = Double.doubleToLongBits(this.totalBalance);
        int doubleToLongBits2 = Double.doubleToLongBits(this.depositedBalance);
        int doubleToLongBits3 = Double.doubleToLongBits(this.winningBalance);
        int doubleToLongBits4 = Double.doubleToLongBits(this.cashBonus);
        int doubleToLongBits5 = Double.doubleToLongBits(this.blockedCashBonus);
        int doubleToLongBits6 = Double.doubleToLongBits(this.blockedWinnings);
        AccountVerificationStatus accountVerificationStatus = this.verifiedStatus;
        int hashCode = accountVerificationStatus == null ? 0 : accountVerificationStatus.hashCode();
        Double d = this.cashbackPercent;
        int hashCode2 = d == null ? 0 : d.hashCode();
        int hashCode3 = this.cardPaymentMode.hashCode();
        int doubleToLongBits7 = Double.doubleToLongBits(this.userCBNotify);
        int doubleToLongBits8 = Double.doubleToLongBits(this.userDepNotify);
        int i = this.withdrawalInProcessCount;
        Boolean bool = this.canWithdrawInstantly;
        return (((((((((((((((((((((((doubleToLongBits * 31) + doubleToLongBits2) * 31) + doubleToLongBits3) * 31) + doubleToLongBits4) * 31) + doubleToLongBits5) * 31) + doubleToLongBits6) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + doubleToLongBits7) * 31) + doubleToLongBits8) * 31) + i) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        double d = this.totalBalance;
        double d2 = this.depositedBalance;
        double d3 = this.winningBalance;
        double d4 = this.cashBonus;
        double d5 = this.blockedCashBonus;
        double d6 = this.blockedWinnings;
        AccountVerificationStatus accountVerificationStatus = this.verifiedStatus;
        Double d7 = this.cashbackPercent;
        String str = this.cardPaymentMode;
        double d8 = this.userCBNotify;
        double d9 = this.userDepNotify;
        int i = this.withdrawalInProcessCount;
        Boolean bool = this.canWithdrawInstantly;
        return "FeatureAccountBalanceModel(totalBalance=" + d + ", depositedBalance=" + d2 + ", winningBalance=" + d3 + ", cashBonus=" + d4 + ", blockedCashBonus=" + d5 + ", blockedWinnings=" + d6 + ", verifiedStatus=" + accountVerificationStatus + ", cashbackPercent=" + d7 + ", cardPaymentMode=" + str + ", userCBNotify=" + d8 + ", userDepNotify=" + d9 + ", withdrawalInProcessCount=" + i + ", canWithdrawInstantly=" + bool + ")";
    }

    private FeatureAccountBalanceModel(double d, double d2, double d3, double d4, double d5, double d6, AccountVerificationStatus accountVerificationStatus, Double d7, String str, double d8, double d9, int i, Boolean bool) {
        this.totalBalance = d;
        this.depositedBalance = d2;
        this.winningBalance = d3;
        this.cashBonus = d4;
        this.blockedCashBonus = d5;
        this.blockedWinnings = d6;
        this.verifiedStatus = accountVerificationStatus;
        this.cashbackPercent = d7;
        this.cardPaymentMode = str;
        this.userCBNotify = d8;
        this.userDepNotify = d9;
        this.withdrawalInProcessCount = i;
        this.canWithdrawInstantly = bool;
    }

    public final double getTotalBalance() {
        return this.totalBalance;
    }

    public final double getDepositedBalance() {
        return this.depositedBalance;
    }

    public final double getWinningBalance() {
        return this.winningBalance;
    }

    public final double getCashBonus() {
        return this.cashBonus;
    }

    public final double getBlockedCashBonus() {
        return this.blockedCashBonus;
    }

    public final double getBlockedWinnings() {
        return this.blockedWinnings;
    }

    public final AccountVerificationStatus getVerifiedStatus() {
        return this.verifiedStatus;
    }

    public final Double getCashbackPercent() {
        return this.cashbackPercent;
    }

    public final String getCardPaymentMode() {
        return this.cardPaymentMode;
    }

    public final double getUserCBNotify() {
        return this.userCBNotify;
    }

    public final double getUserDepNotify() {
        return this.userDepNotify;
    }

    public final int getWithdrawalInProcessCount() {
        return this.withdrawalInProcessCount;
    }

    /* loaded from: classes6.dex */
    public static final class Balance {
        private final Double amount;
        private final String symbol;

        public Balance(Double d, String str) {
            this.amount = d;
            this.symbol = str;
        }

        public final Double getAmount() {
            return this.amount;
        }

        public final String getSymbol() {
            return this.symbol;
        }
    }

    public final Boolean getCanWithdrawInstantly() {
        return this.canWithdrawInstantly;
    }

    public final boolean isVerified() {
        return this.verifiedStatus == AccountVerificationStatus.VERIFIED;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        private double blockedCashBonus;
        private double blockedWinnings;
        private double cashBackPercent;
        private double cashBonus;
        private double cashBonusExpiration;
        private double depositExpiration;
        private double depositedBalance;
        private double winningBalance;
        private int withdrawalInProcessCount;
        private double totalBalance = -1.0d;
        private AccountVerificationStatus verifiedStatus = AccountVerificationStatus.NOT_VERIFIED;
        private String cardPaymentMode = "";
        private Boolean canWithdrawInstantly = false;

        /* loaded from: classes3.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VerificationStatus.values().length];
                iArr[VerificationStatus.VERIFIED.ordinal()] = 1;
                iArr[VerificationStatus.IN_PROGRESS.ordinal()] = 2;
                iArr[VerificationStatus.NOT_VERIFIED.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Builder withAccount(AccountQuery.Me me2) {
            runAnimators.ag$a(me2, "me");
            this.totalBalance = this.totalBalance;
            AccountQuery.Account account = me2.getAccount();
            Builder withCashBackPercent = withBlockedCashBonus(account.getBlockedCashBonus().getAmount()).withTotalBalance(account.getTotalBalance().getAmount()).withDepositBalance(account.getDepositedBalance().getAmount()).withCashBonus(account.getCashBonus().getAmount()).withBlockedWinnings(account.getBlockedWinnings().getAmount()).withWinningBalance(account.getWinningBalance().getAmount()).withVerifiedStatus(getVerificationStatus(me2.getVerified())).withCashBonusExpiration(getTotalCashBonusExpiration(me2.getAccount().getCashBonusExpiration())).withDepositExpiration(getTotalDepositExpiration(me2.getAccount().getDepositExpirations())).withCashBackPercent(me2.getBonus().getMaxBonusPercentage());
            Boolean canWithdrawInstantly = me2.getCanWithdrawInstantly();
            withCashBackPercent.withCanWithdrawInstantly(canWithdrawInstantly == null ? false : canWithdrawInstantly.booleanValue());
            return this;
        }

        public final Builder withTotalBalance(double d) {
            this.totalBalance = d;
            return this;
        }

        public final Builder withDepositBalance(double d) {
            this.depositedBalance = d;
            return this;
        }

        public final Builder withWinningBalance(double d) {
            this.winningBalance = d;
            return this;
        }

        public final Builder withCashBonus(double d) {
            this.cashBonus = d;
            return this;
        }

        public final Builder withBlockedCashBonus(double d) {
            this.blockedCashBonus = d;
            return this;
        }

        public final Builder withBlockedWinnings(double d) {
            this.blockedWinnings = d;
            return this;
        }

        public final Builder withVerifiedStatus(AccountVerificationStatus accountVerificationStatus) {
            runAnimators.ag$a(accountVerificationStatus, "verifiedStatus");
            this.verifiedStatus = accountVerificationStatus;
            return this;
        }

        public final Builder withCashBackPercent(double d) {
            this.cashBackPercent = d;
            return this;
        }

        public final Builder withCanWithdrawInstantly(boolean z) {
            this.canWithdrawInstantly = Boolean.valueOf(z);
            return this;
        }

        public final Builder withCardPaymentMode(String str) {
            runAnimators.ag$a(str, "cardPaymentMode");
            this.cardPaymentMode = str;
            return this;
        }

        public final Builder withCashBonusExpiration(double d) {
            this.cashBonusExpiration = d;
            return this;
        }

        public final Builder withDepositExpiration(double d) {
            this.depositExpiration = d;
            return this;
        }

        public final Builder withdrawalInProcessCount(int i) {
            this.withdrawalInProcessCount = i;
            return this;
        }

        public final FeatureAccountBalanceModel build() {
            return new FeatureAccountBalanceModel(this.totalBalance, this.depositedBalance, this.winningBalance, this.cashBonus, this.blockedCashBonus, this.blockedWinnings, this.verifiedStatus, Double.valueOf(this.cashBackPercent), this.cardPaymentMode, this.cashBonusExpiration, this.depositExpiration, this.withdrawalInProcessCount, this.canWithdrawInstantly, null);
        }

        private final AccountVerificationStatus getVerificationStatus(VerificationStatus verificationStatus) {
            int i = verificationStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[verificationStatus.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return AccountVerificationStatus.NOT_VERIFIED;
                    }
                    return AccountVerificationStatus.NOT_VERIFIED;
                }
                return AccountVerificationStatus.IN_PROGRESS;
            }
            return AccountVerificationStatus.VERIFIED;
        }

        private final double getTotalCashBonusExpiration(List<AccountQuery.CashBonusExpiration> list) {
            AccountQuery.Amount amount;
            Iterator<AccountQuery.CashBonusExpiration> it = list.iterator();
            double d = 0.0d;
            while (it.hasNext()) {
                AccountQuery.CashBonusExpiration next = it.next();
                d += (next == null || (amount = next.getAmount()) == null) ? 0.0d : amount.getAmount();
            }
            return d;
        }

        private final double getTotalDepositExpiration(List<AccountQuery.DepositExpiration> list) {
            AccountQuery.Amount1 amount;
            Iterator<AccountQuery.DepositExpiration> it = list.iterator();
            double d = 0.0d;
            while (it.hasNext()) {
                AccountQuery.DepositExpiration next = it.next();
                d += (next == null || (amount = next.getAmount()) == null) ? 0.0d : amount.getAmount();
            }
            return d;
        }
    }
}
