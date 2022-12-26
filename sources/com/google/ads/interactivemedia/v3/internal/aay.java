package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aay extends aav {
    public static final Parcelable.Creator<aay> CREATOR = new aal(8);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f433b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aay(Parcel parcel) {
        super(PrivFrame.ID);
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f433b = (byte[]) cp.G(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aay aayVar = (aay) obj;
        return cp.V(this.a, aayVar.a) && Arrays.equals(this.f433b, aayVar.f433b);
    }

    public final int hashCode() {
        String str = this.a;
        return (((str != null ? str.hashCode() : 0) + BR.userTeamVM) * 31) + Arrays.hashCode(this.f433b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        return str + ": owner=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.f433b);
    }

    public aay(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.a = str;
        this.f433b = bArr;
    }
}
