package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;
import o.IMultiInstanceInvalidationService;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class order {
    private final Context ag$a;
    private final JSONObject ah$a;
    private final unique valueOf;

    private String ag$a(int i) {
        switch (i) {
            case 10:
            case 13:
                return "OFF";
            case 11:
            case 12:
                return "ON";
            default:
                return "UNKNOWN";
        }
    }

    private String ah$a(int i) {
        switch (i) {
            case 1:
                return "ABSENT";
            case 2:
                return "PIN_REQUIRED";
            case 3:
                return "PUK_REQUIRED";
            case 4:
                return "NETWORK_LOCKED";
            case 5:
                return "READY";
            case 6:
                return "NOT_READY";
            case 7:
                return "PERM_DISABLED";
            case 8:
                return "CARD_IO_ERROR";
            case 9:
                return "CARD_RESTRICTED";
            default:
                return "UNKNOWN";
        }
    }

    private String toString(int i) {
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return com.apxor.androidsdk.core.ce.Constants.LTE;
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            case 16:
                return "GSM";
            case 17:
                return "SCDMA";
            case 18:
                return "IWLAN";
            default:
                return "UNKNOWN";
        }
    }

    private String valueOf(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SUSPENDED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private String values(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIP" : "CDMA" : "GSM" : "NONE";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public order(Context context, unique uniqueVar, JSONObject jSONObject) {
        this.ag$a = context;
        this.valueOf = uniqueVar;
        this.ah$a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf() {
        HaptikSDK$b();
        ah$a();
        invoke();
        values();
        ag$a();
    }

    private void HaptikSDK$b() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.ag$a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                this.valueOf.ag$a("telephony", "TelephonyManager is null");
                return;
            }
            this.valueOf.valueOf("b6", ah$a(telephonyManager.getSimState()));
            this.valueOf.valueOf("b7", values(telephonyManager.getPhoneType()));
            this.valueOf.valueOf("b8", telephonyManager.getNetworkOperatorName());
            this.valueOf.valueOf("b9", telephonyManager.getNetworkCountryIso());
            this.valueOf.valueOf("c1", telephonyManager.getSimOperatorName());
            this.valueOf.valueOf("c3", telephonyManager.getSimCountryIso());
            this.valueOf.valueOf("c5", valueOf(telephonyManager.getDataState()));
            if (Build.VERSION.SDK_INT >= 30) {
                this.valueOf.valueOf("c6", Integer.valueOf(telephonyManager.getActiveModemCount()));
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.valueOf.valueOf("c6", Integer.valueOf(telephonyManager.getPhoneCount()));
            }
            if (androidx.core.content.ContextCompat.checkSelfPermission(this.ag$a, "android.permission.READ_PHONE_STATE") == 0) {
                if (Build.VERSION.SDK_INT >= 24) {
                    this.valueOf.valueOf("c4", toString(telephonyManager.getDataNetworkType()));
                } else {
                    this.valueOf.valueOf("c4", toString(telephonyManager.getNetworkType()));
                }
                ag$a(telephonyManager);
                return;
            }
            this.valueOf.ag$a("b4", "READ_PHONE_STATE permission is not added in app manifest or denied by user");
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectTelephonyData: ", e);
            this.valueOf.ag$a("telephony", e.toString());
        }
    }

    private void ag$a(TelephonyManager telephonyManager) {
        String deviceId;
        if (Build.VERSION.SDK_INT <= 28) {
            if (Build.VERSION.SDK_INT >= 26) {
                deviceId = telephonyManager.getImei();
                if (deviceId == null) {
                    deviceId = telephonyManager.getMeid();
                }
            } else {
                deviceId = telephonyManager.getDeviceId();
            }
            this.valueOf.valueOf("b4", deviceId);
        }
    }

    private void ah$a() {
        try {
            if (IMultiInstanceInvalidationService.Stub.Proxy.valueOf(this.ag$a, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.ag$a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null) {
                            boolean z = false;
                            if (networkCapabilities.hasTransport(0)) {
                                this.valueOf.valueOf("c7", "Cellular");
                            } else if (networkCapabilities.hasTransport(1)) {
                                this.valueOf.valueOf("c7", "Wifi");
                            } else if (networkCapabilities.hasTransport(3)) {
                                this.valueOf.valueOf("c7", "Ethernet");
                            } else {
                                this.valueOf.valueOf("c7", "Unknown");
                                this.valueOf.valueOf("c8", Boolean.valueOf(z));
                                this.valueOf.valueOf("c9", Boolean.valueOf(!networkCapabilities.hasCapability(18)));
                                return;
                            }
                            z = true;
                            this.valueOf.valueOf("c8", Boolean.valueOf(z));
                            this.valueOf.valueOf("c9", Boolean.valueOf(!networkCapabilities.hasCapability(18)));
                            return;
                        }
                        this.valueOf.ag$a("connectivity", "ConnectivityManager or NetworkCapabilities is null");
                        return;
                    } else if (connectivityManager.getActiveNetworkInfo() != null) {
                        this.valueOf.valueOf("c7", connectivityManager.getActiveNetworkInfo().getTypeName());
                        this.valueOf.valueOf("c8", Boolean.valueOf(connectivityManager.getActiveNetworkInfo().isConnected()));
                        this.valueOf.valueOf("c9", Boolean.valueOf(connectivityManager.getActiveNetworkInfo().isRoaming()));
                        return;
                    } else {
                        return;
                    }
                }
                this.valueOf.ag$a("connectivity", "ConnectivityManager or NetworkCapabilities is null");
                return;
            }
            this.valueOf.ag$a("connectivity", "ACCESS_NETWORK_STATE permission is not added in app manifest");
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectConnectivityData: ", e);
            this.valueOf.ag$a("connectivity", e.toString());
        }
    }

    private void invoke() {
        try {
            WifiManager wifiManager = (WifiManager) this.ag$a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                this.valueOf.ag$a("wifi", "WifiManager is null");
                return;
            }
            this.valueOf.valueOf("d1", Boolean.valueOf(wifiManager.isWifiEnabled()));
            if (IMultiInstanceInvalidationService.Stub.Proxy.valueOf(this.ag$a, "android.permission.ACCESS_WIFI_STATE")) {
                if (wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    this.valueOf.valueOf("d3", Integer.valueOf(connectionInfo.getLinkSpeed()));
                    this.valueOf.valueOf("d4", Integer.valueOf(WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5)));
                    return;
                }
                return;
            }
            this.valueOf.ag$a("wifi", "ACCESS_WIFI_STATE permission is not added in app manifest");
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectWifiData: ", e);
            this.valueOf.ag$a("wifi", e.toString());
        }
    }

    private void values() {
        String str;
        try {
            WifiManager wifiManager = (WifiManager) this.ag$a.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null && IMultiInstanceInvalidationService.Stub.Proxy.valueOf(this.ag$a, "android.permission.ACCESS_WIFI_STATE")) {
                int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
                str = String.format(Locale.getDefault(), "%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
            } else {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                String str2 = null;
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            str2 = nextElement.getHostAddress();
                        }
                    }
                }
                str = str2;
            }
            this.valueOf.valueOf("d6", str);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getDeviceIpAddress: ", e);
            this.valueOf.ag$a("d6", e.toString());
        }
    }

    private void ag$a() {
        try {
            BluetoothAdapter adapter = ((BluetoothManager) this.ag$a.getApplicationContext().getSystemService("bluetooth")).getAdapter();
            if (adapter != null) {
                this.valueOf.valueOf("f7", ag$a(adapter.getState()));
                if (!IMultiInstanceInvalidationService.Stub.Proxy.valueOf(this.ag$a, "android.permission.BLUETOOTH") && !IMultiInstanceInvalidationService.Stub.Proxy.valueOf(this.ag$a, "android.permission.BLUETOOTH_CONNECT")) {
                    this.valueOf.ag$a("f6", "BLUETOOTH permission is not added in app manifest");
                }
                this.valueOf.valueOf("f6", adapter.getName());
            } else {
                this.valueOf.ag$a("bluetooth", "BluetoothAdapter is null");
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception Occurred in collectBatteryData: ", e);
            this.valueOf.ag$a("bluetooth", e.toString());
        }
    }
}
