package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class abb implements an {
    public static final Parcelable.Creator<abb> CREATOR = new abc(1);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f437b;
    public final int c;
    public final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ abb(Parcel parcel) {
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f437b = (byte[]) cp.G(parcel.createByteArray());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public abb(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.f437b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
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
        abb abbVar = (abb) obj;
        return this.a.equals(abbVar.a) && Arrays.equals(this.f437b, abbVar.f437b) && this.c == abbVar.c && this.d == abbVar.d;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + BR.userTeamVM) * 31) + Arrays.hashCode(this.f437b)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "mdta: key=".concat(String.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.f437b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
