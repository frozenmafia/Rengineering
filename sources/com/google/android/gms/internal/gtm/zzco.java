package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.util.UUID;
/* loaded from: classes7.dex */
public final class zzco {
    private final String name;
    private final long zzabz;
    private final /* synthetic */ zzcm zzaca;

    private zzco(zzcm zzcmVar, String str, long j) {
        this.zzaca = zzcmVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.name = str;
        this.zzabz = j;
    }

    private final void zzgb() {
        long currentTimeMillis = this.zzaca.zzcn().currentTimeMillis();
        SharedPreferences.Editor edit = zzcm.zza(this.zzaca).edit();
        edit.remove(zzgf());
        edit.remove(zzgg());
        edit.putLong(zzge(), currentTimeMillis);
        edit.commit();
    }

    public final void zzae(String str) {
        if (zzgd() == 0) {
            zzgb();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j = zzcm.zza(this.zzaca).getLong(zzgf(), 0L);
            if (j <= 0) {
                SharedPreferences.Editor edit = zzcm.zza(this.zzaca).edit();
                edit.putString(zzgg(), str);
                edit.putLong(zzgf(), 1L);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            boolean z = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2;
            SharedPreferences.Editor edit2 = zzcm.zza(this.zzaca).edit();
            if (z) {
                edit2.putString(zzgg(), str);
            }
            edit2.putLong(zzgf(), j2);
            edit2.apply();
        }
    }

    public final Pair<String, Long> zzgc() {
        long zzgd = zzgd();
        long abs = zzgd == 0 ? 0L : Math.abs(zzgd - this.zzaca.zzcn().currentTimeMillis());
        long j = this.zzabz;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            zzgb();
            return null;
        }
        String string = zzcm.zza(this.zzaca).getString(zzgg(), null);
        long j2 = zzcm.zza(this.zzaca).getLong(zzgf(), 0L);
        zzgb();
        if (string == null || j2 <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    private final long zzgd() {
        return zzcm.zza(this.zzaca).getLong(zzge(), 0L);
    }

    private final String zzge() {
        return String.valueOf(this.name).concat(":start");
    }

    private final String zzgf() {
        return String.valueOf(this.name).concat(":count");
    }

    private final String zzgg() {
        return String.valueOf(this.name).concat(":value");
    }
}
