package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;
/* loaded from: classes7.dex */
public final class zzdz {
    private final String zzaec;
    private final Random zzafj;
    private final Context zzrm;

    public zzdz(Context context, String str) {
        this(context, str, new Random());
    }

    private zzdz(Context context, String str, Random random) {
        this.zzrm = (Context) Preconditions.checkNotNull(context);
        this.zzaec = (String) Preconditions.checkNotNull(str);
        this.zzafj = random;
    }

    public final long zzhl() {
        return zza(7200000L, 259200000L) + 43200000;
    }

    public final long zzhm() {
        return zza(600000L, 86400000L) + 3600000;
    }

    public final long zzkd() {
        if (Math.max(0L, zzhp().getLong("FORBIDDEN_COUNT", 0L)) == 0) {
            return 0L;
        }
        return zza(WorkRequest.MIN_BACKOFF_MILLIS, 600000L) + WorkRequest.MIN_BACKOFF_MILLIS;
    }

    public final boolean zzke() {
        return Math.max(0L, zzhp().getLong("FORBIDDEN_COUNT", 0L)) > 0;
    }

    private final long zza(long j, long j2) {
        SharedPreferences zzhp = zzhp();
        long max = Math.max(0L, zzhp.getLong("FORBIDDEN_COUNT", 0L));
        return this.zzafj.nextFloat() * ((float) (j + ((((float) max) / ((float) ((max + Math.max(0L, zzhp.getLong("SUCCESSFUL_COUNT", 0L))) + 1))) * ((float) (j2 - j)))));
    }

    public final void zzhn() {
        SharedPreferences zzhp = zzhp();
        long j = zzhp.getLong("FORBIDDEN_COUNT", 0L);
        long j2 = zzhp.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor edit = zzhp.edit();
        long min = j == 0 ? 3L : Math.min(10L, j + 1);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    public final void zzho() {
        SharedPreferences zzhp = zzhp();
        long j = zzhp.getLong("SUCCESSFUL_COUNT", 0L);
        long j2 = zzhp.getLong("FORBIDDEN_COUNT", 0L);
        long min = Math.min(10L, j + 1);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        SharedPreferences.Editor edit = zzhp.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }

    private final SharedPreferences zzhp() {
        Context context = this.zzrm;
        String valueOf = String.valueOf(this.zzaec);
        return context.getSharedPreferences(valueOf.length() != 0 ? "v5_gtmContainerRefreshPolicy_".concat(valueOf) : new String("v5_gtmContainerRefreshPolicy_"), 0);
    }
}
