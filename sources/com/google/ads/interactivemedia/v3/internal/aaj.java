package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class aaj implements an {
    public static final Parcelable.Creator<aaj> CREATOR = new aai();
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f423b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public aaj(int i, String str, String str2, String str3, boolean z, int i2) {
        af.u(i2 == -1 || i2 > 0);
        this.a = i;
        this.f423b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final void a(ak akVar) {
        String str = this.c;
        if (str != null) {
            akVar.K(str);
        }
        String str2 = this.f423b;
        if (str2 != null) {
            akVar.D(str2);
        }
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
        aaj aajVar = (aaj) obj;
        return this.a == aajVar.a && cp.V(this.f423b, aajVar.f423b) && cp.V(this.c, aajVar.c) && cp.V(this.d, aajVar.d) && this.e == aajVar.e && this.f == aajVar.f;
    }

    public final int hashCode() {
        int i = this.a;
        String str = this.f423b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.d;
        return ((((((((((i + BR.userTeamVM) * 31) + hashCode) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.f423b;
        int i = this.a;
        int i2 = this.f;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i + ", metadataInterval=" + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.f423b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        cp.U(parcel, this.e);
        parcel.writeInt(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aaj(Parcel parcel) {
        this.a = parcel.readInt();
        this.f423b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = cp.ac(parcel);
        this.f = parcel.readInt();
    }
}
