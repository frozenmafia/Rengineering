package com.google.android.gms.cloudmessaging;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
final class zzc implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i) {
        return new zza[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza createFromParcel(Parcel parcel) {
        return new zza(parcel.readStrongBinder());
    }
}
