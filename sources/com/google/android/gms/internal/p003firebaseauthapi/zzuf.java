package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuf  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzuf extends zzpv implements Api.ApiOptions.HasOptions {
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzuf(String str, zzud zzudVar) {
        this.zzb = Preconditions.checkNotEmpty(str, "A valid API key must be provided");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuf) {
            zzuf zzufVar = (zzuf) obj;
            return Objects.equal(this.zzb, zzufVar.zzb) && this.zza == zzufVar.zza;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb) + (1 ^ (this.zza ? 1 : 0));
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzpv
    /* renamed from: zzb */
    public final zzuf zza() {
        return new zzuf(Preconditions.checkNotEmpty(this.zzb), null);
    }

    public final String zzc() {
        return this.zzb;
    }
}
