package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmf  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzmf implements Parcelable.Creator<zzme> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzme createFromParcel(Parcel parcel) {
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
        return new zzme(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzme[] newArray(int i) {
        return new zzme[i];
    }
}
