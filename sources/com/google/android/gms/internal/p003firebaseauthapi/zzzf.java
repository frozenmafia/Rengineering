package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzf  reason: invalid package */
/* loaded from: classes7.dex */
final class zzzf {
    private final zzze zza;

    private zzzf(zzze zzzeVar) {
        zzaac.zzf(zzzeVar, "output");
        this.zza = zzzeVar;
        zzzeVar.zze = this;
    }

    public static zzzf zza(zzze zzzeVar) {
        zzzf zzzfVar = zzzeVar.zze;
        return zzzfVar != null ? zzzfVar : new zzzf(zzzeVar);
    }

    public final void zzA(int i, int i2) throws IOException {
        this.zza.zzr(i, (i2 + i2) ^ (i2 >> 31));
    }

    public final void zzC(int i, long j) throws IOException {
        this.zza.zzt(i, (j + j) ^ (j >> 63));
    }

    public final void zzE(int i) throws IOException {
        this.zza.zzq(i, 3);
    }

    public final void zzF(int i, String str) throws IOException {
        this.zza.zzo(i, str);
    }

    public final void zzG(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzaaj)) {
            while (i2 < list.size()) {
                this.zza.zzo(i, list.get(i2));
                i2++;
            }
            return;
        }
        zzaaj zzaajVar = (zzaaj) list;
        while (i2 < list.size()) {
            Object zzf = zzaajVar.zzf(i2);
            if (zzf instanceof String) {
                this.zza.zzo(i, (String) zzf);
            } else {
                this.zza.zzQ(i, (zzyu) zzf);
            }
            i2++;
        }
    }

    public final void zzH(int i, int i2) throws IOException {
        this.zza.zzr(i, i2);
    }

    public final void zzJ(int i, long j) throws IOException {
        this.zza.zzt(i, j);
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzP(i, z);
    }

    public final void zzd(int i, zzyu zzyuVar) throws IOException {
        this.zza.zzQ(i, zzyuVar);
    }

    public final void zze(int i, List<zzyu> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzQ(i, list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void zzh(int i) throws IOException {
        this.zza.zzq(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzq(int i, Object obj, zzabl zzablVar) throws IOException {
        zzze zzzeVar = this.zza;
        zzzeVar.zzq(i, 3);
        zzablVar.zzn((zzaaz) obj, zzzeVar.zze);
        zzzeVar.zzq(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzt(i, j);
    }

    public final void zzv(int i, Object obj, zzabl zzablVar) throws IOException {
        this.zza.zzn(i, (zzaaz) obj, zzablVar);
    }

    public final void zzw(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzy(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzB(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzze zzzeVar = this.zza;
                int intValue = list.get(i2).intValue();
                zzzeVar.zzr(i, (intValue + intValue) ^ (intValue >> 31));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = list.get(i4).intValue();
            i3 += zzze.zzE((intValue2 + intValue2) ^ (intValue2 >> 31));
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            zzze zzzeVar2 = this.zza;
            int intValue3 = list.get(i2).intValue();
            zzzeVar2.zzs((intValue3 + intValue3) ^ (intValue3 >> 31));
            i2++;
        }
    }

    public final void zzD(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzze zzzeVar = this.zza;
                long longValue = list.get(i2).longValue();
                zzzeVar.zzt(i, (longValue + longValue) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = list.get(i4).longValue();
            i3 += zzze.zzF((longValue2 + longValue2) ^ (longValue2 >> 63));
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            zzze zzzeVar2 = this.zza;
            long longValue3 = list.get(i2).longValue();
            zzzeVar2.zzu((longValue3 + longValue3) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public final void zzI(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzze.zzE(list.get(i4).intValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzs(list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzK(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzt(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzze.zzF(list.get(i4).longValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzu(list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzc(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzP(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).booleanValue();
            i3++;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzO(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzze.zzy(list.get(i4).intValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzm(list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            i3 += 4;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzi(list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            i3 += 8;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzk(list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzs(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzze.zzy(list.get(i4).intValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzm(list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzu(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzt(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzze.zzF(list.get(i4).longValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzu(list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzx(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            i3 += 4;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzi(list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzz(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            i3 += 8;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzk(list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).doubleValue();
            i3 += 8;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public final void zzp(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).floatValue();
            i3 += 4;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }
}
