package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz  reason: invalid package */
/* loaded from: classes7.dex */
public abstract class zzabz<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zze(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzf();

    abstract T zzg(B b2);

    abstract void zzh(B b2, int i, int i2);

    abstract void zzi(B b2, int i, long j);

    abstract void zzj(B b2, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(B b2, int i, zzyu zzyuVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(B b2, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzp(B b2, zzabk zzabkVar) throws IOException {
        int zzd = zzabkVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(b2, i, zzabkVar.zzl());
            return true;
        } else if (i2 == 1) {
            zzi(b2, i, zzabkVar.zzk());
            return true;
        } else if (i2 == 2) {
            zzk(b2, i, zzabkVar.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzh(b2, i, zzabkVar.zzf());
                    return true;
                }
                throw zzaae.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            while (zzabkVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzabkVar)) {
            }
            if ((4 | (i << 3)) != zzabkVar.zzd()) {
                throw zzaae.zzb();
            }
            zzg(zzf);
            zzj(b2, i, zzf);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzq(zzabk zzabkVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzr(T t, zzzf zzzfVar) throws IOException;
}
