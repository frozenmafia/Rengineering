package com.dreampay.commons.cards;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class BinMetaData {
    private final String brand;
    private final String issuer;
    private final int maxCvvLength;
    private final int maxLength;
    private final int minCvvLength;
    private final int minLength;
    private final String src;

    public static /* synthetic */ BinMetaData copy$default(BinMetaData binMetaData, String str, String str2, int i, int i2, int i3, int i4, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = binMetaData.brand;
        }
        if ((i5 & 2) != 0) {
            str2 = binMetaData.issuer;
        }
        String str4 = str2;
        if ((i5 & 4) != 0) {
            i = binMetaData.minCvvLength;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = binMetaData.maxCvvLength;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = binMetaData.minLength;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = binMetaData.maxLength;
        }
        int i9 = i4;
        if ((i5 & 64) != 0) {
            str3 = binMetaData.src;
        }
        return binMetaData.copy(str, str4, i6, i7, i8, i9, str3);
    }

    public final String component1() {
        return this.brand;
    }

    public final String component2() {
        return this.issuer;
    }

    public final int component3() {
        return this.minCvvLength;
    }

    public final int component4() {
        return this.maxCvvLength;
    }

    public final int component5() {
        return this.minLength;
    }

    public final int component6() {
        return this.maxLength;
    }

    public final String component7() {
        return this.src;
    }

    public final BinMetaData copy(String str, String str2, int i, int i2, int i3, int i4, String str3) {
        runAnimators.ag$a(str, "brand");
        runAnimators.ag$a(str2, "issuer");
        return new BinMetaData(str, str2, i, i2, i3, i4, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinMetaData) {
            BinMetaData binMetaData = (BinMetaData) obj;
            return runAnimators.values((Object) this.brand, (Object) binMetaData.brand) && runAnimators.values((Object) this.issuer, (Object) binMetaData.issuer) && this.minCvvLength == binMetaData.minCvvLength && this.maxCvvLength == binMetaData.maxCvvLength && this.minLength == binMetaData.minLength && this.maxLength == binMetaData.maxLength && runAnimators.values((Object) this.src, (Object) binMetaData.src);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.brand.hashCode();
        int hashCode2 = this.issuer.hashCode();
        int i = this.minCvvLength;
        int i2 = this.maxCvvLength;
        int i3 = this.minLength;
        int i4 = this.maxLength;
        String str = this.src;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinMetaData(brand=" + this.brand + ", issuer=" + this.issuer + ", minCvvLength=" + this.minCvvLength + ", maxCvvLength=" + this.maxCvvLength + ", minLength=" + this.minLength + ", maxLength=" + this.maxLength + ", src=" + ((Object) this.src) + ')';
    }

    public BinMetaData(String str, String str2, int i, int i2, int i3, int i4, String str3) {
        runAnimators.ag$a(str, "brand");
        runAnimators.ag$a(str2, "issuer");
        this.brand = str;
        this.issuer = str2;
        this.minCvvLength = i;
        this.maxCvvLength = i2;
        this.minLength = i3;
        this.maxLength = i4;
        this.src = str3;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final int getMaxCvvLength() {
        return this.maxCvvLength;
    }

    public final int getMinCvvLength() {
        return this.minCvvLength;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    public final String getSrc() {
        return this.src;
    }
}
