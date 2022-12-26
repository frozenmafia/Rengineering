package o;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.microsoft.fraudprotection.androidsdk.AttributeType;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.IMultiInstanceInvalidationService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class Fts4 extends onDelete implements LocationListener {
    private final LocationManager HaptikSDK$a;
    private boolean HaptikSDK$c;
    private Location ah$b;
    private Index toString;

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fts4(Context context, JSONObject jSONObject) {
        super(context, jSONObject);
        this.HaptikSDK$a = (LocationManager) context.getSystemService("location");
    }

    @Override // o.onDelete
    public String valueOf() {
        return AttributeType.LOCATION.getType();
    }

    @Override // o.onDelete
    public void valueOf(Index index) {
        this.toString = index;
        try {
            this.valueOf = System.nanoTime();
            if (!IMultiInstanceInvalidationService.Stub.Proxy.ag$a(this.ah$a)) {
                toString(new IMultiInstanceInvalidationCallback("Location permission is denied"));
                return;
            }
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            List<String> providers = this.HaptikSDK$a.getProviders(true);
            if (ah$a() && providers.size() > 0) {
                Date date = new Date();
                String str = null;
                for (String str2 : providers) {
                    if (str == null) {
                        str = str2;
                    }
                    Location values = values(str2);
                    if (values != null && date.getTime() - values.getTime() < 21600000 && values(values, this.ah$b)) {
                        this.ah$b = values;
                        this.HaptikSDK$c = true;
                        str = str2;
                    }
                }
                if (this.HaptikSDK$c && str != null) {
                    toString((IMultiInstanceInvalidationCallback) null);
                    return;
                }
                if ("passive".equals(str)) {
                    str = "gps";
                }
                toString(str);
                return;
            }
            toString(new IMultiInstanceInvalidationCallback("Service unavailable"));
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString(valueOf() + " execute error ", e);
            toString(new IMultiInstanceInvalidationCallback(e.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onDelete
    public void toString(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback) {
        values();
        if (this.ah$b != null) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(0, this.ah$b.getLatitude());
                jSONArray.put(1, this.ah$b.getLongitude());
            } catch (JSONException e) {
                IMultiInstanceInvalidationService.Default.toString(valueOf() + " wrapUpJob ", e);
            }
            this.values.ag$a("g1", jSONArray, false);
            this.values.ag$a("g3", Double.valueOf(this.ah$b.getAltitude()), false);
        }
        long j = -1;
        if (iMultiInstanceInvalidationCallback != null) {
            this.values.ag$a(valueOf(), iMultiInstanceInvalidationCallback.ah$a());
        } else {
            j = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.valueOf);
        }
        this.toString.ah$a(this.values, j);
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (values(location, this.ah$b)) {
            this.ah$b = location;
            this.HaptikSDK$c = true;
        }
        toString((IMultiInstanceInvalidationCallback) null);
    }

    private void toString(String str) throws SecurityException {
        IMultiInstanceInvalidationService.Default.valueOf("AsyncLocationJob - Requesting Location from " + str);
        this.HaptikSDK$a.requestSingleUpdate(str, this, (Looper) null);
    }

    private Location values(String str) throws SecurityException {
        return this.HaptikSDK$a.getLastKnownLocation(str);
    }

    private boolean values(Location location, Location location2) {
        return location2 == null || ((int) (location.getAccuracy() - location2.getAccuracy())) < 0;
    }

    private boolean ah$a() {
        boolean isProviderEnabled = this.HaptikSDK$a.isProviderEnabled("gps");
        this.values.ag$a("f9", Boolean.valueOf(isProviderEnabled), false);
        boolean isProviderEnabled2 = this.HaptikSDK$a.isProviderEnabled("network");
        this.values.ag$a("g2", Boolean.valueOf(isProviderEnabled2), false);
        return isProviderEnabled || isProviderEnabled2;
    }

    private void values() {
        LocationManager locationManager = this.HaptikSDK$a;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }
}
