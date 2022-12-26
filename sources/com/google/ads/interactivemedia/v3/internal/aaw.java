package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
/* loaded from: classes4.dex */
public final class aaw extends aav {
    public static final Parcelable.Creator<aaw> CREATOR = new aal(6);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f431b;
    public final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aaw(Parcel parcel) {
        super(InternalFrame.ID);
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f431b = parcel.readString();
        this.c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aaw aawVar = (aaw) obj;
        return cp.V(this.f431b, aawVar.f431b) && cp.V(this.a, aawVar.a) && cp.V(this.c, aawVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f431b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.c;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        String str3 = this.f431b;
        return str + ": domain=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
    }

    public aaw(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.a = str;
        this.f431b = str2;
        this.c = str3;
    }
}
