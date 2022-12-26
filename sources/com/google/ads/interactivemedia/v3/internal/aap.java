package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
/* loaded from: classes4.dex */
public final class aap extends aav {
    public static final Parcelable.Creator<aap> CREATOR = new aal(4);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f427b;
    public final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aap(Parcel parcel) {
        super(CommentFrame.ID);
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f427b = parcel.readString();
        this.c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aap aapVar = (aap) obj;
        return cp.V(this.f427b, aapVar.f427b) && cp.V(this.a, aapVar.a) && cp.V(this.c, aapVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f427b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.c;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        String str3 = this.f427b;
        return str + ": language=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
    }

    public aap(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.a = str;
        this.f427b = str2;
        this.c = str3;
    }
}
