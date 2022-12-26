package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
/* loaded from: classes7.dex */
public final class zzgu {
    private Tracker zzrl;
    private Context zzrm;
    private GoogleAnalytics zzro;

    public zzgu(Context context) {
        this.zzrm = context;
    }

    public final Tracker zzbm(String str) {
        zzbn(str);
        return this.zzrl;
    }

    private final void zzbn(String str) {
        synchronized (this) {
            if (this.zzro == null) {
                GoogleAnalytics googleAnalytics = GoogleAnalytics.getInstance(this.zzrm);
                this.zzro = googleAnalytics;
                googleAnalytics.setLogger(new zzgv());
                this.zzrl = this.zzro.newTracker(str);
            }
        }
    }
}
