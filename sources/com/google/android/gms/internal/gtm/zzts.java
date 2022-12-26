package com.google.android.gms.internal.gtm;

import androidx.databinding.library.baseAdapters.BR;
import com.google.android.gms.internal.gtm.zzrc;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes7.dex */
public final class zzts {
    private static final zzts zzbem = new zzts(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzavs;
    private int zzbal;
    private Object[] zzbcz;
    private int[] zzben;

    public static zzts zzrj() {
        return zzbem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzts zzrk() {
        return new zzts();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzts zza(zzts zztsVar, zzts zztsVar2) {
        int i = zztsVar.count + zztsVar2.count;
        int[] copyOf = Arrays.copyOf(zztsVar.zzben, i);
        System.arraycopy(zztsVar2.zzben, 0, copyOf, zztsVar.count, zztsVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zztsVar.zzbcz, i);
        System.arraycopy(zztsVar2.zzbcz, 0, copyOf2, zztsVar.count, zztsVar2.count);
        return new zzts(i, copyOf, copyOf2, true);
    }

    private zzts() {
        this(0, new int[8], new Object[8], true);
    }

    private zzts(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzbal = -1;
        this.count = i;
        this.zzben = iArr;
        this.zzbcz = objArr;
        this.zzavs = z;
    }

    public final void zzmi() {
        this.zzavs = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzum zzumVar) throws IOException {
        if (zzumVar.zzol() == zzrc.zze.zzbbd) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzumVar.zza(this.zzben[i] >>> 3, this.zzbcz[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzumVar.zza(this.zzben[i2] >>> 3, this.zzbcz[i2]);
        }
    }

    public final void zzb(zzum zzumVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzumVar.zzol() == zzrc.zze.zzbbc) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzben[i], this.zzbcz[i], zzumVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzben[i2], this.zzbcz[i2], zzumVar);
        }
    }

    private static void zzb(int i, Object obj, zzum zzumVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzumVar.zzi(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzumVar.zzc(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzumVar.zza(i2, (zzps) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzumVar.zzh(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzrk.zzpt());
        } else if (zzumVar.zzol() == zzrc.zze.zzbbc) {
            zzumVar.zzbk(i2);
            ((zzts) obj).zzb(zzumVar);
            zzumVar.zzbl(i2);
        } else {
            zzumVar.zzbl(i2);
            ((zzts) obj).zzb(zzumVar);
            zzumVar.zzbk(i2);
        }
    }

    public final int zzrl() {
        int i = this.zzbal;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzqj.zzd(this.zzben[i3] >>> 3, (zzps) this.zzbcz[i3]);
        }
        this.zzbal = i2;
        return i2;
    }

    public final int zzpe() {
        int zze;
        int i = this.zzbal;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzben[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzqj.zze(i5, ((Long) this.zzbcz[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzqj.zzg(i5, ((Long) this.zzbcz[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzqj.zzc(i5, (zzps) this.zzbcz[i3]);
            } else if (i6 == 3) {
                zze = (zzqj.zzbb(i5) << 1) + ((zzts) this.zzbcz[i3]).zzpe();
            } else if (i6 == 5) {
                zze = zzqj.zzl(i5, ((Integer) this.zzbcz[i3]).intValue());
            } else {
                throw new IllegalStateException(zzrk.zzpt());
            }
            i2 += zze;
        }
        this.zzbal = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzts)) {
            zzts zztsVar = (zzts) obj;
            int i = this.count;
            if (i == zztsVar.count) {
                int[] iArr = this.zzben;
                int[] iArr2 = zztsVar.zzben;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.zzbcz;
                    Object[] objArr2 = zztsVar.zzbcz;
                    int i3 = this.count;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int[] iArr = this.zzben;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        Object[] objArr = this.zzbcz;
        int i5 = this.count;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return ((((i + BR.userTeamVM) * 31) + i3) * 31) + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzsn.zza(sb, i, String.valueOf(this.zzben[i2] >>> 3), this.zzbcz[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(int i, Object obj) {
        if (!this.zzavs) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.count;
        int[] iArr = this.zzben;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzben = Arrays.copyOf(iArr, i3);
            this.zzbcz = Arrays.copyOf(this.zzbcz, i3);
        }
        int[] iArr2 = this.zzben;
        int i4 = this.count;
        iArr2[i4] = i;
        this.zzbcz[i4] = obj;
        this.count = i4 + 1;
    }
}
