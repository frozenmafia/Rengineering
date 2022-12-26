package com.google.android.gms.internal.p003firebaseauthapi;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxw  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxw implements zzui {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzxw(String str, String str2, String str3) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put(HintConstants.AUTOFILL_HINT_PASSWORD, this.zzb);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
