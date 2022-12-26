package com.google.android.gms.internal.gtm;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class zztr<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b2, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b2, int i, zzps zzpsVar);

    abstract void zza(B b2, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzum zzumVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzsy zzsyVar);

    abstract T zzaa(B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzad(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzag(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzah(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzai(T t);

    abstract void zzb(B b2, int i, long j);

    abstract void zzc(B b2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t, zzum zzumVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzg(Object obj, B b2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzh(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzri();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzt(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b2, zzsy zzsyVar) throws IOException {
        int tag = zzsyVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zztr<T, B>) b2, i, zzsyVar.zznk());
            return true;
        } else if (i2 == 1) {
            zzb(b2, i, zzsyVar.zznm());
            return true;
        } else if (i2 == 2) {
            zza((zztr<T, B>) b2, i, zzsyVar.zznq());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b2, i, zzsyVar.zznn());
                    return true;
                }
                throw zzrk.zzpt();
            }
            return false;
        } else {
            B zzri = zzri();
            while (zzsyVar.zzog() != Integer.MAX_VALUE && zza((zztr<T, B>) zzri, zzsyVar)) {
            }
            if ((4 | (i << 3)) != zzsyVar.getTag()) {
                throw zzrk.zzps();
            }
            zza((zztr<T, B>) b2, i, (int) zzaa(zzri));
            return true;
        }
    }
}
