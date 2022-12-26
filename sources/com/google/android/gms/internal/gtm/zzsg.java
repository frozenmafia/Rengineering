package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes7.dex */
final class zzsg implements zzsf {
    @Override // com.google.android.gms.internal.gtm.zzsf
    public final Map<?, ?> zzx(Object obj) {
        return (zzse) obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzsf
    public final zzsd<?, ?> zzac(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.gtm.zzsf
    public final Map<?, ?> zzy(Object obj) {
        return (zzse) obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzsf
    public final boolean zzz(Object obj) {
        return !((zzse) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.gtm.zzsf
    public final Object zzaa(Object obj) {
        ((zzse) obj).zzmi();
        return obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzsf
    public final Object zzab(Object obj) {
        return zzse.zzqf().zzqg();
    }

    @Override // com.google.android.gms.internal.gtm.zzsf
    public final Object zzc(Object obj, Object obj2) {
        zzse zzseVar = (zzse) obj;
        zzse zzseVar2 = (zzse) obj2;
        if (!zzseVar2.isEmpty()) {
            if (!zzseVar.isMutable()) {
                zzseVar = zzseVar.zzqg();
            }
            zzseVar.zza(zzseVar2);
        }
        return zzseVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzsf
    public final int zzb(int i, Object obj, Object obj2) {
        zzse zzseVar = (zzse) obj;
        if (zzseVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzseVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
