package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zznb implements Runnable {
    private final /* synthetic */ String zzatf;
    private final /* synthetic */ zzmn zzatg;
    private final /* synthetic */ zzmz zzath;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznb(zzmz zzmzVar, String str, zzmn zzmnVar) {
        this.zzath = zzmzVar;
        this.zzatf = str;
        this.zzatg = zzmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzath.zzb(this.zzatf, this.zzatg);
    }
}
