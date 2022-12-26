package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aao extends aav {
    public static final Parcelable.Creator<aao> CREATOR = new aal(3);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f426b;
    public final boolean c;
    public final String[] d;
    private final aav[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aao(Parcel parcel) {
        super(ChapterTocFrame.ID);
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f426b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = (String[]) cp.G(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.e = new aav[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.e[i2] = (aav) parcel.readParcelable(aav.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aao aaoVar = (aao) obj;
        return this.f426b == aaoVar.f426b && this.c == aaoVar.c && cp.V(this.a, aaoVar.a) && Arrays.equals(this.d, aaoVar.d) && Arrays.equals(this.e, aaoVar.e);
    }

    public final int hashCode() {
        boolean z = this.f426b;
        boolean z2 = this.c;
        String str = this.a;
        return (((((z ? 1 : 0) + BR.userTeamVM) * 31) + (z2 ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.f426b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.d);
        parcel.writeInt(this.e.length);
        for (aav aavVar : this.e) {
            parcel.writeParcelable(aavVar, 0);
        }
    }

    public aao(String str, boolean z, boolean z2, String[] strArr, aav[] aavVarArr) {
        super(ChapterTocFrame.ID);
        this.a = str;
        this.f426b = z;
        this.c = z2;
        this.d = strArr;
        this.e = aavVarArr;
    }
}
