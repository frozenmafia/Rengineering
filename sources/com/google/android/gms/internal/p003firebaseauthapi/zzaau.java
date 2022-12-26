package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaau  reason: invalid package */
/* loaded from: classes7.dex */
final class zzaau {
    public static final int zza(int i, Object obj, Object obj2) {
        zzaat zzaatVar = (zzaat) obj;
        zzaas zzaasVar = (zzaas) obj2;
        if (zzaatVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzaatVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        return !((zzaat) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzaat zzaatVar = (zzaat) obj;
        zzaat zzaatVar2 = (zzaat) obj2;
        if (!zzaatVar2.isEmpty()) {
            if (!zzaatVar.zze()) {
                zzaatVar = zzaatVar.zzb();
            }
            zzaatVar.zzd(zzaatVar2);
        }
        return zzaatVar;
    }
}
