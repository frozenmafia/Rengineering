package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwz  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzwz implements Parcelable.Creator<zzwy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwy createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 2) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzww.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzwy(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzwy[] newArray(int i) {
        return new zzwy[i];
    }
}
