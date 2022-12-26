package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmu  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzmu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmu> CREATOR = new zzmv();
    private final zzxd zza;

    public zzmu(zzxd zzxdVar) {
        this.zza = zzxdVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzxd zza() {
        return this.zza;
    }
}
