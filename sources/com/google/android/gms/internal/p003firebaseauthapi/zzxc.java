package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzxc implements Parcelable.Creator<zzxb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxb createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzwu zzwuVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                str3 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 5) {
                zzwuVar = (zzwu) SafeParcelReader.createParcelable(parcel, readHeader, zzwu.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzxb(str, str2, str3, zzwuVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzxb[] newArray(int i) {
        return new zzxb[i];
    }
}
