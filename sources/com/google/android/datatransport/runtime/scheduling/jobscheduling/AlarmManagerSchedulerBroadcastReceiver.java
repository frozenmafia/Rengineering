package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import o.ListPreferenceDialogFragmentCompat;
import o.findPreference;
import o.getOnBindEditTextListener;
import o.setShouldDisableView;
import org.apache.commons.logging.LogFactory;
/* loaded from: classes7.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void values() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        getOnBindEditTextListener.toString(context);
        findPreference.toString ag$a = findPreference.valueOf().values(queryParameter).ag$a(setShouldDisableView.valueOf(intValue));
        if (queryParameter2 != null) {
            ag$a.toString(Base64.decode(queryParameter2, 0));
        }
        getOnBindEditTextListener.ag$a().ah$a().toString(ag$a.values(), i, ListPreferenceDialogFragmentCompat.valueOf);
    }
}
