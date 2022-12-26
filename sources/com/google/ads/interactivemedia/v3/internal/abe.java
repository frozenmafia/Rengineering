package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
/* loaded from: classes4.dex */
public final class abe implements an {
    public static final Parcelable.Creator<abe> CREATOR = new abc(2);
    public final float a;

    /* renamed from: b  reason: collision with root package name */
    public final int f439b;

    public abe(float f, int i) {
        this.a = f;
        this.f439b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ abe(Parcel parcel) {
        this.a = parcel.readFloat();
        this.f439b = parcel.readInt();
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
        abe abeVar = (abe) obj;
        return this.a == abeVar.a && this.f439b == abeVar.f439b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + BR.userTeamVM) * 31) + this.f439b;
    }

    public final String toString() {
        float f = this.a;
        int i = this.f439b;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.f439b);
    }
}
