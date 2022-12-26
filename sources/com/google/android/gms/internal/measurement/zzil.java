package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes7.dex */
final class zzil implements Serializable, zzii {
    final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzil(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzil) {
            Object obj2 = this.zza;
            Object obj3 = ((zzil) obj).zza;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.zza;
    }
}
