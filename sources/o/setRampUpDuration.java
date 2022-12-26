package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.List;
/* loaded from: classes4.dex */
public class setRampUpDuration {
    private static PhoneStateListener ag$a;
    private static Context ah$a;
    private static int values;

    public static void toString(Context context) {
        if (ah$a == null) {
            ah$a = context;
        }
        if (setMinimumVelocity.toString("android.permission.READ_PHONE_STATE")) {
            ag$a((TelephonyManager) ah$a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE));
        }
    }

    public static Boolean HaptikSDK$b() {
        boolean z = false;
        if (ah$a == null || !setMinimumVelocity.toString("android.permission.ACCESS_NETWORK_STATE")) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ah$a.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            return Boolean.valueOf((networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(5) || networkCapabilities.hasTransport(2) || networkCapabilities.hasTransport(6) || networkCapabilities.hasTransport(4)) ? true : true);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean invoke() {
        boolean z = false;
        if (ah$a == null || !HaptikSDK$b().booleanValue()) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ah$a.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 28) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            return Boolean.valueOf(networkCapabilities.hasTransport(1));
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean HaptikSDK$a() {
        boolean z = false;
        if (ah$a == null || !HaptikSDK$b().booleanValue()) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ah$a.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 28) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            return Boolean.valueOf(networkCapabilities.hasTransport(3));
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 9) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static String HaptikSDK$c() {
        Context context = ah$a;
        if (context == null) {
            return "OTHER";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        if (!setMinimumVelocity.toString("android.permission.READ_PHONE_STATE") || telephonyManager == null) {
            return "OTHER";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            ag$a(telephonyManager);
            Log.d("AndroidNetworkUtils", "onDisplayInfoChanged2: " + values);
            return String.valueOf(values > 2 ? 20 : telephonyManager.getDataNetworkType());
        }
        return String.valueOf(telephonyManager.getNetworkType());
    }

    private static void ag$a(final TelephonyManager telephonyManager) {
        new Handler(ah$a.getMainLooper()).post(new Runnable() { // from class: o.setRampUpDuration.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (setRampUpDuration.ag$a != null) {
                        Log.d("AndroidNetworkUtils", "run: unregister phonestate listener");
                        telephonyManager.listen(setRampUpDuration.ag$a, 0);
                    }
                    PhoneStateListener unused = setRampUpDuration.ag$a = new PhoneStateListener() { // from class: o.setRampUpDuration.3.3
                        {
                            AnonymousClass3.this = this;
                        }

                        @Override // android.telephony.PhoneStateListener
                        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                            super.onDisplayInfoChanged(telephonyDisplayInfo);
                            telephonyManager.listen(this, 0);
                            int unused2 = setRampUpDuration.values = telephonyDisplayInfo.getOverrideNetworkType();
                            PhoneStateListener unused3 = setRampUpDuration.ag$a = null;
                            Log.d("AndroidNetworkUtils", "onDisplayInfoChanged: " + setRampUpDuration.values);
                        }
                    };
                    telephonyManager.listen(setRampUpDuration.ag$a, 1048576);
                } catch (IllegalStateException e) {
                    int unused2 = setRampUpDuration.values = 0;
                    Log.w("AndroidNetworkUtils", "queryPhoneState: " + e.getLocalizedMessage());
                } catch (Exception e2) {
                    Log.w("AndroidNetworkUtils", "queryPhoneState: " + e2.getLocalizedMessage());
                }
            }
        });
    }

    public static String ah$a() {
        if (HaptikSDK$a().booleanValue()) {
            return "Ethernet";
        }
        if (invoke().booleanValue()) {
            return "WiFi";
        }
        String HaptikSDK$c = HaptikSDK$c();
        Log.d("AndroidNetworkutils", "getConnectionType: " + HaptikSDK$c);
        return HaptikSDK$c;
    }

    public static int ah$b() {
        if (ah$a == null || HaptikSDK$a().booleanValue()) {
            return 1000;
        }
        if (invoke().booleanValue()) {
            if (setMinimumVelocity.toString("android.permission.ACCESS_WIFI_STATE")) {
                return ((WifiManager) ah$a.getSystemService("wifi")).getConnectionInfo().getRssi();
            }
            return 1000;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ah$a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        if (Build.VERSION.SDK_INT >= 29) {
            if (ah$a.getApplicationInfo().targetSdkVersion >= 29) {
                if (!setMinimumVelocity.toString("android.permission.ACCESS_FINE_LOCATION")) {
                    return 1000;
                }
            } else if (!setMinimumVelocity.toString("android.permission.ACCESS_FINE_LOCATION") && !setMinimumVelocity.toString("android.permission.ACCESS_COARSE_LOCATION")) {
                return 1000;
            }
        } else if (!setMinimumVelocity.toString("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1000;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null && allCellInfo.size() > 0) {
                    CellSignalStrength cellSignalStrength = null;
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo instanceof CellInfoGsm) {
                            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                            continue;
                        } else if (cellInfo instanceof CellInfoCdma) {
                            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                            continue;
                        } else if (Build.VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                            cellSignalStrength = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                            continue;
                        } else if (cellInfo instanceof CellInfoLte) {
                            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
                            continue;
                        } else if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                            cellSignalStrength = ((CellInfoTdscdma) cellInfo).getCellSignalStrength();
                            continue;
                        } else if (Build.VERSION.SDK_INT >= 30 && (cellInfo instanceof CellInfoNr)) {
                            cellSignalStrength = cellInfo.getCellSignalStrength();
                            continue;
                        }
                        if (cellSignalStrength != null) {
                            return cellSignalStrength.getDbm();
                        }
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        return 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0048 A[Catch: SecurityException -> 0x005e, TryCatch #0 {SecurityException -> 0x005e, blocks: (B:55:0x002f, B:57:0x0035, B:58:0x0042, B:60:0x0048, B:62:0x0052, B:66:0x0059), top: B:71:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String ag$a() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L5e
            android.content.Context r0 = o.setRampUpDuration.ah$a
            if (r0 == 0) goto L5e
            java.lang.Boolean r0 = invoke()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            boolean r0 = o.setMinimumVelocity.toString(r0)
            if (r0 != 0) goto L25
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = o.setMinimumVelocity.toString(r0)
            if (r0 != 0) goto L25
            goto L5e
        L25:
            android.content.Context r0 = o.setRampUpDuration.ah$a
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            android.net.wifi.WifiInfo r1 = r0.getConnectionInfo()     // Catch: java.lang.SecurityException -> L5e
            if (r1 == 0) goto L5e
            r2 = 0
            int r1 = r1.getNetworkId()     // Catch: java.lang.SecurityException -> L5e
            java.util.List r0 = r0.getConfiguredNetworks()     // Catch: java.lang.SecurityException -> L5e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.SecurityException -> L5e
        L42:
            boolean r3 = r0.hasNext()     // Catch: java.lang.SecurityException -> L5e
            if (r3 == 0) goto L57
            java.lang.Object r3 = r0.next()     // Catch: java.lang.SecurityException -> L5e
            android.net.wifi.WifiConfiguration r3 = (android.net.wifi.WifiConfiguration) r3     // Catch: java.lang.SecurityException -> L5e
            int r4 = r3.status     // Catch: java.lang.SecurityException -> L5e
            if (r4 == 0) goto L56
            int r4 = r3.networkId     // Catch: java.lang.SecurityException -> L5e
            if (r4 != r1) goto L42
        L56:
            r2 = r3
        L57:
            if (r2 == 0) goto L5e
            java.lang.String r0 = toString(r2)     // Catch: java.lang.SecurityException -> L5e
            return r0
        L5e:
            java.lang.String r0 = "NONE"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRampUpDuration.ag$a():java.lang.String");
    }

    private static String toString(WifiConfiguration wifiConfiguration) {
        return wifiConfiguration.allowedKeyManagement.get(1) ? wifiConfiguration.allowedProtocols.get(1) ? "WPA2" : "WPA" : (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) ? "EAP" : (wifiConfiguration.wepKeys.length <= 0 || wifiConfiguration.wepKeys[0] == null) ? "NONE" : "WEP";
    }

    public static void HaptikSDK$d() {
        try {
            if (ag$a != null) {
                ((TelephonyManager) ah$a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE)).listen(ag$a, 0);
            }
        } catch (Exception unused) {
        }
        ah$a = null;
        values = 0;
        ag$a = null;
    }
}
