package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* loaded from: classes4.dex */
final class s extends ba {
    private final String addtlConsent;
    private final String gdprApplies;
    private final String tcString;
    private final String uspString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(String str, String str2, String str3, String str4) {
        Objects.requireNonNull(str, "Null gdprApplies");
        this.gdprApplies = str;
        Objects.requireNonNull(str2, "Null tcString");
        this.tcString = str2;
        Objects.requireNonNull(str3, "Null addtlConsent");
        this.addtlConsent = str3;
        Objects.requireNonNull(str4, "Null uspString");
        this.uspString = str4;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ba
    public String addtlConsent() {
        return this.addtlConsent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ba) {
            ba baVar = (ba) obj;
            return this.gdprApplies.equals(baVar.gdprApplies()) && this.tcString.equals(baVar.tcString()) && this.addtlConsent.equals(baVar.addtlConsent()) && this.uspString.equals(baVar.uspString());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ba
    public String gdprApplies() {
        return this.gdprApplies;
    }

    public int hashCode() {
        int hashCode = this.gdprApplies.hashCode();
        int hashCode2 = this.tcString.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.addtlConsent.hashCode()) * 1000003) ^ this.uspString.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ba
    public String tcString() {
        return this.tcString;
    }

    public String toString() {
        String str = this.gdprApplies;
        String str2 = this.tcString;
        String str3 = this.addtlConsent;
        String str4 = this.uspString;
        return "ConsentSettings{gdprApplies=" + str + ", tcString=" + str2 + ", addtlConsent=" + str3 + ", uspString=" + str4 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ba
    public String uspString() {
        return this.uspString;
    }
}
