package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmv  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzmv implements Parcelable.Creator<zzmu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmu createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzxd zzxdVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 1) {
                zzxdVar = (zzxd) SafeParcelReader.createParcelable(parcel, readHeader, zzxd.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzmu(zzxdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmu[] newArray(int i) {
        return new zzmu[i];
    }
}
