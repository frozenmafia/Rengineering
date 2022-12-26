package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxy  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxy implements zzui {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzxy() {
    }

    public static zzxy zzb(String str, String str2, boolean z) {
        zzxy zzxyVar = new zzxy();
        zzxyVar.zzb = Preconditions.checkNotEmpty(str);
        zzxyVar.zzc = Preconditions.checkNotEmpty(str2);
        zzxyVar.zzf = z;
        return zzxyVar;
    }

    public static zzxy zzc(String str, String str2, boolean z) {
        zzxy zzxyVar = new zzxy();
        zzxyVar.zza = Preconditions.checkNotEmpty(str);
        zzxyVar.zzd = Preconditions.checkNotEmpty(str2);
        zzxyVar.zzf = z;
        return zzxyVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}
