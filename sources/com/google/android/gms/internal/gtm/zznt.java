package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes7.dex */
public final class zznt {
    private final List<zzno> zzatu = new ArrayList();
    private final List<zzno> zzatv = new ArrayList();
    private final List<zzno> zzatw = new ArrayList();
    private final List<zzno> zzatx = new ArrayList();

    public final zznt zzc(zzno zznoVar) {
        this.zzatu.add(zznoVar);
        return this;
    }

    public final zznt zzd(zzno zznoVar) {
        this.zzatv.add(zznoVar);
        return this;
    }

    public final zznt zze(zzno zznoVar) {
        this.zzatw.add(zznoVar);
        return this;
    }

    public final zznt zzf(zzno zznoVar) {
        this.zzatx.add(zznoVar);
        return this;
    }

    public final zznr zzma() {
        return new zznr(this.zzatu, this.zzatv, this.zzatw, this.zzatx);
    }
}
