package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwk  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzwk implements Parcelable.Creator<zzwj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzwj createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzwy zzwyVar = null;
        String str5 = null;
        String str6 = null;
        zze zzeVar = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    zzwyVar = (zzwy) SafeParcelReader.createParcelable(parcel, readHeader, zzwy.CREATOR);
                    break;
                case 8:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 11:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzwu.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzwj(str, str2, z, str3, str4, zzwyVar, str5, str6, j, j2, z2, zzeVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzwj[] newArray(int i) {
        return new zzwj[i];
    }
}
