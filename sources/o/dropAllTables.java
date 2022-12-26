package o;

import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import com.reactnativecommunity.netinfo.types.ConnectionType;
/* loaded from: classes5.dex */
public class dropAllTables extends onValidateSchema {
    private final dropAllTables$ag$a toString;

    public dropAllTables(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.toString = new dropAllTables$ag$a(this);
    }

    @Override // o.onValidateSchema
    public void valueOf() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ah$a().registerReceiver(this.toString, intentFilter);
        this.toString.ag$a(true);
        HaptikSDK$a();
    }

    @Override // o.onValidateSchema
    public void values() {
        if (this.toString.valueOf()) {
            ah$a().unregisterReceiver(this.toString);
            this.toString.ag$a(false);
        }
    }

    public void HaptikSDK$a() {
        NetworkInfo activeNetworkInfo;
        ConnectionType connectionType = ConnectionType.UNKNOWN;
        boolean z = false;
        CellularGeneration cellularGeneration = null;
        try {
            activeNetworkInfo = ag$a().getActiveNetworkInfo();
        } catch (SecurityException unused) {
            connectionType = ConnectionType.UNKNOWN;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = activeNetworkInfo.isConnected();
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    connectionType = ConnectionType.WIFI;
                } else if (type != 4) {
                    if (type == 9) {
                        connectionType = ConnectionType.ETHERNET;
                    } else if (type == 17) {
                        connectionType = ConnectionType.VPN;
                    } else if (type == 6) {
                        connectionType = ConnectionType.WIMAX;
                    } else if (type == 7) {
                        connectionType = ConnectionType.BLUETOOTH;
                    }
                }
                valueOf(connectionType, cellularGeneration, z);
            }
            connectionType = ConnectionType.CELLULAR;
            cellularGeneration = CellularGeneration.fromNetworkInfo(activeNetworkInfo);
            valueOf(connectionType, cellularGeneration, z);
        }
        connectionType = ConnectionType.NONE;
        valueOf(connectionType, cellularGeneration, z);
    }
}
