package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.PhoneAuthCredential;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzni  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzni extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzni> CREATOR = new zznj();
    private final PhoneAuthCredential zza;
    private final String zzb;

    public zzni(PhoneAuthCredential phoneAuthCredential, String str) {
        this.zza = phoneAuthCredential;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }
}
