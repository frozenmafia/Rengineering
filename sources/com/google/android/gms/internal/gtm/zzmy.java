package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
public final class zzmy {
    private final zznm zzaov;
    private final byte[] zzatb;
    private final long zzatc;
    private final zzmk zzatd;

    public zzmy(zznm zznmVar) {
        this(null, null, zznmVar, 0L);
    }

    public zzmy(zzmk zzmkVar, byte[] bArr, zznm zznmVar, long j) {
        this.zzatd = zzmkVar;
        this.zzatb = bArr;
        this.zzaov = zznmVar;
        this.zzatc = j;
    }

    public final byte[] zzlo() {
        return this.zzatb;
    }

    public final zzmk zzlp() {
        return this.zzatd;
    }

    public final zznm zzlq() {
        return this.zzaov;
    }

    public final long zzlr() {
        return this.zzatc;
    }
}
