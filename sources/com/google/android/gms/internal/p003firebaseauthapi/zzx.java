package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzx {
    private static final Logger zza = Logger.getLogger(zzx.class.getName());
    private static final zzw zzb = new zzw(null);

    private zzx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzs zza(String str) {
        return new zzu(Pattern.compile("[.-]"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(String str) {
        return str == null || str.isEmpty();
    }
}
