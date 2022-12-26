package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.EmailAuthCredential;
import o.findOneVisibleChild;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvy implements zzui {
    private static final String zza = "zzvy";
    private static final Logger zzb = new Logger(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzvy(EmailAuthCredential emailAuthCredential, String str) {
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.HaptikSDK$b());
        this.zzd = Preconditions.checkNotEmpty(emailAuthCredential.HaptikSDK$c());
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        findOneVisibleChild valueOf = findOneVisibleChild.valueOf(this.zzd);
        String ah$a = valueOf != null ? valueOf.ah$a() : null;
        String values = valueOf != null ? valueOf.values() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (ah$a != null) {
            jSONObject.put("oobCode", ah$a);
        }
        if (values != null) {
            jSONObject.put("tenantId", values);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        return jSONObject.toString();
    }
}
