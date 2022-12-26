package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;
import o.animateAddImpl;
/* loaded from: classes5.dex */
public final class PackageManagerCompat {
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final String LOG_TAG = "PackageManagerCompat";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    public static animateAddImpl<Integer> getUnusedAppRestrictionsStatus(Context context) {
        ResolvableFuture<Integer> create = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            create.set(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return create;
        } else if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            create.set(1);
            return create;
        } else {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i < 30) {
                create.set(0);
                Log.e(LOG_TAG, "Target SDK version below API 30");
                return create;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                    create.set(Integer.valueOf(i >= 31 ? 5 : 4));
                } else {
                    create.set(2);
                }
                return create;
            } else if (Build.VERSION.SDK_INT == 30) {
                create.set(Integer.valueOf(Api30Impl.areUnusedAppRestrictionsEnabled(context) ? 4 : 2));
                return create;
            } else {
                final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
                create.addListener(new Runnable() { // from class: androidx.core.content.PackageManagerCompat$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnusedAppRestrictionsBackportServiceConnection.this.disconnectFromService();
                    }
                }, Executors.newSingleThreadExecutor());
                unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(create);
                return create;
            }
        }
    }

    public static boolean areUnusedAppRestrictionsAvailable(PackageManager packageManager) {
        return (Build.VERSION.SDK_INT >= 30) || ((Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT < 30) && (getPermissionRevocationVerifierApp(packageManager) != null));
    }

    public static String getPermissionRevocationVerifierApp(PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    /* loaded from: classes5.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }
}
