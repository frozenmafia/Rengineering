package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvz  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvz implements zzuj<zzvz> {
    private static final String zza = "zzvz";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;
    private long zzg;
    private List<zzwu> zzh;
    private String zzi;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzvz zza(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("localId", null);
            this.zzc = jSONObject.optString("email", null);
            this.zzd = jSONObject.optString("idToken", null);
            this.zze = jSONObject.optString("refreshToken", null);
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = jSONObject.optLong("expiresIn", 0L);
            this.zzh = zzwu.zzf(jSONObject.optJSONArray("mfaInfo"));
            this.zzi = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzyc.zza(e, zza, str);
        }
    }

    public final long zzb() {
        return this.zzg;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zze;
    }

    public final List<zzwu> zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return !TextUtils.isEmpty(this.zzi);
    }

    public final boolean zzh() {
        return this.zzf;
    }
}
