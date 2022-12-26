package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxj implements zzuj<zzxj> {
    private static final String zza = "zzxj";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private long zzf;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzxj zza(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("displayName", null));
            this.zzd = Strings.emptyToNull(jSONObject.optString("email", null));
            this.zze = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzyc.zza(e, zza, str);
        }
    }

    public final long zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zze;
    }
}
