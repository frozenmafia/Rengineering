package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzbz<V> {
    private final V zzaar;
    private final GservicesValue<V> zzaas;

    private zzbz(GservicesValue<V> gservicesValue, V v) {
        Preconditions.checkNotNull(gservicesValue);
        this.zzaas = gservicesValue;
        this.zzaar = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbz<Boolean> zza(String str, boolean z, boolean z2) {
        return new zzbz<>(GservicesValue.value(str, z2), Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbz<String> zza(String str, String str2, String str3) {
        return new zzbz<>(GservicesValue.value(str, str3), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbz<Long> zza(String str, long j, long j2) {
        return new zzbz<>(GservicesValue.value(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbz<Integer> zza(String str, int i, int i2) {
        return new zzbz<>(GservicesValue.value(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbz<Float> zza(String str, float f, float f2) {
        Float valueOf = Float.valueOf(0.5f);
        return new zzbz<>(GservicesValue.value(str, valueOf), valueOf);
    }

    public final V get() {
        return this.zzaar;
    }
}
