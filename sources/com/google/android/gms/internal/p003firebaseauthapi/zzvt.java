package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvt  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvt implements zzuj<zzvt> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzvt";
    private String zzb;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzvt zza(String str) throws zzpz {
        zzb(str);
        return this;
    }

    public final zzvt zzb(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            String str2 = zza;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(message).length());
            sb.append("Failed to parse error for string [");
            sb.append(str);
            sb.append("] with exception: ");
            sb.append(message);
            Log.e(str2, sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 35);
            sb2.append("Failed to parse error for string [");
            sb2.append(str);
            sb2.append("]");
            throw new zzpz(sb2.toString(), e);
        }
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
