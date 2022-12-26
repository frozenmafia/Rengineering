package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ag extends bs {
    private final String content;
    private final String contentType;
    private final int errorCode;
    private final String id;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ag(String str, String str2, String str3, int i) {
        Objects.requireNonNull(str, "Null id");
        this.id = str;
        Objects.requireNonNull(str2, "Null content");
        this.content = str2;
        Objects.requireNonNull(str3, "Null contentType");
        this.contentType = str3;
        this.errorCode = i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bs
    public String content() {
        return this.content;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bs
    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bs) {
            bs bsVar = (bs) obj;
            return this.id.equals(bsVar.id()) && this.content.equals(bsVar.content()) && this.contentType.equals(bsVar.contentType()) && this.errorCode == bsVar.errorCode();
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bs
    public int errorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.errorCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bs
    public String id() {
        return this.id;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.content;
        String str3 = this.contentType;
        int i = this.errorCode;
        return "NetworkResponseData{id=" + str + ", content=" + str2 + ", contentType=" + str3 + ", errorCode=" + i + "}";
    }
}
