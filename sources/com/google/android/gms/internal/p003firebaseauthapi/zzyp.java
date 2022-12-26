package com.google.android.gms.internal.p003firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyp  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzyp extends zzys {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyp(byte[] bArr, int i, int i2) {
        super(bArr);
        zzl(0, i2, bArr.length);
        this.zzc = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzys, com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzys
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzys, com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzys, com.google.android.gms.internal.p003firebaseauthapi.zzyu
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzys, com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.zza[i];
    }
}
