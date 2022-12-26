package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final class attachController {
    private static final String ag$a;
    public static final attachController toString = new attachController();

    private attachController() {
    }

    static {
        String name = attachController.class.getName();
        runAnimators.ah$a(name, "Validate::class.java.name");
        ag$a = name;
    }

    public static final void ah$a(Object obj, String str) {
        runAnimators.ag$a(str, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    public static final <T> void values(Collection<? extends T> collection, String str) {
        runAnimators.ag$a(collection, TtmlNode.RUBY_CONTAINER);
        runAnimators.ag$a(str, "name");
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
    }

    public static final <T> void ag$a(Collection<? extends T> collection, String str) {
        runAnimators.ag$a(collection, TtmlNode.RUBY_CONTAINER);
        runAnimators.ag$a(str, "name");
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static final <T> void ah$a(Collection<? extends T> collection, String str) {
        runAnimators.ag$a(collection, TtmlNode.RUBY_CONTAINER);
        runAnimators.ag$a(str, "name");
        ag$a(collection, str);
        values(collection, str);
    }

    public static final String ah$a(String str, String str2) {
        runAnimators.ag$a(str2, "name");
        boolean z = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            }
        }
        if (z) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be null or empty").toString());
    }

    public static final void values(String str, String str2) {
        runAnimators.ag$a(str, "arg");
        runAnimators.ag$a(str2, "name");
        if (str.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
    }

    public static final void values() {
        boolean z;
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        z = DefaultSpecialEffectsController.AnonymousClass8.ak$a.get();
        if (!z) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final String valueOf() {
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        String HaptikSDK$a = DefaultSpecialEffectsController.AnonymousClass8.HaptikSDK$a();
        if (HaptikSDK$a != null) {
            return HaptikSDK$a;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final String ag$a() {
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        String HaptikSDK$d = DefaultSpecialEffectsController.AnonymousClass8.HaptikSDK$d();
        if (HaptikSDK$d != null) {
            return HaptikSDK$d;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final void values(Context context) {
        runAnimators.ag$a(context, "context");
        valueOf(context, true);
    }

    public static final void valueOf(Context context, boolean z) {
        runAnimators.ag$a(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!(!z)) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
            }
            Log.w(ag$a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static final void ah$a(Context context) {
        runAnimators.ag$a(context, "context");
        values(context, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void values(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            o.runAnimators.ag$a(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L18
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 != 0) goto L33
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L27
            java.lang.String r4 = o.attachController.ag$a
            android.util.Log.w(r4, r5)
            goto L33
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.attachController.values(android.content.Context, boolean):void");
    }

    public static final boolean valueOf(Context context, String str) {
        List<ResolveInfo> list;
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list != null) {
            boolean z = false;
            for (ResolveInfo resolveInfo : list) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!runAnimators.values((Object) activityInfo.name, (Object) "com.facebook.CustomTabActivity") || !runAnimators.values((Object) activityInfo.packageName, (Object) context.getPackageName())) {
                    return false;
                }
                z = true;
            }
            return z;
        }
        return false;
    }

    public static final void ag$a(Context context) {
        runAnimators.ag$a(context, "context");
        String valueOf = valueOf();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String values = runAnimators.values("com.facebook.app.FacebookContentProvider", (Object) valueOf);
            if (packageManager.resolveContentProvider(values, 0) != null) {
                return;
            }
            setCanRemoveViews setcanremoveviews = setCanRemoveViews.ah$a;
            String format = String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", Arrays.copyOf(new Object[]{values}, 1));
            runAnimators.ah$a(format, "java.lang.String.format(format, *args)");
            throw new IllegalStateException(format.toString());
        }
    }
}
