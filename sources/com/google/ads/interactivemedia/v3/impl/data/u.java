package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class u extends bc {
    private final bd adapterVersion;
    private final String name;
    private final bd sdkVersion;
    private final String signals;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(bd bdVar, bd bdVar2, String str, String str2) {
        Objects.requireNonNull(bdVar, "Null adapterVersion");
        this.adapterVersion = bdVar;
        Objects.requireNonNull(bdVar2, "Null sdkVersion");
        this.sdkVersion = bdVar2;
        Objects.requireNonNull(str, "Null name");
        this.name = str;
        Objects.requireNonNull(str2, "Null signals");
        this.signals = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public bd adapterVersion() {
        return this.adapterVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bc) {
            bc bcVar = (bc) obj;
            return this.adapterVersion.equals(bcVar.adapterVersion()) && this.sdkVersion.equals(bcVar.sdkVersion()) && this.name.equals(bcVar.name()) && this.signals.equals(bcVar.signals());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.adapterVersion.hashCode();
        int hashCode2 = this.sdkVersion.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.signals.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public String name() {
        return this.name;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public bd sdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bc
    public String signals() {
        return this.signals;
    }

    public String toString() {
        String valueOf = String.valueOf(this.adapterVersion);
        String valueOf2 = String.valueOf(this.sdkVersion);
        String str = this.name;
        String str2 = this.signals;
        return "EspSignalData{adapterVersion=" + valueOf + ", sdkVersion=" + valueOf2 + ", name=" + str + ", signals=" + str2 + "}";
    }
}
