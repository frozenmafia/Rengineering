package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ac extends bi {
    private final String appSetId;
    private final int appSetIdScope;
    private final String deviceId;
    private final String idType;
    private final boolean isLimitedAdTracking;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(String str, String str2, boolean z, String str3, int i) {
        Objects.requireNonNull(str, "Null deviceId");
        this.deviceId = str;
        Objects.requireNonNull(str2, "Null idType");
        this.idType = str2;
        this.isLimitedAdTracking = z;
        Objects.requireNonNull(str3, "Null appSetId");
        this.appSetId = str3;
        this.appSetIdScope = i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bi
    public String appSetId() {
        return this.appSetId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bi
    public int appSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bi
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bi) {
            bi biVar = (bi) obj;
            return this.deviceId.equals(biVar.deviceId()) && this.idType.equals(biVar.idType()) && this.isLimitedAdTracking == biVar.isLimitedAdTracking() && this.appSetId.equals(biVar.appSetId()) && this.appSetIdScope == biVar.appSetIdScope();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.deviceId.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ this.idType.hashCode()) * 1000003) ^ (true != this.isLimitedAdTracking ? 1237 : 1231)) * 1000003) ^ this.appSetId.hashCode()) * 1000003) ^ this.appSetIdScope;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bi
    public String idType() {
        return this.idType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bi
    public boolean isLimitedAdTracking() {
        return this.isLimitedAdTracking;
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.idType;
        boolean z = this.isLimitedAdTracking;
        String str3 = this.appSetId;
        int i = this.appSetIdScope;
        return "IdentifierInfo{deviceId=" + str + ", idType=" + str2 + ", isLimitedAdTracking=" + z + ", appSetId=" + str3 + ", appSetIdScope=" + i + "}";
    }
}
