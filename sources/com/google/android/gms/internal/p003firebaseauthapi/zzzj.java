package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzzj {
    static final zzzj zza = new zzzj(true);
    private static volatile boolean zzb = false;
    private static volatile zzzj zzc;
    private final Map<zzzi, zzzu<?, ?>> zzd;

    zzzj() {
        this.zzd = new HashMap();
    }

    public static zzzj zza() {
        zzzj zzzjVar = zzc;
        if (zzzjVar == null) {
            synchronized (zzzj.class) {
                zzzjVar = zzc;
                if (zzzjVar == null) {
                    zzzjVar = zza;
                    zzc = zzzjVar;
                }
            }
        }
        return zzzjVar;
    }

    public final <ContainingType extends zzaaz> zzzu<ContainingType, ?> zzb(ContainingType containingtype, int i) {
        return (zzzu<ContainingType, ?>) this.zzd.get(new zzzi(containingtype, i));
    }

    zzzj(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
