package com.google.android.gms.internal.firebase_messaging;

import java.util.Objects;
/* loaded from: classes5.dex */
final class zzo extends zzn {
    private final zzm zza = new zzm();

    @Override // com.google.android.gms.internal.firebase_messaging.zzn
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.zza.zza(th, true).add(th2);
    }
}
