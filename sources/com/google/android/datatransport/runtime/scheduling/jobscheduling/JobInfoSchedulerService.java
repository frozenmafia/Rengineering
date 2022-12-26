package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import o.findPreference;
import o.getOnBindEditTextListener;
import o.setShouldDisableView;
import org.apache.commons.logging.LogFactory;
/* loaded from: classes7.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        getOnBindEditTextListener.toString(getApplicationContext());
        findPreference.toString ag$a = findPreference.valueOf().values(string).ag$a(setShouldDisableView.valueOf(i));
        if (string2 != null) {
            ag$a.toString(Base64.decode(string2, 0));
        }
        getOnBindEditTextListener.ag$a().ah$a().toString(ag$a.values(), i2, new Runnable() { // from class: o.setValues
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.values(jobParameters);
            }
        });
        return true;
    }

    public /* synthetic */ void values(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}
