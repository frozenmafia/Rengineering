package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwn  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzwn implements zzui {
    private final String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;

    public zzwn(int i) {
        this.zza = i != 1 ? i != 4 ? i != 6 ? i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private zzwn(int i, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4) {
        this.zza = "VERIFY_AND_CHANGE_EMAIL";
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
    }

    public static zzwn zzc(ActionCodeSettings actionCodeSettings, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(actionCodeSettings);
        return new zzwn(7, actionCodeSettings, null, str2, str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzui
    public final String zza() throws JSONException {
        char c;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        int i = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 4;
        } else if (c == 2) {
            i = 6;
        } else if (c == 3) {
            i = 7;
        }
        jSONObject.put("requestType", i);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.ag$a());
            jSONObject.put("canHandleCodeInApp", this.zze.values());
            if (this.zze.HaptikSDK$a() != null) {
                jSONObject.put("continueUrl", this.zze.HaptikSDK$a());
            }
            if (this.zze.invoke() != null) {
                jSONObject.put("iosBundleId", this.zze.invoke());
            }
            if (this.zze.HaptikSDK$c() != null) {
                jSONObject.put("iosAppStoreId", this.zze.HaptikSDK$c());
            }
            if (this.zze.ah$a() != null) {
                jSONObject.put("androidPackageName", this.zze.ah$a());
            }
            if (this.zze.valueOf() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.valueOf());
            }
            if (this.zze.ah$b() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.ah$b());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        return jSONObject.toString();
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzwn zzd(ActionCodeSettings actionCodeSettings) {
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    public final zzwn zze(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzwn zzf(String str) {
        this.zzf = str;
        return this;
    }

    public final zzwn zzg(String str) {
        this.zzd = Preconditions.checkNotEmpty(str);
        return this;
    }
}
