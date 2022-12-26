package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbe  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzbe implements Comparable<zzbe> {
    private final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbe(byte[] bArr, zzbc zzbcVar) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzbe zzbeVar) {
        zzbe zzbeVar2 = zzbeVar;
        int length = this.zza.length;
        int length2 = zzbeVar2.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i];
            byte b3 = zzbeVar2.zza[i];
            if (b2 != b3) {
                return b2 - b3;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbe) {
            return Arrays.equals(this.zza, ((zzbe) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzky.zza(this.zza);
    }
}
