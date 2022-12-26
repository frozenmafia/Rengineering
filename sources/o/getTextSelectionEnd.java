package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
/* loaded from: classes.dex */
public final class getTextSelectionEnd {
    public static boolean valueOf = false;

    public static void ah$a(Application application, final String str) {
        synchronized (getTextSelectionEnd.class) {
            if (application == null) {
                setBoundsInScreen.valueOf("Application instance is null/system API is too old");
            } else if (valueOf) {
                setBoundsInScreen.values("Lifecycle callbacks have already been registered");
            } else {
                valueOf = true;
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: o.getTextSelectionEnd.5
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        String str2 = str;
                        if (str2 != null) {
                            CleverTapAPI.toString(activity, str2);
                        } else {
                            CleverTapAPI.ag$a(activity);
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        CleverTapAPI.HaptikSDK$b();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        String str2 = str;
                        if (str2 != null) {
                            CleverTapAPI.valueOf(activity, str2);
                        } else {
                            CleverTapAPI.values(activity);
                        }
                    }
                });
                setBoundsInScreen.valueOf("Activity Lifecycle Callback successfully registered");
            }
        }
    }

    public static void values(Application application) {
        synchronized (getTextSelectionEnd.class) {
            ah$a(application, null);
        }
    }
}
