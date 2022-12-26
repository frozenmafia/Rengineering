package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.EmailAuthCredential;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzng  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzng extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzng> CREATOR = new zznh();
    private final EmailAuthCredential zza;

    public zzng(EmailAuthCredential emailAuthCredential) {
        this.zza = emailAuthCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final EmailAuthCredential zza() {
        return this.zza;
    }
}
