package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
/* loaded from: classes5.dex */
public class onPostMigrate {
    private final Context ag$a;
    private Handler ah$a;
    private final toString valueOf;
    private final values HaptikSDK$a = new values();
    private final Runnable values = new onPostMigrate$ag$a(this);
    private boolean toString = false;

    /* loaded from: classes5.dex */
    public interface toString {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    public onPostMigrate(Context context, toString tostring) {
        this.ag$a = context;
        this.valueOf = tostring;
    }

    public void values() {
        if (valueOf()) {
            ag$a();
            HaptikSDK$b();
        }
    }

    public void ah$a() {
        if (valueOf()) {
            HaptikSDK$c();
            HaptikSDK$a();
        }
    }

    private boolean valueOf() {
        return Build.MANUFACTURER.equals("Amazon") && (Build.MODEL.startsWith("AF") || Build.MODEL.startsWith("KF"));
    }

    private void ag$a() {
        if (this.HaptikSDK$a.values) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
        intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
        this.ag$a.registerReceiver(this.HaptikSDK$a, intentFilter);
        this.HaptikSDK$a.values = true;
    }

    private void HaptikSDK$b() {
        if (this.toString) {
            return;
        }
        Handler handler = new Handler();
        this.ah$a = handler;
        this.toString = true;
        handler.post(this.values);
    }

    private void HaptikSDK$a() {
        if (this.HaptikSDK$a.values) {
            this.ag$a.unregisterReceiver(this.HaptikSDK$a);
            this.HaptikSDK$a.values = false;
        }
    }

    private void HaptikSDK$c() {
        if (this.toString) {
            this.toString = false;
            this.ah$a.removeCallbacksAndMessages(null);
            this.ah$a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class values extends BroadcastReceiver {
        private Boolean ag$a;
        boolean values;

        private values() {
            this.values = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z = false;
            } else if (!"com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                return;
            } else {
                z = true;
            }
            Boolean bool = this.ag$a;
            if (bool == null || bool.booleanValue() != z) {
                this.ag$a = Boolean.valueOf(z);
                onPostMigrate.this.valueOf.onAmazonFireDeviceConnectivityChanged(z);
            }
        }
    }
}
