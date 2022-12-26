package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlh  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzlh {
    public static int zza() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static boolean zzb() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
