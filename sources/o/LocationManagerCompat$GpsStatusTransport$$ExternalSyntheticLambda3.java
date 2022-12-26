package o;

import android.content.Context;
import android.os.PowerManager;
/* loaded from: classes3.dex */
final class LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3 {
    private final PowerManager ag$a;
    private boolean ah$a;
    private boolean valueOf;
    private PowerManager.WakeLock values;

    public LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3(Context context) {
        this.ag$a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void valueOf(boolean z) {
        if (z && this.values == null) {
            PowerManager powerManager = this.ag$a;
            if (powerManager == null) {
                SupportMenuItem.toString("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.values = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.valueOf = z;
        ag$a();
    }

    public void ag$a(boolean z) {
        this.ah$a = z;
        ag$a();
    }

    private void ag$a() {
        PowerManager.WakeLock wakeLock = this.values;
        if (wakeLock == null) {
            return;
        }
        if (this.valueOf && this.ah$a) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
