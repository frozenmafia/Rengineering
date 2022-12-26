package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CustomTabActivity extends Activity {
    private BroadcastReceiver toString;
    public static final toString values = new toString(null);
    public static final String ah$a = runAnimators.values("CustomTabActivity", (Object) ".action_customTabRedirect");
    public static final String valueOf = runAnimators.values("CustomTabActivity", (Object) ".action_destroy");

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(ah$a);
        intent.putExtra(CustomTabMainActivity.HaptikSDK$c, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(ah$a);
            intent2.putExtra(CustomTabMainActivity.HaptikSDK$c, getIntent().getDataString());
            CustomTabActivity customTabActivity = this;
            LocalBroadcastManager.getInstance(customTabActivity).sendBroadcast(intent2);
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabActivity$onActivityResult$closeReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent3) {
                    runAnimators.ag$a(context, "context");
                    runAnimators.ag$a(intent3, "intent");
                    CustomTabActivity.this.finish();
                }
            };
            LocalBroadcastManager.getInstance(customTabActivity).registerReceiver(broadcastReceiver, new IntentFilter(valueOf));
            this.toString = broadcastReceiver;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.toString;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
