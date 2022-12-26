package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaah  reason: invalid package */
/* loaded from: classes7.dex */
public class zzaah {
    private static final zzzj zzb = zzzj.zza();
    protected volatile zzaaz zza;
    private volatile zzyu zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaah) {
            zzaah zzaahVar = (zzaah) obj;
            zzaaz zzaazVar = this.zza;
            zzaaz zzaazVar2 = zzaahVar.zza;
            if (zzaazVar == null && zzaazVar2 == null) {
                return zzb().equals(zzaahVar.zzb());
            }
            if (zzaazVar == null || zzaazVar2 == null) {
                if (zzaazVar != null) {
                    zzaahVar.zzc(zzaazVar.zzI());
                    return zzaazVar.equals(zzaahVar.zza);
                }
                zzc(zzaazVar2.zzI());
                return this.zza.equals(zzaazVar2);
            }
            return zzaazVar.equals(zzaazVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzys) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzs();
        }
        return 0;
    }

    public final zzyu zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzyu.zzb;
            } else {
                this.zzc = this.zza.zzo();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzaaz zzaazVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzaazVar;
                    this.zzc = zzyu.zzb;
                } catch (zzaae unused) {
                    this.zza = zzaazVar;
                    this.zzc = zzyu.zzb;
                }
            }
        }
    }
}
