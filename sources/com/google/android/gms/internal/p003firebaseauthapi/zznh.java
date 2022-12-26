package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.EmailAuthCredential;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznh  reason: invalid package */
/* loaded from: classes7.dex */
public final class zznh implements Parcelable.Creator<zzng> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzng createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        EmailAuthCredential emailAuthCredential = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 1) {
                emailAuthCredential = (EmailAuthCredential) SafeParcelReader.createParcelable(parcel, readHeader, EmailAuthCredential.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzng(emailAuthCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzng[] newArray(int i) {
        return new zzng[i];
    }
}
