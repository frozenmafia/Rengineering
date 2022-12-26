package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* loaded from: classes3.dex */
final class LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a extends BroadcastReceiver {
    final /* synthetic */ LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 ah$a;

    private LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2$ag$a(LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2) {
        this.ah$a = locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Handler ag$a = LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2.ag$a(this.ah$a);
        final LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 locationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 = this.ah$a;
        ag$a.post(new Runnable() { // from class: o.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2.toString(LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2.this);
            }
        });
    }
}
