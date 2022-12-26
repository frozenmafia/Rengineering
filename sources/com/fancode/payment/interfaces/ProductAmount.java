package com.fancode.payment.interfaces;

import android.os.Parcel;
import android.os.Parcelable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ProductAmount implements Parcelable {
    public static final Parcelable.Creator<ProductAmount> CREATOR = new toString();
    private final String ag$a;
    private final String toString;
    private final int values;

    /* loaded from: classes6.dex */
    public static final class toString implements Parcelable.Creator<ProductAmount> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public final ProductAmount createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new ProductAmount(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public final ProductAmount[] newArray(int i) {
            return new ProductAmount[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductAmount) {
            ProductAmount productAmount = (ProductAmount) obj;
            return this.values == productAmount.values && runAnimators.values((Object) this.toString, (Object) productAmount.toString) && runAnimators.values((Object) this.ag$a, (Object) productAmount.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.values * 31) + this.toString.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        int i = this.values;
        String str = this.toString;
        String str2 = this.ag$a;
        return "ProductAmount(price=" + i + ", code=" + str + ", symbol=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeInt(this.values);
        parcel.writeString(this.toString);
        parcel.writeString(this.ag$a);
    }

    public ProductAmount(int i, String str, String str2) {
        runAnimators.ag$a(str, "code");
        runAnimators.ag$a(str2, "symbol");
        this.values = i;
        this.toString = str;
        this.ag$a = str2;
    }

    public final int ag$a() {
        return this.values;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final String values() {
        return this.ag$a;
    }
}
