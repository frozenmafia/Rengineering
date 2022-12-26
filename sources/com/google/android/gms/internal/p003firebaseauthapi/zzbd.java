package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzbd<P> {
    private final P zza;
    private final byte[] zzb;
    private final zzig zzc;
    private final zzjk zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbd(P p, byte[] bArr, zzig zzigVar, zzjk zzjkVar, int i) {
        this.zza = p;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = zzigVar;
        this.zzd = zzjkVar;
    }

    public final zzig zza() {
        return this.zzc;
    }

    public final zzjk zzb() {
        return this.zzd;
    }

    public final P zzc() {
        return this.zza;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
