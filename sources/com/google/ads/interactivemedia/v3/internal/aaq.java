package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aaq extends aav {
    public static final Parcelable.Creator<aaq> CREATOR = new aal(5);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f428b;
    public final String c;
    public final byte[] d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aaq(Parcel parcel) {
        super(GeobFrame.ID);
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f428b = parcel.readString();
        this.c = parcel.readString();
        this.d = (byte[]) cp.G(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaq aaqVar = (aaq) obj;
        return cp.V(this.a, aaqVar.a) && cp.V(this.f428b, aaqVar.f428b) && cp.V(this.c, aaqVar.c) && Arrays.equals(this.d, aaqVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f428b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.c;
        return ((((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        String str3 = this.f428b;
        String str4 = this.c;
        return str + ": mimeType=" + str2 + ", filename=" + str3 + ", description=" + str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.f428b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public aaq(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.a = str;
        this.f428b = str2;
        this.c = str3;
        this.d = bArr;
    }
}
