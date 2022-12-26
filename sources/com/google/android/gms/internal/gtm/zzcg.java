package com.google.android.gms.internal.gtm;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.gms.common.util.Clock;
/* loaded from: classes7.dex */
public final class zzcg {
    private final long zzabf;
    private final int zzabg;
    private double zzabh;
    private long zzabi;
    private final Object zzabj;
    private final Clock zzsd;
    private final String zzup;

    private zzcg(int i, long j, String str, Clock clock) {
        this.zzabj = new Object();
        this.zzabg = 60;
        this.zzabh = 60;
        this.zzabf = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        this.zzup = str;
        this.zzsd = clock;
    }

    public zzcg(String str, Clock clock) {
        this(60, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, str, clock);
    }

    public final boolean zzfm() {
        synchronized (this.zzabj) {
            long currentTimeMillis = this.zzsd.currentTimeMillis();
            double d = this.zzabh;
            double d2 = this.zzabg;
            if (d < d2) {
                double d3 = (currentTimeMillis - this.zzabi) / this.zzabf;
                if (d3 > 0.0d) {
                    this.zzabh = Math.min(d2, d + d3);
                }
            }
            this.zzabi = currentTimeMillis;
            double d4 = this.zzabh;
            if (d4 >= 1.0d) {
                this.zzabh = d4 - 1.0d;
                return true;
            }
            String str = this.zzup;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Excessive ");
            sb.append(str);
            sb.append(" detected; call ignored.");
            zzch.zzac(sb.toString());
            return false;
        }
    }
}
