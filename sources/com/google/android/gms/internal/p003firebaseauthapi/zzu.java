package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzu  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzu extends zzs implements Serializable {
    private final Pattern zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzs
    public final zzr zza(CharSequence charSequence) {
        return new zzt(this.zza.matcher(charSequence));
    }
}
