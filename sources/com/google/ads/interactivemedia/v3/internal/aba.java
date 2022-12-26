package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class aba extends aav {
    public static final Parcelable.Creator<aba> CREATOR = new aal(10);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aba(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.v3.internal.cp.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.a = r0
            java.lang.String r3 = r3.readString()
            r2.f436b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aba.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aba abaVar = (aba) obj;
        return this.f.equals(abaVar.f) && cp.V(this.a, abaVar.a) && cp.V(this.f436b, abaVar.f436b);
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode();
        String str = this.a;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.f436b;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final String toString() {
        String str = this.f;
        String str2 = this.f436b;
        return str + ": url=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.f436b);
    }

    public aba(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.f436b = str3;
    }
}
