package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyw  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzyw extends zzyx {
    private final byte[] zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzyw(byte[] bArr, int i, int i2, boolean z, zzyv zzyvVar) {
        super(null);
        this.zzh = Integer.MAX_VALUE;
        this.zzc = bArr;
        this.zzd = i2;
        this.zzf = 0;
    }

    private final void zzv() {
        int i = this.zzd + this.zze;
        this.zzd = i;
        int i2 = this.zzh;
        if (i <= i2) {
            this.zze = 0;
            return;
        }
        int i3 = i - i2;
        this.zze = i3;
        this.zzd = i - i3;
    }

    public final byte zza() throws IOException {
        int i = this.zzf;
        if (i != this.zzd) {
            byte[] bArr = this.zzc;
            this.zzf = i + 1;
            return bArr[i];
        }
        throw zzaae.zzi();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final int zzc(int i) throws zzaae {
        if (i >= 0) {
            int i2 = i + this.zzf;
            if (i2 >= 0) {
                int i3 = this.zzh;
                if (i2 <= i3) {
                    this.zzh = i2;
                    zzv();
                    return i3;
                }
                throw zzaae.zzi();
            }
            throw zzaae.zzg();
        }
        throw zzaae.zzf();
    }

    public final int zzd() throws IOException {
        int i = this.zzf;
        if (this.zzd - i >= 4) {
            byte[] bArr = this.zzc;
            this.zzf = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzaae.zzi();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final int zzf() throws IOException {
        if (zzp()) {
            this.zzg = 0;
            return 0;
        }
        int zze = zze();
        this.zzg = zze;
        if ((zze >>> 3) != 0) {
            return zze;
        }
        throw zzaae.zzc();
    }

    public final long zzg() throws IOException {
        int i = this.zzf;
        if (this.zzd - i >= 8) {
            byte[] bArr = this.zzc;
            this.zzf = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzaae.zzi();
    }

    final long zzi() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zza = zza();
            j |= (zza & Byte.MAX_VALUE) << i;
            if ((zza & 128) == 0) {
                return j;
            }
        }
        throw zzaae.zze();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final zzyu zzj() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zze <= i - i2) {
                zzyu zzo = zzyu.zzo(this.zzc, i2, zze);
                this.zzf += zze;
                return zzo;
            }
        }
        if (zze != 0) {
            if (zze > 0) {
                int i3 = this.zzd;
                int i4 = this.zzf;
                if (zze <= i3 - i4) {
                    int i5 = zze + i4;
                    this.zzf = i5;
                    return zzyu.zzq(Arrays.copyOfRange(this.zzc, i4, i5));
                }
            }
            if (zze <= 0) {
                throw zzaae.zzf();
            }
            throw zzaae.zzi();
        }
        return zzyu.zzb;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final String zzk() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zze <= i - i2) {
                String str = new String(this.zzc, i2, zze, zzaac.zza);
                this.zzf += zze;
                return str;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze < 0) {
            throw zzaae.zzf();
        }
        throw zzaae.zzi();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final String zzl() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zze <= i - i2) {
                String zzd = zzaco.zzd(this.zzc, i2, zze);
                this.zzf += zze;
                return zzd;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze <= 0) {
            throw zzaae.zzf();
        }
        throw zzaae.zzi();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final void zzm(int i) throws zzaae {
        if (this.zzg != i) {
            throw zzaae.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final void zzn(int i) {
        this.zzh = i;
        zzv();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final boolean zzp() throws IOException {
        return this.zzf == this.zzd;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final boolean zzq() throws IOException {
        return zzh() != 0;
    }

    public final void zzo(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzd;
            int i3 = this.zzf;
            if (i <= i2 - i3) {
                this.zzf = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzaae.zzf();
        }
        throw zzaae.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzf
            int r1 = r5.zzd
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zzc
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzf = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.zzf = r1
            return r0
        L6c:
            long r0 = r5.zzi()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p003firebaseauthapi.zzyw.zze():int");
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzyx
    public final boolean zzr(int i) throws IOException {
        int zzf;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzd - this.zzf < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zzaae.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.zzc;
                int i4 = this.zzf;
                this.zzf = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzaae.zze();
            return true;
        } else if (i2 == 1) {
            zzo(8);
            return true;
        } else if (i2 == 2) {
            zzo(zze());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzo(4);
                    return true;
                }
                throw zzaae.zza();
            }
            return false;
        } else {
            do {
                zzf = zzf();
                if (zzf == 0) {
                    break;
                }
            } while (zzr(zzf));
            zzm(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r2[r3] >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p003firebaseauthapi.zzyw.zzh():long");
    }
}
