package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.UserProfileChangeRequest;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznv  reason: invalid package */
/* loaded from: classes7.dex */
public final class zznv implements Parcelable.Creator<zznu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zznu createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        UserProfileChangeRequest userProfileChangeRequest = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                userProfileChangeRequest = (UserProfileChangeRequest) SafeParcelReader.createParcelable(parcel, readHeader, UserProfileChangeRequest.CREATOR);
            } else if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zznu(userProfileChangeRequest, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zznu[] newArray(int i) {
        return new zznu[i];
    }
}
