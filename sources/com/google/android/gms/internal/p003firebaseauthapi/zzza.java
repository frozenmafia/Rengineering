package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzza  reason: invalid package */
/* loaded from: classes7.dex */
abstract class zzza extends zzze {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzze
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(byte b2) {
        byte[] bArr = this.zza;
        int i = this.zzc;
        this.zzc = i + 1;
        bArr[i] = b2;
        this.zzd++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i) {
        byte[] bArr = this.zza;
        int i2 = this.zzc;
        int i3 = i2 + 1;
        this.zzc = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.zzc = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.zzc = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.zzc = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.zzd += 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(long j) {
        byte[] bArr = this.zza;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        this.zzc = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        this.zzc = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        this.zzc = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        this.zzc = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.zzc = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.zzc = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.zzc = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.zzd += 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzza(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.zza = new byte[max];
        this.zzb = max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(int i) {
        boolean z;
        z = zzze.zzb;
        if (!z) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                this.zzd++;
                i >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr2[i3] = (byte) i;
            this.zzd++;
            return;
        }
        long j = this.zzc;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            zzacj.zzn(bArr3, i4, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zzacj.zzn(bArr4, i5, (byte) i);
        this.zzd += (int) (this.zzc - j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(long j) {
        boolean z;
        z = zzze.zzb;
        if (!z) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i = this.zzc;
                this.zzc = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                this.zzd++;
                j >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr2[i2] = (byte) j;
            this.zzd++;
            return;
        }
        long j2 = this.zzc;
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            zzacj.zzn(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        zzacj.zzn(bArr4, i4, (byte) j);
        this.zzd += (int) (this.zzc - j2);
    }
}
