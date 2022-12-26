package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes4.dex */
public final class pi implements Parcelable {
    public static final Parcelable.Creator<pi> CREATOR = new ph(0);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1212b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public pi(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.f1212b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pi(Parcel parcel) {
        this.a = parcel.readInt();
        this.f1212b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pi piVar = (pi) obj;
        return this.a == piVar.a && this.f1212b == piVar.f1212b && TextUtils.equals(this.c, piVar.c) && TextUtils.equals(this.d, piVar.d) && TextUtils.equals(this.e, piVar.e) && TextUtils.equals(this.f, piVar.f);
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.f1212b;
        String str = this.c;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.e;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.f;
        return (((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f1212b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
