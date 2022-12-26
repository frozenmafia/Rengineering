package o;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.RemoteException;
import android.os.storage.StorageManager;
/* loaded from: classes3.dex */
public final class hasExplicitFocusable {
    public static /* synthetic */ Intent ag$a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, setImportantForAccessibility setimportantforaccessibility, int i, Object obj) {
        if ((i & 4) != 0) {
            setimportantforaccessibility = null;
        }
        return values(context, broadcastReceiver, intentFilter, setimportantforaccessibility);
    }

    public static final Intent values(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, setImportantForAccessibility setimportantforaccessibility) {
        runAnimators.valueOf(context, "$this$registerReceiverSafe");
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RemoteException e) {
            if (setimportantforaccessibility != null) {
                setimportantforaccessibility.toString("Failed to register receiver", e);
                return null;
            }
            return null;
        } catch (IllegalArgumentException e2) {
            if (setimportantforaccessibility != null) {
                setimportantforaccessibility.toString("Failed to register receiver", e2);
                return null;
            }
            return null;
        } catch (SecurityException e3) {
            if (setimportantforaccessibility != null) {
                setimportantforaccessibility.toString("Failed to register receiver", e3);
                return null;
            }
            return null;
        }
    }

    public static final void values(Context context, BroadcastReceiver broadcastReceiver, setImportantForAccessibility setimportantforaccessibility) {
        runAnimators.valueOf(context, "$this$unregisterReceiverSafe");
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (RemoteException e) {
            if (setimportantforaccessibility != null) {
                setimportantforaccessibility.toString("Failed to register receiver", e);
            }
        } catch (IllegalArgumentException e2) {
            if (setimportantforaccessibility != null) {
                setimportantforaccessibility.toString("Failed to register receiver", e2);
            }
        } catch (SecurityException e3) {
            if (setimportantforaccessibility != null) {
                setimportantforaccessibility.toString("Failed to register receiver", e3);
            }
        }
    }

    public static final ActivityManager toString(Context context) {
        runAnimators.valueOf(context, "$this$getActivityManager");
        try {
            Object systemService = context.getSystemService(com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final ConnectivityManager valueOf(Context context) {
        runAnimators.valueOf(context, "$this$getConnectivityManager");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final StorageManager ag$a(Context context) {
        runAnimators.valueOf(context, "$this$getStorageManager");
        try {
            Object systemService = context.getSystemService("storage");
            if (!(systemService instanceof StorageManager)) {
                systemService = null;
            }
            return (StorageManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final LocationManager ah$a(Context context) {
        runAnimators.valueOf(context, "$this$getLocationManager");
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
