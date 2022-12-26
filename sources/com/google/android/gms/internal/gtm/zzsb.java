package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
final class zzsb implements zzsj {
    private zzsj[] zzbco;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsb(zzsj... zzsjVarArr) {
        this.zzbco = zzsjVarArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj
    public final boolean zze(Class<?> cls) {
        for (zzsj zzsjVar : this.zzbco) {
            if (zzsjVar.zze(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj
    public final zzsi zzf(Class<?> cls) {
        zzsj[] zzsjVarArr;
        for (zzsj zzsjVar : this.zzbco) {
            if (zzsjVar.zze(cls)) {
                return zzsjVar.zzf(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
