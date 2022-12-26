package com.google.android.gms.internal.gtm;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* loaded from: classes7.dex */
final class zzfm implements zzfe {
    private final long zzabf;
    private final int zzabg;
    private double zzabh;
    private final Object zzabj;
    private long zzakm;
    private Clock zzsd;

    private zzfm(int i, long j) {
        this.zzabj = new Object();
        this.zzabg = 60;
        this.zzabh = 60;
        this.zzabf = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        this.zzsd = DefaultClock.getInstance();
    }

    public zzfm() {
        this(60, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    @Override // com.google.android.gms.internal.gtm.zzfe
    public final boolean zzfm() {
        synchronized (this.zzabj) {
            long currentTimeMillis = this.zzsd.currentTimeMillis();
            double d = this.zzabh;
            double d2 = this.zzabg;
            if (d < d2) {
                double d3 = (currentTimeMillis - this.zzakm) / this.zzabf;
                if (d3 > 0.0d) {
                    this.zzabh = Math.min(d2, d + d3);
                }
            }
            this.zzakm = currentTimeMillis;
            double d4 = this.zzabh;
            if (d4 >= 1.0d) {
                this.zzabh = d4 - 1.0d;
                return true;
            }
            zzev.zzac("No more tokens available.");
            return false;
        }
    }
}
