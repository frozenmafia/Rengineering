package com.google.android.gms.internal.p003firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbf  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzbf<P> {
    private final ConcurrentMap<zzbe, List<zzbd<P>>> zza = new ConcurrentHashMap();
    private zzbd<P> zzb;
    private final Class<P> zzc;

    private zzbf(Class<P> cls) {
        this.zzc = cls;
    }

    public static <P> zzbf<P> zzb(Class<P> cls) {
        return new zzbf<>(cls);
    }

    public final zzbd<P> zza(P p, zziq zziqVar) throws GeneralSecurityException {
        byte[] array;
        if (zziqVar.zzc() != zzig.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzjk zzjkVar = zzjk.UNKNOWN_PREFIX;
        int ordinal = zziqVar.zzf().ordinal();
        if (ordinal == 1) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zziqVar.zza()).array();
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = zzaj.zza;
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zziqVar.zza()).array();
        }
        zzbd<P> zzbdVar = new zzbd<>(p, array, zziqVar.zzc(), zziqVar.zzf(), zziqVar.zza());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzbdVar);
        zzbe zzbeVar = new zzbe(zzbdVar.zzd(), null);
        List<zzbd<P>> put = this.zza.put(zzbeVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzbdVar);
            this.zza.put(zzbeVar, Collections.unmodifiableList(arrayList2));
        }
        return zzbdVar;
    }

    public final Class<P> zzc() {
        return this.zzc;
    }

    public final List<zzbd<P>> zzd(byte[] bArr) {
        List<zzbd<P>> list = this.zza.get(new zzbe(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final void zze(zzbd<P> zzbdVar) {
        if (zzbdVar.zza() != zzig.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        if (zzd(zzbdVar.zzd()).isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.zzb = zzbdVar;
    }
}
