package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxp  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzxp implements Parcelable.Creator<zzxo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxo createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                arrayList = SafeParcelReader.createStringList(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzxo(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzxo[] newArray(int i) {
        return new zzxo[i];
    }
}
