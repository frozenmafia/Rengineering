package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacd  reason: invalid package */
/* loaded from: classes7.dex */
final class zzacd implements Iterator<String> {
    final Iterator<String> zza;
    final /* synthetic */ zzace zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacd(zzace zzaceVar) {
        zzaaj zzaajVar;
        this.zzb = zzaceVar;
        zzaajVar = zzaceVar.zza;
        this.zza = zzaajVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
