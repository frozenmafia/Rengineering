package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zznd implements Runnable {
    private final /* synthetic */ String zzatf;
    private final /* synthetic */ zzmz zzath;
    private final /* synthetic */ byte[] zzatj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznd(zzmz zzmzVar, String str, byte[] bArr) {
        this.zzath = zzmzVar;
        this.zzatf = str;
        this.zzatj = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzath.zzb(this.zzatf, this.zzatj);
    }
}
