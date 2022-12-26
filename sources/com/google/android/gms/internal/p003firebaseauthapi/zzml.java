package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzml  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzml implements Parcelable.Creator<zzmk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmk createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        zzxq zzxqVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                zzxqVar = (zzxq) SafeParcelReader.createParcelable(parcel, readHeader, zzxq.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzmk(str, zzxqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmk[] newArray(int i) {
        return new zzmk[i];
    }
}
