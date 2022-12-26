package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aak extends aav {
    public static final Parcelable.Creator<aak> CREATOR = new aal(1);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f424b;
    public final int c;
    public final byte[] d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aak(Parcel parcel) {
        super(ApicFrame.ID);
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f424b = parcel.readString();
        this.c = parcel.readInt();
        this.d = (byte[]) cp.G(parcel.createByteArray());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav, com.google.ads.interactivemedia.v3.internal.an
    public final void a(ak akVar) {
        akVar.v(this.d, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aak aakVar = (aak) obj;
        return this.c == aakVar.c && cp.V(this.a, aakVar.a) && cp.V(this.f424b, aakVar.f424b) && Arrays.equals(this.d, aakVar.d);
    }

    public final int hashCode() {
        int i = this.c;
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f424b;
        return ((((((i + BR.userTeamVM) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        String str3 = this.f424b;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.f424b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
    }

    public aak(String str, String str2, int i, byte[] bArr) {
        super(ApicFrame.ID);
        this.a = str;
        this.f424b = str2;
        this.c = i;
        this.d = bArr;
    }
}
