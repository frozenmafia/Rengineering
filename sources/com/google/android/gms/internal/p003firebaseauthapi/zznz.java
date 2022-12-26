package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznz  reason: invalid package */
/* loaded from: classes5.dex */
public final class zznz implements Parcelable.Creator<zzny> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzny createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Status status = null;
        zze zzeVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                status = (Status) SafeParcelReader.createParcelable(parcel, readHeader, Status.CREATOR);
            } else if (fieldId == 2) {
                zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzny(status, zzeVar, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzny[] newArray(int i) {
        return new zzny[i];
    }
}
