package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwf  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzwf implements zzui {
    private final String zza = zzwe.REFRESH_TOKEN.toString();
    private final String zzb;

    public zzwf(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
