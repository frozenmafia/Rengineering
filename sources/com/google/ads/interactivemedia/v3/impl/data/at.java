package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class at extends cc {
    private final Integer downloadBandwidthKbps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public at(Integer num) {
        Objects.requireNonNull(num, "Null downloadBandwidthKbps");
        this.downloadBandwidthKbps = num;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.cc
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cc) {
            return this.downloadBandwidthKbps.equals(((cc) obj).downloadBandwidthKbps());
        }
        return false;
    }

    public int hashCode() {
        return this.downloadBandwidthKbps.hashCode() ^ 1000003;
    }

    public String toString() {
        Integer num = this.downloadBandwidthKbps;
        return "VideoEnvironmentData{downloadBandwidthKbps=" + num + "}";
    }
}
