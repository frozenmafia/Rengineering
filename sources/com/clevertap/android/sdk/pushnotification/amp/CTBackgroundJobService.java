package com.clevertap.android.sdk.pushnotification.amp;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.clevertap.android.sdk.CleverTapAPI;
import o.setBoundsInScreen;
/* loaded from: classes4.dex */
public class CTBackgroundJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        setBoundsInScreen.values("Job Service is starting");
        new Thread(new Runnable() { // from class: com.clevertap.android.sdk.pushnotification.amp.CTBackgroundJobService.4
            @Override // java.lang.Runnable
            public void run() {
                CleverTapAPI.values(CTBackgroundJobService.this.getApplicationContext(), jobParameters);
                CTBackgroundJobService.this.jobFinished(jobParameters, true);
            }
        }).start();
        return true;
    }
}
