package com.google.android.gms.internal.p003firebaseauthapi;

import org.apache.http.message.TokenParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzm  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzm extends zzl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(char c) {
    }

    public final String toString() {
        char[] cArr = {TokenParser.ESCAPE, 'u', 0, 0, 0, 0};
        int i = 46;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
