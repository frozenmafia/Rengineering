package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxk  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxk implements zzui {
    private final String zza;
    private final String zzb = Preconditions.checkNotEmpty(HintConstants.AUTOFILL_HINT_PHONE);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzvs zzg;

    private zzxk(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    public static zzxk zzb(String str, String str2, String str3, String str4, String str5) {
        Preconditions.checkNotEmpty(str2);
        return new zzxk(str, HintConstants.AUTOFILL_HINT_PHONE, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        this.zzb.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zzc != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zzc);
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("recaptchaToken", this.zze);
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("safetyNetToken", this.zzf);
            }
            zzvs zzvsVar = this.zzg;
            if (zzvsVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzvsVar.zza());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzvs zzvsVar) {
        this.zzg = zzvsVar;
    }
}
