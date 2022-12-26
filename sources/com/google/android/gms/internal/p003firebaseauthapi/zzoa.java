package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.List;
import o.nextViewFromScrapList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoa  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoa> CREATOR = new zzob();
    final String zza;
    final List<zzwu> zzb;
    final zze zzc;

    public zzoa(String str, List<zzwu> list, zze zzeVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zze zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return nextViewFromScrapList.ah$a(this.zzb);
    }
}
