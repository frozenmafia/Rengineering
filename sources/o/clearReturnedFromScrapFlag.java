package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class clearReturnedFromScrapFlag implements Runnable {
    private static Boolean ah$a;
    private static Boolean toString;
    private static final Object values = new Object();
    private final PowerManager.WakeLock HaptikSDK$b;
    private final clearOldPosition HaptikSDK$c;
    private final Context ag$a;
    private final long ah$b;
    private final attachAccessibilityDelegateOnBind valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public clearReturnedFromScrapFlag(clearOldPosition clearoldposition, Context context, attachAccessibilityDelegateOnBind attachaccessibilitydelegateonbind, long j) {
        this.HaptikSDK$c = clearoldposition;
        this.ag$a = context;
        this.ah$b = j;
        this.valueOf = attachaccessibilitydelegateonbind;
        this.HaptikSDK$b = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [o.clearReturnedFromScrapFlag$ah$a] */
    @Override // java.lang.Runnable
    public void run() {
        if (valueOf(this.ag$a)) {
            this.HaptikSDK$b.acquire(setDy.toString);
        }
        try {
            try {
                this.HaptikSDK$c.valueOf(true);
                if (!this.valueOf.HaptikSDK$a()) {
                    this.HaptikSDK$c.valueOf(false);
                    if (valueOf(this.ag$a)) {
                        try {
                            this.HaptikSDK$b.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (values(this.ag$a) && !ah$a()) {
                    new BroadcastReceiver(this) { // from class: o.clearReturnedFromScrapFlag$ah$a
                        private clearReturnedFromScrapFlag ah$a;

                        {
                            this.ah$a = this;
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            boolean ah$a2;
                            boolean valueOf;
                            clearOldPosition clearoldposition;
                            synchronized (this) {
                                clearReturnedFromScrapFlag clearreturnedfromscrapflag = this.ah$a;
                                if (clearreturnedfromscrapflag == null) {
                                    return;
                                }
                                ah$a2 = clearreturnedfromscrapflag.ah$a();
                                if (ah$a2) {
                                    valueOf = clearReturnedFromScrapFlag.valueOf();
                                    if (valueOf) {
                                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                                    }
                                    clearoldposition = this.ah$a.HaptikSDK$c;
                                    clearoldposition.ah$a(this.ah$a, 0L);
                                    context.unregisterReceiver(this);
                                    this.ah$a = null;
                                }
                            }
                        }

                        public void ah$a() {
                            boolean valueOf;
                            Context context;
                            valueOf = clearReturnedFromScrapFlag.valueOf();
                            if (valueOf) {
                                Log.d("FirebaseMessaging", "Connectivity change received registered");
                            }
                            context = clearReturnedFromScrapFlag.this.ag$a;
                            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        }
                    }.ah$a();
                    if (valueOf(this.ag$a)) {
                        try {
                            this.HaptikSDK$b.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.HaptikSDK$c.ah$b()) {
                        this.HaptikSDK$c.valueOf(false);
                    } else {
                        this.HaptikSDK$c.values(this.ah$b);
                    }
                    if (valueOf(this.ag$a)) {
                        try {
                            this.HaptikSDK$b.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.HaptikSDK$c.valueOf(false);
                if (valueOf(this.ag$a)) {
                    try {
                        this.HaptikSDK$b.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (valueOf(this.ag$a)) {
                try {
                    this.HaptikSDK$b.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ah$a() {
        boolean z;
        synchronized (this) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.ag$a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean valueOf() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    private static boolean valueOf(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (values) {
            Boolean bool = toString;
            if (bool == null) {
                booleanValue = ah$a(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            toString = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean values(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (values) {
            Boolean bool = ah$a;
            if (bool == null) {
                booleanValue = ah$a(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            ah$a = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean ah$a(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", toString(str));
        }
        return z;
    }

    private static String toString(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }
}
