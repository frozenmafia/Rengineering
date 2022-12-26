package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxm  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxm implements zzui {
    private final String zza = Preconditions.checkNotEmpty(HintConstants.AUTOFILL_HINT_PHONE);
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private zzvs zzh;

    private zzxm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = Preconditions.checkNotEmpty(str3);
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public static zzxm zzb(String str, String str2, String str3, String str4, String str5, String str6) {
        Preconditions.checkNotEmpty(str3);
        return new zzxm(HintConstants.AUTOFILL_HINT_PHONE, str, str2, str3, str4, str5, str6);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("safetyNetToken", this.zzg);
            }
            zzvs zzvsVar = this.zzh;
            if (zzvsVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzvsVar.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzvs zzvsVar) {
        this.zzh = zzvsVar;
    }
}
