package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzob  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzob implements Parcelable.Creator<zzoa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzoa createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        ArrayList arrayList = null;
        zze zzeVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzwu.CREATOR);
            } else if (fieldId == 3) {
                zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzoa(str, arrayList, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzoa[] newArray(int i) {
        return new zzoa[i];
    }
}
