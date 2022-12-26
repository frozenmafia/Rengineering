package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwe  reason: invalid package */
/* loaded from: classes7.dex */
public enum zzwe {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");
    
    private final String zzd;

    zzwe(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
