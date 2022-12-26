package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyl  reason: invalid package */
/* loaded from: classes7.dex */
final class zzyl extends zzyo {
    final /* synthetic */ zzyu zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyl(zzyu zzyuVar) {
        this.zza = zzyuVar;
        this.zzc = zzyuVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyq
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
