package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyn  reason: invalid package */
/* loaded from: classes7.dex */
final class zzyn implements Comparator<zzyu> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzyu zzyuVar, zzyu zzyuVar2) {
        zzyu zzyuVar3 = zzyuVar;
        zzyu zzyuVar4 = zzyuVar2;
        zzyl zzylVar = new zzyl(zzyuVar3);
        zzyl zzylVar2 = new zzyl(zzyuVar4);
        while (zzylVar.hasNext() && zzylVar2.hasNext()) {
            int zza = zzym.zza(zzylVar.zza() & 255, zzylVar2.zza() & 255);
            if (zza != 0) {
                return zza;
            }
        }
        return zzym.zza(zzyuVar3.zzd(), zzyuVar4.zzd());
    }
}
