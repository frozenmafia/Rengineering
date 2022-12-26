package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zznc implements Runnable {
    private final /* synthetic */ String zzatf;
    private final /* synthetic */ zzmn zzatg;
    private final /* synthetic */ zzmz zzath;
    private final /* synthetic */ String zzati;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznc(zzmz zzmzVar, String str, String str2, zzmn zzmnVar) {
        this.zzath = zzmzVar;
        this.zzatf = str;
        this.zzati = str2;
        this.zzatg = zzmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzath.zzb(this.zzatf, this.zzati, this.zzatg);
    }
}
