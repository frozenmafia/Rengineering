package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzna  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzna extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzna> CREATOR = new zznb();
    private final zzxq zza;

    public zzna(zzxq zzxqVar) {
        this.zza = zzxqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzxq zza() {
        return this.zza;
    }
}
