package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaq  reason: invalid package */
/* loaded from: classes7.dex */
final class zzaaq implements zzaax {
    private final zzaax[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaq(zzaax... zzaaxVarArr) {
        this.zza = zzaaxVarArr;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaax
    public final zzaaw zzb(Class<?> cls) {
        zzaax[] zzaaxVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzaax zzaaxVar = zzaaxVarArr[i];
            if (zzaaxVar.zzc(cls)) {
                return zzaaxVar.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaax
    public final boolean zzc(Class<?> cls) {
        zzaax[] zzaaxVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzaaxVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
