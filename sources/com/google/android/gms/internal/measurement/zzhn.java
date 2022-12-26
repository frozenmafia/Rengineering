package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzhn implements zzhk {
    private static zzhn zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhn() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhn(Context context) {
        this.zzb = context;
        zzhm zzhmVar = new zzhm(this, null);
        this.zzc = zzhmVar;
        context.getContentResolver().registerContentObserver(zzha.zza, true, zzhmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhn zza(Context context) {
        zzhn zzhnVar;
        synchronized (zzhn.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhn(context) : new zzhn();
            }
            zzhnVar = zza;
        }
        return zzhnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze() {
        Context context;
        synchronized (zzhn.class) {
            zzhn zzhnVar = zza;
            if (zzhnVar != null && (context = zzhnVar.zzb) != null && zzhnVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    /* renamed from: zzc */
    public final String zzb(final String str) {
        Context context = this.zzb;
        if (context == null || zzhb.zza(context)) {
            return null;
        }
        try {
            return (String) zzhi.zza(new zzhj() { // from class: com.google.android.gms.internal.measurement.zzhl
                @Override // com.google.android.gms.internal.measurement.zzhj
                public final Object zza() {
                    return zzhn.this.zzd(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzd(String str) {
        return zzha.zza(this.zzb.getContentResolver(), str, null);
    }
}
