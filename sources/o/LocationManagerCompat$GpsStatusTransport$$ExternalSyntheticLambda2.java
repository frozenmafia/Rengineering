package o;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
/* loaded from: classes3.dex */
public final class LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 {
    private LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a HaptikSDK$a;
    private final Handler ag$a;
    private final AudioManager ah$a;
    private int ah$b;
    private int invoke;
    private boolean toString;
    private final valueOf valueOf;
    private final Context values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void toString(int i, boolean z);

        void values(int i);
    }

    public static /* synthetic */ void toString(LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2) {
        locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2.values();
    }

    public LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2(Context context, Handler handler, valueOf valueof) {
        Context applicationContext = context.getApplicationContext();
        this.values = applicationContext;
        this.ag$a = handler;
        this.valueOf = valueof;
        AudioManager audioManager = (AudioManager) FingerprintManagerCompat.ag$a((AudioManager) applicationContext.getSystemService("audio"));
        this.ah$a = audioManager;
        this.invoke = 3;
        this.ah$b = ah$a(audioManager, 3);
        this.toString = valueOf(audioManager, this.invoke);
        LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a = new LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a(this);
        try {
            applicationContext.registerReceiver(locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.HaptikSDK$a = locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a;
        } catch (RuntimeException e) {
            SupportMenuItem.valueOf("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public void toString(int i) {
        if (this.invoke == i) {
            return;
        }
        this.invoke = i;
        values();
        this.valueOf.values(i);
    }

    public int valueOf() {
        if (getElevationDegrees.HaptikSDK$b >= 28) {
            return this.ah$a.getStreamMinVolume(this.invoke);
        }
        return 0;
    }

    public int ah$a() {
        return this.ah$a.getStreamMaxVolume(this.invoke);
    }

    public void ag$a() {
        LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a = this.HaptikSDK$a;
        if (locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a != null) {
            try {
                this.values.unregisterReceiver(locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a);
            } catch (RuntimeException e) {
                SupportMenuItem.valueOf("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.HaptikSDK$a = null;
        }
    }

    public void values() {
        int ah$a = ah$a(this.ah$a, this.invoke);
        boolean valueOf2 = valueOf(this.ah$a, this.invoke);
        if (this.ah$b == ah$a && this.toString == valueOf2) {
            return;
        }
        this.ah$b = ah$a;
        this.toString = valueOf2;
        this.valueOf.toString(ah$a, valueOf2);
    }

    private static int ah$a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            SupportMenuItem.valueOf("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean valueOf(AudioManager audioManager, int i) {
        if (getElevationDegrees.HaptikSDK$b >= 23) {
            return audioManager.isStreamMute(i);
        }
        return ah$a(audioManager, i) == 0;
    }
}
