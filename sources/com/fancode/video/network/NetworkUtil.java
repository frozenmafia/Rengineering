package com.fancode.video.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class NetworkUtil {
    private static NetworkUtil valueOf;
    private int values = 0;
    private List<NetworkUtil$ag$a> toString = new ArrayList();
    private NetworkChangeReceiver ag$a = new NetworkChangeReceiver();
    private final ConnectivityManager.NetworkCallback ah$a = new ConnectivityManager.NetworkCallback() { // from class: com.fancode.video.network.NetworkUtil.1
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            NetworkUtil.this.values = 1;
            NetworkUtil networkUtil = NetworkUtil.this;
            networkUtil.toString(networkUtil.values);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            NetworkUtil.this.values = 0;
            NetworkUtil networkUtil = NetworkUtil.this;
            networkUtil.toString(networkUtil.values);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            NetworkUtil.this.values = 0;
            NetworkUtil networkUtil = NetworkUtil.this;
            networkUtil.toString(networkUtil.values);
        }
    };

    public static NetworkUtil ag$a() {
        if (valueOf == null) {
            valueOf = new NetworkUtil();
        }
        return valueOf;
    }

    public void ah$a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(this.ah$a);
            return;
        }
        context.registerReceiver(this.ag$a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public int valueOf() {
        return this.values;
    }

    public void values(NetworkUtil$ag$a networkUtil$ag$a) {
        if (this.toString.contains(networkUtil$ag$a)) {
            return;
        }
        this.toString.add(networkUtil$ag$a);
    }

    public void valueOf(NetworkUtil$ag$a networkUtil$ag$a) {
        if (this.toString.contains(networkUtil$ag$a)) {
            return;
        }
        this.toString.add(networkUtil$ag$a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toString(int i) {
        if (i != this.values) {
            this.values = i;
            for (NetworkUtil$ag$a networkUtil$ag$a : this.toString) {
                networkUtil$ag$a.toString(this.values);
            }
        }
    }

    public int values(Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (connectivityManager.getActiveNetwork() != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                    return (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3)) ? 1 : 0;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 9)) {
                    return 1;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* loaded from: classes4.dex */
    public class NetworkChangeReceiver extends BroadcastReceiver {
        public NetworkChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int values = NetworkUtil.this.values(context);
                Log.e("NetworkChangeReceiver", "The network status is " + values);
                if (values == 0) {
                    Log.e("NetworkChangeReceiver", "Not connected");
                    NetworkUtil.this.toString(0);
                    return;
                }
                Log.e("NetworkChangeReceiver", "Is connected");
                NetworkUtil.this.toString(1);
            }
        }
    }
}
