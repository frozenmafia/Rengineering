package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzky  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzky {
    public static String zza(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i >> 4));
            sb.append("0123456789abcdef".charAt(i & 15));
        }
        return sb.toString();
    }
}
