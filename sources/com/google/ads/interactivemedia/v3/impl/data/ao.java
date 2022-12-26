package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ao extends bx {
    private final Integer height;
    private final Integer width;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ao(Integer num, Integer num2) {
        Objects.requireNonNull(num, "Null width");
        this.width = num;
        Objects.requireNonNull(num2, "Null height");
        this.height = num2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bx) {
            bx bxVar = (bx) obj;
            return this.width.equals(bxVar.width()) && this.height.equals(bxVar.height());
        }
        return false;
    }

    public int hashCode() {
        return ((this.width.hashCode() ^ 1000003) * 1000003) ^ this.height.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bx
    public Integer height() {
        return this.height;
    }

    public String toString() {
        Integer num = this.width;
        Integer num2 = this.height;
        return "SizeData{width=" + num + ", height=" + num2 + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bx
    public Integer width() {
        return this.width;
    }
}
