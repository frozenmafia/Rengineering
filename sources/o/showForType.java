package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes3.dex */
public final class showForType {
    private static final ConcurrentMap<String, getDescendants> ah$a = new ConcurrentHashMap();

    public static getDescendants values(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, getDescendants> concurrentMap = ah$a;
        getDescendants getdescendants = concurrentMap.get(packageName);
        if (getdescendants == null) {
            getDescendants showfortype = toString(context);
            getDescendants putIfAbsent = concurrentMap.putIfAbsent(packageName, showfortype);
            return putIfAbsent == null ? showfortype : putIfAbsent;
        }
        return getdescendants;
    }

    private static getDescendants toString(Context context) {
        return new hideForType(values(ag$a(context)));
    }

    private static String values(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    private static PackageInfo ag$a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }
}
