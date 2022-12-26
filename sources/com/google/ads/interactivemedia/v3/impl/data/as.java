package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class as extends by {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    /* JADX INFO: Access modifiers changed from: package-private */
    public as(long j, long j2, String str) {
        this.currentTime = j;
        this.duration = j2;
        Objects.requireNonNull(str, "Null timeUnit");
        this.timeUnit = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.by
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.by
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof by) {
            by byVar = (by) obj;
            return this.currentTime == byVar.currentTime() && this.duration == byVar.duration() && this.timeUnit.equals(byVar.timeUnit());
        }
        return false;
    }

    public int hashCode() {
        long j = this.currentTime;
        long j2 = this.duration;
        int i = (int) (j ^ (j >>> 32));
        return ((((int) (j2 ^ (j2 >>> 32))) ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.timeUnit.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.by
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        long j = this.currentTime;
        long j2 = this.duration;
        String str = this.timeUnit;
        return "TimeUpdateData{currentTime=" + j + ", duration=" + j2 + ", timeUnit=" + str + "}";
    }
}
