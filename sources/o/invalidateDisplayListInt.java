package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes5.dex */
public class invalidateDisplayListInt {
    private static invalidateDisplayListInt toString;
    private String ag$a = null;
    private Boolean valueOf = null;
    private Boolean values = null;
    private final Queue<Intent> ah$a = new ArrayDeque();

    public static invalidateDisplayListInt valueOf() {
        invalidateDisplayListInt invalidatedisplaylistint;
        synchronized (invalidateDisplayListInt.class) {
            if (toString == null) {
                toString = new invalidateDisplayListInt();
            }
            invalidatedisplaylistint = toString;
        }
        return invalidatedisplaylistint;
    }

    private invalidateDisplayListInt() {
    }

    public Intent ag$a() {
        return this.ah$a.poll();
    }

    public int values(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.ah$a.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return ag$a(context, intent2);
    }

    private int ag$a(Context context, Intent intent) {
        ComponentName startService;
        String invalidatedisplaylistint = toString(context, intent);
        if (invalidatedisplaylistint != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(invalidatedisplaylistint);
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), invalidatedisplaylistint);
        }
        try {
            if (valueOf(context)) {
                startService = bindViewToPosition.valueOf(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    private String toString(Context context, Intent intent) {
        synchronized (this) {
            String str = this.ag$a;
            if (str != null) {
                return str;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && resolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                    if (serviceInfo.name.startsWith(".")) {
                        String valueOf = String.valueOf(context.getPackageName());
                        String valueOf2 = String.valueOf(serviceInfo.name);
                        this.ag$a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    } else {
                        this.ag$a = serviceInfo.name;
                    }
                    return this.ag$a;
                }
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str2);
                sb.append("/");
                sb.append(str3);
                Log.e("FirebaseInstanceId", sb.toString());
                return null;
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean valueOf(Context context) {
        if (this.valueOf == null) {
            this.valueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.valueOf.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.valueOf.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean toString(Context context) {
        if (this.values == null) {
            this.values = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.valueOf.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.values.booleanValue();
    }
}
