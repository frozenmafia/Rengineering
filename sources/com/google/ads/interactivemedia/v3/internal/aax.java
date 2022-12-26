package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aax extends aav {
    public static final Parcelable.Creator<aax> CREATOR = new aal(7);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f432b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public aax(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.a = i;
        this.f432b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aav, android.os.Parcelable
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
        aax aaxVar = (aax) obj;
        return this.a == aaxVar.a && this.f432b == aaxVar.f432b && this.c == aaxVar.c && Arrays.equals(this.d, aaxVar.d) && Arrays.equals(this.e, aaxVar.e);
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.f432b;
        int i3 = this.c;
        return ((((((((i + BR.userTeamVM) * 31) + i2) * 31) + i3) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f432b);
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aax(Parcel parcel) {
        super(MlltFrame.ID);
        this.a = parcel.readInt();
        this.f432b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = (int[]) cp.G(parcel.createIntArray());
        this.e = (int[]) cp.G(parcel.createIntArray());
    }
}
