package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvx  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvx implements zzui {
    private final String zza;

    public zzvx(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
