package com.google.ads.interactivemedia.v3.impl.data;
/* loaded from: classes7.dex */
final class t extends bb {
    private final double end;
    private final boolean played;
    private final double start;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(double d, double d2, boolean z) {
        this.start = d;
        this.end = d2;
        this.played = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bb
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bb) {
            bb bbVar = (bb) obj;
            return Double.doubleToLongBits(this.start) == Double.doubleToLongBits(bbVar.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(bbVar.end()) && this.played == bbVar.played();
        }
        return false;
    }

    public int hashCode() {
        int doubleToLongBits = (int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start));
        return ((((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end))) ^ ((doubleToLongBits ^ 1000003) * 1000003)) * 1000003) ^ (true != this.played ? 1237 : 1231);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bb
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bb
    public double start() {
        return this.start;
    }

    public String toString() {
        double d = this.start;
        double d2 = this.end;
        boolean z = this.played;
        return "CuePointData{start=" + d + ", end=" + d2 + ", played=" + z + "}";
    }
}
