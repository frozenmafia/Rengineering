package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* loaded from: classes7.dex */
final class r extends CompanionData {
    private final String clickThroughUrl;
    private final String size;
    private final String src;
    private final az type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(String str, String str2, String str3, az azVar) {
        Objects.requireNonNull(str, "Null size");
        this.size = str;
        Objects.requireNonNull(str2, "Null src");
        this.src = str2;
        Objects.requireNonNull(str3, "Null clickThroughUrl");
        this.clickThroughUrl = str3;
        Objects.requireNonNull(azVar, "Null type");
        this.type = azVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionData) {
            CompanionData companionData = (CompanionData) obj;
            return this.size.equals(companionData.size()) && this.src.equals(companionData.src()) && this.clickThroughUrl.equals(companionData.clickThroughUrl()) && this.type.equals(companionData.type());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.size.hashCode();
        int hashCode2 = this.src.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String size() {
        return this.size;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String src() {
        return this.src;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public az type() {
        return this.type;
    }
}
