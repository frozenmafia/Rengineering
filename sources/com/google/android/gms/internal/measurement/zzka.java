package com.google.android.gms.internal.measurement;
/* loaded from: classes7.dex */
final class zzka implements zzlk {
    private static final zzka zza = new zzka();

    private zzka() {
    }

    public static zzka zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final zzlj zzb(Class cls) {
        if (!zzkf.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzlj) zzkf.zzbz(cls.asSubclass(zzkf.class)).zzl(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final boolean zzc(Class cls) {
        return zzkf.class.isAssignableFrom(cls);
    }
}
