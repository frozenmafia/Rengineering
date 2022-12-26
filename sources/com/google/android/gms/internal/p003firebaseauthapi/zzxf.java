package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzxf implements zzuj<zzxf> {
    private static final String zza = "zzxf";
    private String zzb;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuj
    public final /* synthetic */ zzxf zza(String str) throws zzpz {
        try {
            this.zzb = Strings.emptyToNull(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzyc.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
