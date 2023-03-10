package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
/* loaded from: classes5.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.zza = Preconditions.checkNotEmpty(str);
    }

    public String getErrorCode() {
        return this.zza;
    }
}
