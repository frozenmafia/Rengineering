package com.google.android.gms.internal.p003firebaseauthapi;

import androidx.databinding.library.baseAdapters.BR;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaca  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzaca {
    private static final zzaca zza = new zzaca(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaca() {
        this(0, new int[8], new Object[8], true);
    }

    private zzaca(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzaca zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaca zzd(zzaca zzacaVar, zzaca zzacaVar2) {
        int i = zzacaVar.zzb + zzacaVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzacaVar.zzc, i);
        System.arraycopy(zzacaVar2.zzc, 0, copyOf, zzacaVar.zzb, zzacaVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzacaVar.zzd, i);
        System.arraycopy(zzacaVar2.zzd, 0, copyOf2, zzacaVar.zzb, zzacaVar2.zzb);
        return new zzaca(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaca zze() {
        return new zzaca(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzaca)) {
            zzaca zzacaVar = (zzaca) obj;
            int i = this.zzb;
            if (i == zzacaVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzacaVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzacaVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int[] iArr = this.zzc;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        Object[] objArr = this.zzd;
        int i5 = this.zzb;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return ((((i + BR.userTeamVM) * 31) + i3) * 31) + i2;
    }

    public final int zza() {
        int zzE;
        int zzF;
        int i;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.zzd[i4]).longValue();
                        i = zzze.zzE(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int zzE2 = zzze.zzE(i6 << 3);
                        int zzd = ((zzyu) this.zzd[i4]).zzd();
                        i3 += zzE2 + zzze.zzE(zzd) + zzd;
                    } else if (i7 == 3) {
                        int zzD = zzze.zzD(i6);
                        zzE = zzD + zzD;
                        zzF = ((zzaca) this.zzd[i4]).zza();
                    } else if (i7 == 5) {
                        ((Integer) this.zzd[i4]).intValue();
                        i = zzze.zzE(i6 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzaae.zza());
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.zzd[i4]).longValue();
                    zzE = zzze.zzE(i6 << 3);
                    zzF = zzze.zzF(longValue);
                }
                i = zzE + zzF;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = this.zzc[i3];
                int zzE = zzze.zzE(8);
                int zzd = ((zzyu) this.zzd[i3]).zzd();
                i2 += zzE + zzE + zzze.zzE(16) + zzze.zzE(i4 >>> 3) + zzze.zzE(24) + zzze.zzE(zzd) + zzd;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final void zzf() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzabb.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(int i, Object obj) {
        if (this.zzf) {
            int i2 = this.zzb;
            int[] iArr = this.zzc;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.zzc = Arrays.copyOf(iArr, i3);
                this.zzd = Arrays.copyOf(this.zzd, i3);
            }
            int[] iArr2 = this.zzc;
            int i4 = this.zzb;
            iArr2[i4] = i;
            this.zzd[i4] = obj;
            this.zzb = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zzzf zzzfVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzzfVar.zzt(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzzfVar.zzm(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzzfVar.zzd(i3, (zzyu) obj);
                } else if (i4 == 3) {
                    zzzfVar.zzE(i3);
                    ((zzaca) obj).zzi(zzzfVar);
                    zzzfVar.zzh(i3);
                } else if (i4 == 5) {
                    zzzfVar.zzk(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzaae.zza());
                }
            }
        }
    }
}
