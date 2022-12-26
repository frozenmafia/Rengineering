package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p003firebaseauthapi.zzaf;
import com.google.android.gms.internal.p003firebaseauthapi.zzxq;
import com.google.firebase.auth.zze;
/* loaded from: classes5.dex */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new Parcelable.Creator<zze>() { // from class: o.MessageThreadUtil.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ zze createFromParcel(Parcel parcel) {
            int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
            String str = null;
            String str2 = null;
            String str3 = null;
            zzxq zzxqVar = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (parcel.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 2:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 3:
                        str3 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 4:
                        zzxqVar = (zzxq) SafeParcelReader.createParcelable(parcel, readHeader, zzxq.CREATOR);
                        break;
                    case 5:
                        str4 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 6:
                        str5 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 7:
                        str6 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            }
            SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
            return new zze(str, str2, str3, zzxqVar, str4, str5, str6);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zze[] newArray(int i) {
            return new zze[i];
        }
    };
    private final String HaptikSDK$b;
    private final String ag$a;
    private final zzxq ah$a;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private final String values;

    public zze(String str, String str2, String str3, zzxq zzxqVar, String str4, String str5, String str6) {
        this.toString = zzaf.zzc(str);
        this.values = str2;
        this.valueOf = str3;
        this.ah$a = zzxqVar;
        this.ag$a = str4;
        this.HaptikSDK$b = str5;
        this.invoke = str6;
    }

    public static zzxq ah$a(zze zzeVar, String str) {
        Preconditions.checkNotNull(zzeVar);
        zzxq zzxqVar = zzeVar.ah$a;
        return zzxqVar != null ? zzxqVar : new zzxq(zzeVar.values, zzeVar.valueOf, zzeVar.toString, null, zzeVar.HaptikSDK$b, null, str, zzeVar.ag$a, zzeVar.invoke);
    }

    public static zze toString(String str, String str2, String str3, String str4, String str5) {
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zze(str, str2, str3, null, str4, str5, null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public static zze valueOf(zzxq zzxqVar) {
        Preconditions.checkNotNull(zzxqVar, "Must specify a non-null webSignInCredential");
        return new zze(null, null, null, zzxqVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String ag$a() {
        return this.toString;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return new zze(this.toString, this.values, this.valueOf, this.ah$a, this.ag$a, this.HaptikSDK$b, this.invoke);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.toString, false);
        SafeParcelWriter.writeString(parcel, 2, this.values, false);
        SafeParcelWriter.writeString(parcel, 3, this.valueOf, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.ah$a, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.ag$a, false);
        SafeParcelWriter.writeString(parcel, 6, this.HaptikSDK$b, false);
        SafeParcelWriter.writeString(parcel, 7, this.invoke, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
