package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzi  reason: invalid package */
/* loaded from: classes7.dex */
final class zzzi {
    private final Object zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzi(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzzi) {
            zzzi zzziVar = (zzzi) obj;
            return this.zza == zzziVar.zza && this.zzb == zzziVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
