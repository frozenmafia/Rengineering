package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class h implements a {
    private String appState;
    private String eventId;
    private long nativeTime;
    private ay nativeViewBounds;
    private boolean nativeViewHidden;
    private ay nativeViewVisibleBounds;
    private double nativeVolume;
    private String queryId;
    private byte set$0;

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a appState(String str) {
        Objects.requireNonNull(str, "Null appState");
        this.appState = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public b build() {
        String str;
        String str2;
        String str3;
        ay ayVar;
        ay ayVar2;
        if (this.set$0 != 7 || (str = this.queryId) == null || (str2 = this.eventId) == null || (str3 = this.appState) == null || (ayVar = this.nativeViewBounds) == null || (ayVar2 = this.nativeViewVisibleBounds) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.queryId == null) {
                sb.append(" queryId");
            }
            if (this.eventId == null) {
                sb.append(" eventId");
            }
            if (this.appState == null) {
                sb.append(" appState");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" nativeTime");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" nativeVolume");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" nativeViewHidden");
            }
            if (this.nativeViewBounds == null) {
                sb.append(" nativeViewBounds");
            }
            if (this.nativeViewVisibleBounds == null) {
                sb.append(" nativeViewVisibleBounds");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new j(str, str2, str3, this.nativeTime, this.nativeVolume, this.nativeViewHidden, ayVar, ayVar2, null);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a eventId(String str) {
        Objects.requireNonNull(str, "Null eventId");
        this.eventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeTime(long j) {
        this.nativeTime = j;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewBounds(ay ayVar) {
        Objects.requireNonNull(ayVar, "Null nativeViewBounds");
        this.nativeViewBounds = ayVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewHidden(boolean z) {
        this.nativeViewHidden = z;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewVisibleBounds(ay ayVar) {
        Objects.requireNonNull(ayVar, "Null nativeViewVisibleBounds");
        this.nativeViewVisibleBounds = ayVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeVolume(double d) {
        this.nativeVolume = d;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a queryId(String str) {
        Objects.requireNonNull(str, "Null queryId");
        this.queryId = str;
        return this;
    }
}
