package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyb  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzyb implements zzuj<zzyb> {
    private static final String zza = "zzyb";
    private String zzb;
    private String zzc;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzyb zza(String str) throws zzpz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
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
