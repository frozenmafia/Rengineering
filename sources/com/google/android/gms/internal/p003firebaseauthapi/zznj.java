package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthCredential;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zznj implements Parcelable.Creator<zzni> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzni createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PhoneAuthCredential phoneAuthCredential = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                phoneAuthCredential = (PhoneAuthCredential) SafeParcelReader.createParcelable(parcel, readHeader, PhoneAuthCredential.CREATOR);
            } else if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzni(phoneAuthCredential, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzni[] newArray(int i) {
        return new zzni[i];
    }
}
