package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes7.dex */
final class zzbl implements Parcelable.Creator<zzbk> {
    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* synthetic */ zzbk[] newArray(int i) {
        return new zzbk[i];
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* synthetic */ zzbk createFromParcel(Parcel parcel) {
        return new zzbk(parcel);
    }
}
