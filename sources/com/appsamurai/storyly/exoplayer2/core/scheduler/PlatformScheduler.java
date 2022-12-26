package com.appsamurai.storyly.exoplayer2.core.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.offline.DownloadService;
import o.FingerprintManagerCompat;
import o.SupportMenuItem;
import o.getElevationDegrees;
/* loaded from: classes6.dex */
public final class PlatformScheduler {
    private static final int values;

    static {
        values = (getElevationDegrees.HaptikSDK$b >= 26 ? 16 : 0) | 15;
    }

    /* loaded from: classes6.dex */
    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int values = new Requirements(extras.getInt(DownloadService.KEY_REQUIREMENTS)).values(this);
            if (values == 0) {
                getElevationDegrees.values((Context) this, new Intent((String) FingerprintManagerCompat.toString(extras.getString("service_action"))).setPackage((String) FingerprintManagerCompat.toString(extras.getString("service_package"))));
                return false;
            }
            SupportMenuItem.toString("PlatformScheduler", "Requirements not met: " + values);
            jobFinished(jobParameters, true);
            return false;
        }
    }
}
