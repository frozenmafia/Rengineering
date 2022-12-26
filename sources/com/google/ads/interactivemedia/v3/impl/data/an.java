package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* loaded from: classes7.dex */
final class an extends ResizeAndPositionVideoMsgData {
    private final Integer height;
    private final Integer width;
    private final Integer x;
    private final Integer y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public an(Integer num, Integer num2, Integer num3, Integer num4) {
        Objects.requireNonNull(num, "Null x");
        this.x = num;
        Objects.requireNonNull(num2, "Null y");
        this.y = num2;
        Objects.requireNonNull(num3, "Null width");
        this.width = num3;
        Objects.requireNonNull(num4, "Null height");
        this.height = num4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResizeAndPositionVideoMsgData) {
            ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData = (ResizeAndPositionVideoMsgData) obj;
            return this.x.equals(resizeAndPositionVideoMsgData.x()) && this.y.equals(resizeAndPositionVideoMsgData.y()) && this.width.equals(resizeAndPositionVideoMsgData.width()) && this.height.equals(resizeAndPositionVideoMsgData.height());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.x.hashCode();
        int hashCode2 = this.y.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.width.hashCode()) * 1000003) ^ this.height.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer width() {
        return this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer x() {
        return this.x;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
    public Integer y() {
        return this.y;
    }
}
