package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztu  reason: invalid package */
/* loaded from: classes7.dex */
public class zztu {
    final String zza;
    final zzum zzb;

    public zztu(String str, zzum zzumVar) {
        this.zza = str;
        this.zzb = zzumVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(String str, String str2) {
        String str3 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 5 + str.length() + String.valueOf(str2).length());
        sb.append(str3);
        sb.append(str);
        sb.append("?key=");
        sb.append(str2);
        return sb.toString();
    }
}
