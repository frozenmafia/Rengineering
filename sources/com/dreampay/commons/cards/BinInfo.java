package com.dreampay.commons.cards;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class BinInfo {
    private final String bin;
    private final BinMetaData binMetaData;
    private final ConsentData consentData;
    private final InstrumentHealth health;
    private final String issuer;
    private final Double maxSfaEligibleAmount;
    private final boolean sfaEligible;
    private final boolean shouldBlockOnDownHealth;
    private final Boolean supportsSubscription;

    public final String component1() {
        return this.bin;
    }

    public final BinMetaData component2() {
        return this.binMetaData;
    }

    public final String component3() {
        return this.issuer;
    }

    public final boolean component4() {
        return this.sfaEligible;
    }

    public final Double component5() {
        return this.maxSfaEligibleAmount;
    }

    public final InstrumentHealth component6() {
        return this.health;
    }

    public final Boolean component7() {
        return this.supportsSubscription;
    }

    public final boolean component8() {
        return this.shouldBlockOnDownHealth;
    }

    public final ConsentData component9() {
        return this.consentData;
    }

    public final BinInfo copy(String str, BinMetaData binMetaData, String str2, boolean z, Double d, InstrumentHealth instrumentHealth, Boolean bool, boolean z2, ConsentData consentData) {
        runAnimators.ag$a(str, "bin");
        runAnimators.ag$a(binMetaData, "binMetaData");
        runAnimators.ag$a(str2, "issuer");
        runAnimators.ag$a(consentData, "consentData");
        return new BinInfo(str, binMetaData, str2, z, d, instrumentHealth, bool, z2, consentData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinInfo) {
            BinInfo binInfo = (BinInfo) obj;
            return runAnimators.values((Object) this.bin, (Object) binInfo.bin) && runAnimators.values(this.binMetaData, binInfo.binMetaData) && runAnimators.values((Object) this.issuer, (Object) binInfo.issuer) && this.sfaEligible == binInfo.sfaEligible && runAnimators.values(this.maxSfaEligibleAmount, binInfo.maxSfaEligibleAmount) && runAnimators.values(this.health, binInfo.health) && runAnimators.values(this.supportsSubscription, binInfo.supportsSubscription) && this.shouldBlockOnDownHealth == binInfo.shouldBlockOnDownHealth && runAnimators.values(this.consentData, binInfo.consentData);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.bin.hashCode();
        int hashCode2 = this.binMetaData.hashCode();
        int hashCode3 = this.issuer.hashCode();
        boolean z = this.sfaEligible;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        Double d = this.maxSfaEligibleAmount;
        int hashCode4 = d == null ? 0 : d.hashCode();
        InstrumentHealth instrumentHealth = this.health;
        int hashCode5 = instrumentHealth == null ? 0 : instrumentHealth.hashCode();
        Boolean bool = this.supportsSubscription;
        int hashCode6 = bool != null ? bool.hashCode() : 0;
        boolean z2 = this.shouldBlockOnDownHealth;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.consentData.hashCode();
    }

    public String toString() {
        return "BinInfo(bin=" + this.bin + ", binMetaData=" + this.binMetaData + ", issuer=" + this.issuer + ", sfaEligible=" + this.sfaEligible + ", maxSfaEligibleAmount=" + this.maxSfaEligibleAmount + ", health=" + this.health + ", supportsSubscription=" + this.supportsSubscription + ", shouldBlockOnDownHealth=" + this.shouldBlockOnDownHealth + ", consentData=" + this.consentData + ')';
    }

    public BinInfo(String str, BinMetaData binMetaData, String str2, boolean z, Double d, InstrumentHealth instrumentHealth, Boolean bool, boolean z2, ConsentData consentData) {
        runAnimators.ag$a(str, "bin");
        runAnimators.ag$a(binMetaData, "binMetaData");
        runAnimators.ag$a(str2, "issuer");
        runAnimators.ag$a(consentData, "consentData");
        this.bin = str;
        this.binMetaData = binMetaData;
        this.issuer = str2;
        this.sfaEligible = z;
        this.maxSfaEligibleAmount = d;
        this.health = instrumentHealth;
        this.supportsSubscription = bool;
        this.shouldBlockOnDownHealth = z2;
        this.consentData = consentData;
    }

    public /* synthetic */ BinInfo(String str, BinMetaData binMetaData, String str2, boolean z, Double d, InstrumentHealth instrumentHealth, Boolean bool, boolean z2, ConsentData consentData, int i, getTargetTypes gettargettypes) {
        this(str, binMetaData, str2, z, d, instrumentHealth, bool, (i & 128) != 0 ? false : z2, consentData);
    }

    public final String getBin() {
        return this.bin;
    }

    public final BinMetaData getBinMetaData() {
        return this.binMetaData;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final boolean getSfaEligible() {
        return this.sfaEligible;
    }

    public final InstrumentHealth getHealth() {
        return this.health;
    }

    public final Double getMaxSfaEligibleAmount() {
        return this.maxSfaEligibleAmount;
    }

    public final Boolean getSupportsSubscription() {
        return this.supportsSubscription;
    }

    public final ConsentData getConsentData() {
        return this.consentData;
    }

    public final boolean getShouldBlockOnDownHealth() {
        return this.shouldBlockOnDownHealth;
    }
}
