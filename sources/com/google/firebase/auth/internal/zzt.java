package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p003firebaseauthapi.zzll;
import com.google.android.gms.internal.p003firebaseauthapi.zzwj;
import com.google.android.gms.internal.p003firebaseauthapi.zzww;
import o.getStackFromEnd;
import o.updateActionForInterimTarget;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class zzt extends AbstractSafeParcelable implements getStackFromEnd {
    public static final Parcelable.Creator<zzt> CREATOR = new updateActionForInterimTarget();
    private final boolean HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String ag$a;
    private Uri ah$a;
    private final String ah$b;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private String values;

    public zzt(zzwj zzwjVar, String str) {
        Preconditions.checkNotNull(zzwjVar);
        Preconditions.checkNotEmpty("firebase");
        this.ag$a = Preconditions.checkNotEmpty(zzwjVar.zzo());
        this.valueOf = "firebase";
        this.invoke = zzwjVar.zzn();
        this.toString = zzwjVar.zzm();
        Uri zzc = zzwjVar.zzc();
        if (zzc != null) {
            this.values = zzc.toString();
            this.ah$a = zzc;
        }
        this.HaptikSDK$a = zzwjVar.zzs();
        this.HaptikSDK$b = null;
        this.ah$b = zzwjVar.zzp();
    }

    public final String ah$a() {
        return this.ag$a;
    }

    @Override // o.getStackFromEnd
    public final String getInitSettings() {
        return this.valueOf;
    }

    public final String valueOf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.ag$a);
            jSONObject.putOpt("providerId", this.valueOf);
            jSONObject.putOpt("displayName", this.toString);
            jSONObject.putOpt("photoUrl", this.values);
            jSONObject.putOpt("email", this.invoke);
            jSONObject.putOpt(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.ah$b);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.HaptikSDK$a));
            jSONObject.putOpt("rawUserInfo", this.HaptikSDK$b);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzll(e);
        }
    }

    public final String values() {
        return this.HaptikSDK$b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.ag$a, false);
        SafeParcelWriter.writeString(parcel, 2, this.valueOf, false);
        SafeParcelWriter.writeString(parcel, 3, this.toString, false);
        SafeParcelWriter.writeString(parcel, 4, this.values, false);
        SafeParcelWriter.writeString(parcel, 5, this.invoke, false);
        SafeParcelWriter.writeString(parcel, 6, this.ah$b, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.HaptikSDK$a);
        SafeParcelWriter.writeString(parcel, 8, this.HaptikSDK$b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzt(zzww zzwwVar) {
        Preconditions.checkNotNull(zzwwVar);
        this.ag$a = zzwwVar.zzd();
        this.valueOf = Preconditions.checkNotEmpty(zzwwVar.zzf());
        this.toString = zzwwVar.zzb();
        Uri zza = zzwwVar.zza();
        if (zza != null) {
            this.values = zza.toString();
            this.ah$a = zza;
        }
        this.invoke = zzwwVar.zzc();
        this.ah$b = zzwwVar.zze();
        this.HaptikSDK$a = false;
        this.HaptikSDK$b = zzwwVar.zzg();
    }

    public zzt(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.ag$a = str;
        this.valueOf = str2;
        this.invoke = str3;
        this.ah$b = str4;
        this.toString = str5;
        this.values = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.ah$a = Uri.parse(this.values);
        }
        this.HaptikSDK$a = z;
        this.HaptikSDK$b = str7;
    }
}
