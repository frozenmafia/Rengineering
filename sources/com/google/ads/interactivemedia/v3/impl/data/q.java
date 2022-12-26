package com.google.ads.interactivemedia.v3.impl.data;
/* loaded from: classes4.dex */
final class q extends ay {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private q(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.height = i3;
        this.width = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(int i, int i2, int i3, int i4, p pVar) {
        this(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ay) {
            ay ayVar = (ay) obj;
            return this.left == ayVar.left() && this.top == ayVar.top() && this.height == ayVar.height() && this.width == ayVar.width();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int left() {
        return this.left;
    }

    public String toString() {
        int i = this.left;
        int i2 = this.top;
        int i3 = this.height;
        int i4 = this.width;
        return "BoundingRectData{left=" + i + ", top=" + i2 + ", height=" + i3 + ", width=" + i4 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ay
    public int width() {
        return this.width;
    }
}
