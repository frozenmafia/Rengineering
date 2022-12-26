package o;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import o.RoomOpenHelper;
/* loaded from: classes5.dex */
class RoomOpenHelper$ValidationResult$ag$a extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ RoomOpenHelper.ValidationResult values;

    private RoomOpenHelper$ValidationResult$ag$a(RoomOpenHelper.ValidationResult validationResult) {
        this.values = validationResult;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        RoomOpenHelper.ValidationResult.ag$a(this.values, network);
        RoomOpenHelper.ValidationResult.valueOf(this.values, 250);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i) {
        RoomOpenHelper.ValidationResult.ag$a(this.values, network);
        this.values.HaptikSDK$c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        RoomOpenHelper.ValidationResult.ag$a(this.values, null);
        RoomOpenHelper.ValidationResult.values(this.values, null);
        this.values.HaptikSDK$c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        RoomOpenHelper.ValidationResult.ag$a(this.values, null);
        RoomOpenHelper.ValidationResult.values(this.values, null);
        this.values.HaptikSDK$c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        RoomOpenHelper.ValidationResult.ag$a(this.values, network);
        RoomOpenHelper.ValidationResult.values(this.values, networkCapabilities);
        this.values.HaptikSDK$c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        if (RoomOpenHelper.ValidationResult.ah$a(this.values) != null) {
            RoomOpenHelper.ValidationResult.ag$a(this.values, network);
        }
        RoomOpenHelper.ValidationResult.valueOf(this.values, 250);
    }
}
