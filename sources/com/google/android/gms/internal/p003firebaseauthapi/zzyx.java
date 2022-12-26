package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyx  reason: invalid package */
/* loaded from: classes7.dex */
public abstract class zzyx {
    int zza;
    zzyy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzyx(zzyv zzyvVar) {
    }

    public static int zzs(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzt(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzyx zzu(byte[] bArr, int i, int i2, boolean z) {
        zzyw zzywVar = new zzyw(bArr, 0, i2, z, null);
        try {
            zzywVar.zzc(i2);
            return zzywVar;
        } catch (zzaae e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zzb();

    public abstract int zzc(int i) throws zzaae;

    public abstract int zzf() throws IOException;

    public abstract zzyu zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract void zzm(int i) throws zzaae;

    public abstract void zzn(int i);

    public abstract boolean zzp() throws IOException;

    public abstract boolean zzq() throws IOException;

    public abstract boolean zzr(int i) throws IOException;
}
