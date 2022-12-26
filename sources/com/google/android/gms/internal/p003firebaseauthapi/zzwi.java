package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwi  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzwi implements Parcelable.Creator<zzwh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwh createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzwl zzwlVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 2) {
                zzwlVar = (zzwl) SafeParcelReader.createParcelable(parcel, readHeader, zzwl.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzwh(zzwlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzwh[] newArray(int i) {
        return new zzwh[i];
    }
}
