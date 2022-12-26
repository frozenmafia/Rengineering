package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxn  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxn implements zzuj<zzxn> {
    private static final String zza = "zzxn";
    private String zzb;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzxn zza(String str) throws zzpz {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = Strings.emptyToNull(optJSONObject.optString("sessionInfo"));
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
