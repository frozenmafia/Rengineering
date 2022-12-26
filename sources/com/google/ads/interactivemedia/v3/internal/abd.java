package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class abd implements an {
    public static final Parcelable.Creator<abd> CREATOR = new abc(0);
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f438b;
    public final long c;
    public final long d;
    public final long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ abd(Parcel parcel) {
        this.a = parcel.readLong();
        this.f438b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
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
        abd abdVar = (abd) obj;
        return this.a == abdVar.a && this.f438b == abdVar.f438b && this.c == abdVar.c && this.d == abdVar.d && this.e == abdVar.e;
    }

    public final int hashCode() {
        return ((((((((ayu.f(this.a) + BR.userTeamVM) * 31) + ayu.f(this.f438b)) * 31) + ayu.f(this.c)) * 31) + ayu.f(this.d)) * 31) + ayu.f(this.e);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.f438b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        return "Motion photo metadata: photoStartPosition=" + j + ", photoSize=" + j2 + ", photoPresentationTimestampUs=" + j3 + ", videoStartPosition=" + j4 + ", videoSize=" + j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.f438b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }
}
