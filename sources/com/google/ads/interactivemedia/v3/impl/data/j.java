package com.google.ads.interactivemedia.v3.impl.data;
/* loaded from: classes4.dex */
final class j extends b {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final ay nativeViewBounds;
    private final boolean nativeViewHidden;
    private final ay nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private j(String str, String str2, String str3, long j, double d, boolean z, ay ayVar, ay ayVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j;
        this.nativeVolume = d;
        this.nativeViewHidden = z;
        this.nativeViewBounds = ayVar;
        this.nativeViewVisibleBounds = ayVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ j(String str, String str2, String str3, long j, double d, boolean z, ay ayVar, ay ayVar2, i iVar) {
        this(str, str2, str3, j, d, z, ayVar, ayVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.queryId.equals(bVar.queryId()) && this.eventId.equals(bVar.eventId()) && this.appState.equals(bVar.appState()) && this.nativeTime == bVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(bVar.nativeVolume()) && this.nativeViewHidden == bVar.nativeViewHidden() && this.nativeViewBounds.equals(bVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(bVar.nativeViewVisibleBounds());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int hashCode = this.queryId.hashCode();
        int hashCode2 = this.eventId.hashCode();
        int hashCode3 = this.appState.hashCode();
        long j = this.nativeTime;
        int i = (int) (j ^ (j >>> 32));
        int doubleToLongBits = (int) ((Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume));
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ doubleToLongBits) * 1000003) ^ (true != this.nativeViewHidden ? 1237 : 1231)) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public long nativeTime() {
        return this.nativeTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public ay nativeViewBounds() {
        return this.nativeViewBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public ay nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public double nativeVolume() {
        return this.nativeVolume;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        String str = this.queryId;
        String str2 = this.eventId;
        String str3 = this.appState;
        long j = this.nativeTime;
        double d = this.nativeVolume;
        boolean z = this.nativeViewHidden;
        String valueOf = String.valueOf(this.nativeViewBounds);
        String valueOf2 = String.valueOf(this.nativeViewVisibleBounds);
        return "ActivityMonitorData{queryId=" + str + ", eventId=" + str2 + ", appState=" + str3 + ", nativeTime=" + j + ", nativeVolume=" + d + ", nativeViewHidden=" + z + ", nativeViewBounds=" + valueOf + ", nativeViewVisibleBounds=" + valueOf2 + "}";
    }
}
