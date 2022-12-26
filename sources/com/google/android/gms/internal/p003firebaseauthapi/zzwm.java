package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwm  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzwm implements Parcelable.Creator<zzwl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwl createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 2) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzwj.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzwl(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzwl[] newArray(int i) {
        return new zzwl[i];
    }
}
