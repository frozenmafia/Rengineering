package com.google.android.gms.internal.gtm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;
/* loaded from: classes7.dex */
final class zzpi extends WeakReference<Throwable> {
    private final int zzavn;

    public zzpi(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.zzavn = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zzavn;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzpi zzpiVar = (zzpi) obj;
        return this.zzavn == zzpiVar.zzavn && get() == zzpiVar.get();
    }
}
