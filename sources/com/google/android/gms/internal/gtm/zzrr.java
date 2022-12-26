package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
public class zzrr {
    private static final zzqp zzavr = zzqp.zzoq();
    private zzps zzbcb;
    private volatile zzsk zzbcc;
    private volatile zzps zzbcd;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrr) {
            zzrr zzrrVar = (zzrr) obj;
            zzsk zzskVar = this.zzbcc;
            zzsk zzskVar2 = zzrrVar.zzbcc;
            if (zzskVar == null && zzskVar2 == null) {
                return zzmv().equals(zzrrVar.zzmv());
            }
            if (zzskVar == null || zzskVar2 == null) {
                if (zzskVar != null) {
                    return zzskVar.equals(zzrrVar.zzh(zzskVar.zzpi()));
                }
                return zzh(zzskVar2.zzpi()).equals(zzskVar2);
            }
            return zzskVar.equals(zzskVar2);
        }
        return false;
    }

    private final zzsk zzh(zzsk zzskVar) {
        if (this.zzbcc == null) {
            synchronized (this) {
                if (this.zzbcc == null) {
                    try {
                        this.zzbcc = zzskVar;
                        this.zzbcd = zzps.zzavx;
                    } catch (zzrk unused) {
                        this.zzbcc = zzskVar;
                        this.zzbcd = zzps.zzavx;
                    }
                }
            }
        }
        return this.zzbcc;
    }

    public final zzsk zzi(zzsk zzskVar) {
        zzsk zzskVar2 = this.zzbcc;
        this.zzbcb = null;
        this.zzbcd = null;
        this.zzbcc = zzskVar;
        return zzskVar2;
    }

    public final int zzpe() {
        if (this.zzbcd != null) {
            return this.zzbcd.size();
        }
        if (this.zzbcc != null) {
            return this.zzbcc.zzpe();
        }
        return 0;
    }

    public final zzps zzmv() {
        if (this.zzbcd != null) {
            return this.zzbcd;
        }
        synchronized (this) {
            if (this.zzbcd != null) {
                return this.zzbcd;
            }
            if (this.zzbcc == null) {
                this.zzbcd = zzps.zzavx;
            } else {
                this.zzbcd = this.zzbcc.zzmv();
            }
            return this.zzbcd;
        }
    }
}
