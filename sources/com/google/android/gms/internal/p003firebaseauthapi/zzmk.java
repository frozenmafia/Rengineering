package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmk  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmk> CREATOR = new zzml();
    private final String zza;
    private final zzxq zzb;

    public zzmk(String str, zzxq zzxqVar) {
        this.zza = str;
        this.zzb = zzxqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzxq zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
