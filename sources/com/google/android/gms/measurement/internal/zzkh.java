package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class zzkh extends zzkg {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkh(zzkt zzktVar) {
        super(zzktVar);
        this.zzf.zzM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzf.zzH();
        this.zza = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzY() {
        return this.zza;
    }

    protected abstract boolean zzb();
}
