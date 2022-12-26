package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznb  reason: invalid package */
/* loaded from: classes7.dex */
public final class zznb implements Parcelable.Creator<zzna> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzna createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzxq zzxqVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 1) {
                zzxqVar = (zzxq) SafeParcelReader.createParcelable(parcel, readHeader, zzxq.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzna(zzxqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzna[] newArray(int i) {
        return new zzna[i];
    }
}
