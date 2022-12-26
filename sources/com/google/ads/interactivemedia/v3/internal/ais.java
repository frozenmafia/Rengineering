package com.google.ads.interactivemedia.v3.internal;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ais extends akm {
    private final String TXXX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ais(String str) {
        Objects.requireNonNull(str, "Null TXXX");
        this.TXXX = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.akm
    public String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akm) {
            return this.TXXX.equals(((akm) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.TXXX;
        return "TimedMetadataWithKeys{TXXX=" + str + "}";
    }
}
