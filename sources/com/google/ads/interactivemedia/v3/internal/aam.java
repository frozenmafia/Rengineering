package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aam extends aav {
    public static final Parcelable.Creator<aam> CREATOR = new aal(0);
    public final byte[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aam(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.v3.internal.cp.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.ads.interactivemedia.v3.internal.cp.G(r3)
            byte[] r3 = (byte[]) r3
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aam.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aam aamVar = (aam) obj;
        return this.f.equals(aamVar.f) && Arrays.equals(this.a, aamVar.a);
    }

    public final int hashCode() {
        return ((this.f.hashCode() + BR.userTeamVM) * 31) + Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.a);
    }

    public aam(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }
}
