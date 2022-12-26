package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* loaded from: classes7.dex */
final class af extends br {
    private final int connectionTimeoutMs;
    private final String content;
    private final String id;
    private final int readTimeoutMs;
    private final bq requestType;
    private final String url;
    private final String userAgent;

    /* JADX INFO: Access modifiers changed from: package-private */
    public af(bq bqVar, String str, String str2, String str3, String str4, int i, int i2) {
        Objects.requireNonNull(bqVar, "Null requestType");
        this.requestType = bqVar;
        Objects.requireNonNull(str, "Null id");
        this.id = str;
        Objects.requireNonNull(str2, "Null url");
        this.url = str2;
        this.content = str3;
        Objects.requireNonNull(str4, "Null userAgent");
        this.userAgent = str4;
        this.connectionTimeoutMs = i;
        this.readTimeoutMs = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.br
    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.br
    public String content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof br) {
            br brVar = (br) obj;
            if (this.requestType.equals(brVar.requestType()) && this.id.equals(brVar.id()) && this.url.equals(brVar.url())) {
                String str = this.content;
                if (str == null) {
                    if (brVar.content() != null) {
                        return false;
                    }
                } else if (!str.equals(brVar.content())) {
                    return false;
                }
                return this.userAgent.equals(brVar.userAgent()) && this.connectionTimeoutMs == brVar.connectionTimeoutMs() && this.readTimeoutMs == brVar.readTimeoutMs();
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.requestType.hashCode();
        int hashCode2 = this.id.hashCode();
        int hashCode3 = this.url.hashCode();
        String str = this.content;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003) ^ this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.br
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.br
    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.br
    public bq requestType() {
        return this.requestType;
    }

    public String toString() {
        String valueOf = String.valueOf(this.requestType);
        String str = this.id;
        String str2 = this.url;
        String str3 = this.content;
        String str4 = this.userAgent;
        int i = this.connectionTimeoutMs;
        int i2 = this.readTimeoutMs;
        return "NetworkRequestData{requestType=" + valueOf + ", id=" + str + ", url=" + str2 + ", content=" + str3 + ", userAgent=" + str4 + ", connectionTimeoutMs=" + i + ", readTimeoutMs=" + i2 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.br
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.br
    public String userAgent() {
        return this.userAgent;
    }
}
