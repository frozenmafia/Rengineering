package com.google.android.gms.internal.p003firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwd  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzwd implements zzuj<zzwd> {
    private static final String zza = "zzwd";
    private String zzb;
    private String zzc;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzwd zza(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("idToken", null);
            this.zzc = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzyc.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
