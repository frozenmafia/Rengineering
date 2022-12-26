package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdr  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdr {
    private final zzag zza;
    private final zzak zzb;

    public zzdr(zzag zzagVar) {
        this.zza = zzagVar;
        this.zzb = null;
    }

    public zzdr(zzak zzakVar) {
        this.zza = null;
        this.zzb = zzakVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzag zzagVar = this.zza;
        if (zzagVar != null) {
            return zzagVar.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
