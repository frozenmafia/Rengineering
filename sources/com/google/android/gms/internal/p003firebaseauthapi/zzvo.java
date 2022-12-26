package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvo  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvo {
    public static String zza(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (invoke != null && String.class.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
