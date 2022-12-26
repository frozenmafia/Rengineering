package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public final class zznk {
    private boolean closed;
    private String zzafk;
    private final ScheduledExecutorService zzaji;
    private ScheduledFuture<?> zzajk;

    public zznk() {
        this(zzdf.zzgp().zza(1, zzdi.zzadg));
    }

    private zznk(ScheduledExecutorService scheduledExecutorService) {
        this.zzajk = null;
        this.zzafk = null;
        this.zzaji = scheduledExecutorService;
        this.closed = false;
    }

    public final void zza(Context context, zzmw zzmwVar, long j, zzmn zzmnVar) {
        synchronized (this) {
            ScheduledFuture<?> scheduledFuture = this.zzajk;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzajk = this.zzaji.schedule(new zznj(context, zzmwVar, zzmnVar), 0L, TimeUnit.MILLISECONDS);
        }
    }
}
