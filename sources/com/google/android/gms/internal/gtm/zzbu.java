package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
public final class zzbu extends zzan {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbu(zzap zzapVar) {
        super(zzapVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzan
    protected final void zzaw() {
    }

    public final zzv zzfa() {
        zzdb();
        return zzcq().zzau();
    }

    public final String zzfb() {
        zzdb();
        zzv zzfa = zzfa();
        int i = zzfa.zzul;
        int i2 = zzfa.zzum;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
