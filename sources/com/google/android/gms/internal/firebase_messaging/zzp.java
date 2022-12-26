package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;
/* loaded from: classes5.dex */
final class zzp extends WeakReference<Throwable> {
    private final int zza;

    public zzp(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.zza = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzp zzpVar = (zzp) obj;
        return this.zza == zzpVar.zza && get() == zzpVar.get();
    }
}
