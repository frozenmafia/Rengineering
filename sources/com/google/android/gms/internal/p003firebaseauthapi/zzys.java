package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzys  reason: invalid package */
/* loaded from: classes7.dex */
public class zzys extends zzyr {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzys(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzyu) && zzd() == ((zzyu) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzys) {
                zzys zzysVar = (zzys) obj;
                int zzm = zzm();
                int zzm2 = zzysVar.zzm();
                if (zzm == 0 || zzm2 == 0 || zzm == zzm2) {
                    int zzd = zzd();
                    if (zzd > zzysVar.zzd()) {
                        int zzd2 = zzd();
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("Length too large: ");
                        sb.append(zzd);
                        sb.append(zzd2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (zzd > zzysVar.zzd()) {
                        int zzd3 = zzysVar.zzd();
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Ran off end of other: 0, ");
                        sb2.append(zzd);
                        sb2.append(", ");
                        sb2.append(zzd3);
                        throw new IllegalArgumentException(sb2.toString());
                    } else if (zzysVar instanceof zzys) {
                        byte[] bArr = this.zza;
                        byte[] bArr2 = zzysVar.zza;
                        zzysVar.zzc();
                        int i = 0;
                        int i2 = 0;
                        while (i < zzd) {
                            if (bArr[i] != bArr2[i2]) {
                                return false;
                            }
                            i++;
                            i2++;
                        }
                        return true;
                    } else {
                        return zzysVar.zzg(0, zzd).equals(zzg(0, zzd));
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public byte zza(int i) {
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    protected final int zzf(int i, int i2, int i3) {
        return zzaac.zzd(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final zzyu zzg(int i, int i2) {
        int zzl = zzl(0, i2, zzd());
        return zzl == 0 ? zzyu.zzb : new zzyp(this.zza, 0, zzl);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final zzyx zzh() {
        return zzyx.zzu(this.zza, 0, zzd(), true);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    protected final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final void zzj(zzyk zzykVar) throws IOException {
        zzykVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyu
    public final boolean zzk() {
        return zzaco.zzf(this.zza, 0, zzd());
    }
}
