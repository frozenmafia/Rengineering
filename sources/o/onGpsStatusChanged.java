package o;

import android.content.Context;
import android.net.wifi.WifiManager;
/* loaded from: classes3.dex */
final class onGpsStatusChanged {
    private WifiManager.WifiLock ag$a;
    private boolean ah$a;
    private final WifiManager valueOf;
    private boolean values;

    public onGpsStatusChanged(Context context) {
        this.valueOf = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void values(boolean z) {
        if (z && this.ag$a == null) {
            WifiManager wifiManager = this.valueOf;
            if (wifiManager == null) {
                SupportMenuItem.toString("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.ag$a = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.ah$a = z;
        valueOf();
    }

    public void ag$a(boolean z) {
        this.values = z;
        valueOf();
    }

    private void valueOf() {
        WifiManager.WifiLock wifiLock = this.ag$a;
        if (wifiLock == null) {
            return;
        }
        if (this.ah$a && this.values) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
