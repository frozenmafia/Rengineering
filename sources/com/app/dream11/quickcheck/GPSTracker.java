package com.app.dream11.quickcheck;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.app.dream11.core.factory.ServiceFactory;
import com.app.dream11.core.service.PermissionEnum;
import o.SupportSQLiteQuery;
import o.applyIconTintIfNecessary;
import o.compareStrings;
/* loaded from: classes3.dex */
public class GPSTracker extends Service implements LocationListener {
    private final Context HaptikSDK$b;
    protected LocationManager HaptikSDK$c;
    Location ah$a;
    double invoke;
    double values;
    boolean toString = false;
    boolean valueOf = false;
    boolean ag$a = false;
    private compareStrings<Location> HaptikSDK$a = compareStrings.HaptikSDK$c();
    private boolean ah$b = false;
    private applyIconTintIfNecessary HaptikSDK$e = ServiceFactory.values().platformService.ah$a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public GPSTracker(Context context) {
        this.HaptikSDK$b = context;
        ag$a();
    }

    public boolean HaptikSDK$b() {
        return this.HaptikSDK$c.isProviderEnabled("gps") || this.HaptikSDK$c.isProviderEnabled("network");
    }

    public Location ag$a() {
        boolean z = false;
        try {
            this.ah$b = false;
            LocationManager locationManager = (LocationManager) this.HaptikSDK$b.getSystemService("location");
            this.HaptikSDK$c = locationManager;
            this.toString = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled = this.HaptikSDK$c.isProviderEnabled("network");
            this.valueOf = isProviderEnabled;
            boolean z2 = this.toString;
            this.ag$a = (z2 || isProviderEnabled) ? true : true;
            if (z2 || isProviderEnabled) {
                if (z2 && this.ah$a == null && invoke()) {
                    this.HaptikSDK$c.requestLocationUpdates("gps", 1000L, 1.0f, this);
                    Log.d("GPS Enabled", "GPS Enabled");
                    LocationManager locationManager2 = this.HaptikSDK$c;
                    if (locationManager2 != null) {
                        Location lastKnownLocation = locationManager2.getLastKnownLocation("gps");
                        this.ah$a = lastKnownLocation;
                        if (lastKnownLocation != null) {
                            this.values = lastKnownLocation.getLatitude();
                            this.invoke = this.ah$a.getLongitude();
                            this.HaptikSDK$a.onNext(this.ah$a);
                            return this.ah$a;
                        }
                    }
                }
                if (this.valueOf && invoke()) {
                    this.HaptikSDK$c.requestLocationUpdates("network", 1000L, 1.0f, this);
                    Log.d("Network", "Network");
                    LocationManager locationManager3 = this.HaptikSDK$c;
                    if (locationManager3 != null) {
                        Location lastKnownLocation2 = locationManager3.getLastKnownLocation("network");
                        this.ah$a = lastKnownLocation2;
                        if (lastKnownLocation2 != null) {
                            this.values = lastKnownLocation2.getLatitude();
                            this.invoke = this.ah$a.getLongitude();
                            this.HaptikSDK$a.onNext(this.ah$a);
                            return this.ah$a;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.ah$a;
    }

    public void HaptikSDK$c() {
        if (this.HaptikSDK$c != null) {
            this.ah$b = true;
            HaptikSDK$a();
            this.HaptikSDK$c.removeUpdates(this);
        }
    }

    public boolean invoke() {
        return ContextCompat.checkSelfPermission(this.HaptikSDK$b, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.HaptikSDK$b, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public SupportSQLiteQuery<PermissionEnum> valueOf() {
        return this.HaptikSDK$e.getInitSettings();
    }

    public SupportSQLiteQuery<PermissionEnum> ah$b() {
        return this.HaptikSDK$e.ah$a();
    }

    public SupportSQLiteQuery<Location> values() {
        return this.HaptikSDK$a;
    }

    public void HaptikSDK$a() {
        this.ah$a = null;
    }

    public Location ah$a() {
        return this.ah$a;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.ah$b) {
            return;
        }
        this.ah$a = location;
        this.HaptikSDK$a.onNext(location);
    }
}
