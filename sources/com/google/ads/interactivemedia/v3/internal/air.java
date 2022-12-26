package com.google.ads.interactivemedia.v3.internal;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class air extends aii {
    private final int appVersion;
    private final String packageName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public air(int i, String str) {
        this.appVersion = i;
        Objects.requireNonNull(str, "Null packageName");
        this.packageName = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aii) {
            aii aiiVar = (aii) obj;
            return this.appVersion == aiiVar.appVersion() && this.packageName.equals(aiiVar.packageName());
        }
        return false;
    }

    public int hashCode() {
        return ((this.appVersion ^ 1000003) * 1000003) ^ this.packageName.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        int i = this.appVersion;
        String str = this.packageName;
        return "MarketAppInfo{appVersion=" + i + ", packageName=" + str + "}";
    }
}
