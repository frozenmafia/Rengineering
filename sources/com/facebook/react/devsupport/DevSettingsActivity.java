package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import o.onFragmentSaveInstanceState;
import o.onFragmentSaveInstanceState$HaptikSDK$b;
/* loaded from: classes6.dex */
public class DevSettingsActivity extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(onFragmentSaveInstanceState.valueOf.catalyst_settings_title));
        addPreferencesFromResource(onFragmentSaveInstanceState$HaptikSDK$b.rn_dev_preferences);
    }
}
