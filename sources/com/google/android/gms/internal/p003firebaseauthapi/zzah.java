package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzah  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzah implements zzay {
    private final OutputStream zza;

    private zzah(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzay zza(OutputStream outputStream) {
        return new zzah(outputStream);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzay
    public final void zzb(zzho zzhoVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzay
    public final void zzc(zzir zzirVar) throws IOException {
        try {
            zzirVar.zzq(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
