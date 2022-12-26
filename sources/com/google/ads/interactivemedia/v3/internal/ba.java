package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
public final class ba implements Comparable<ba>, Parcelable {
    public static final Parcelable.Creator<ba> CREATOR = new m(3);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f783b;
    public final int c;

    public ba() {
        this.a = -1;
        this.f783b = -1;
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba(Parcel parcel) {
        this.a = parcel.readInt();
        this.f783b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ba baVar) {
        ba baVar2 = baVar;
        int i = this.a - baVar2.a;
        if (i == 0) {
            int i2 = this.f783b - baVar2.f783b;
            return i2 == 0 ? this.c - baVar2.c : i2;
        }
        return i;
    }

    @Override // android.os.Parcelable
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
        ba baVar = (ba) obj;
        return this.a == baVar.a && this.f783b == baVar.f783b && this.c == baVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.f783b) * 31) + this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.f783b;
        int i3 = this.c;
        return i + "." + i2 + "." + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f783b);
        parcel.writeInt(this.c);
    }
}
