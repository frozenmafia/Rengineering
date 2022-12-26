package com.google.android.gms.internal.p003firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxl  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxl implements zzuj<zzxl> {
    private static final String zza = "zzxl";
    private String zzb;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzxl zza(String str) throws zzpz {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzaf.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzyc.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
