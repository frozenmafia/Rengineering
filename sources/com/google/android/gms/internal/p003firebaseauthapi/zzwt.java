package com.google.android.gms.internal.p003firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwt  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzwt {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;

    public static zzwt zza(String str) throws UnsupportedEncodingException {
        try {
            zzwt zzwtVar = new zzwt();
            JSONObject jSONObject = new JSONObject(str);
            zzwtVar.zza = jSONObject.optString("iss");
            zzwtVar.zzb = jSONObject.optString("aud");
            zzwtVar.zzc = jSONObject.optString("sub");
            zzwtVar.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzwtVar.zze = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzwtVar;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("Failed to read JwtToken from JSONObject. ");
                sb.append(valueOf);
                Log.d("JwtToken", sb.toString());
            }
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb2.append("Failed to read JwtToken from JSONObject. ");
            sb2.append(valueOf2);
            throw new UnsupportedEncodingException(sb2.toString());
        }
    }

    public final Long zzb() {
        return this.zze;
    }

    public final Long zzc() {
        return this.zzd;
    }
}
