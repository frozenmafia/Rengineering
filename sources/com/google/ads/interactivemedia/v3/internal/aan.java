package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aan extends aav {
    public static final Parcelable.Creator<aan> CREATOR = new aal(2);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f425b;
    public final int c;
    public final long d;
    public final long e;
    private final aav[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aan(Parcel parcel) {
        super(ChapterFrame.ID);
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f425b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new aav[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (aav) parcel.readParcelable(aav.class.getClassLoader());
        }
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
        aan aanVar = (aan) obj;
        return this.f425b == aanVar.f425b && this.c == aanVar.c && this.d == aanVar.d && this.e == aanVar.e && cp.V(this.a, aanVar.a) && Arrays.equals(this.g, aanVar.g);
    }

    public final int hashCode() {
        int i = this.f425b;
        int i2 = this.c;
        int i3 = (int) this.d;
        int i4 = (int) this.e;
        String str = this.a;
        return ((((((((i + BR.userTeamVM) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.f425b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g.length);
        for (aav aavVar : this.g) {
            parcel.writeParcelable(aavVar, 0);
        }
    }

    public aan(String str, int i, int i2, long j, long j2, aav[] aavVarArr) {
        super(ChapterFrame.ID);
        this.a = str;
        this.f425b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = aavVarArr;
    }
}
