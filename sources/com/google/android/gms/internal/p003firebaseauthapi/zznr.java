package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznr  reason: invalid package */
/* loaded from: classes7.dex */
public final class zznr implements Parcelable.Creator<zznq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zznq createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zznq(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zznq[] newArray(int i) {
        return new zznq[i];
    }
}
