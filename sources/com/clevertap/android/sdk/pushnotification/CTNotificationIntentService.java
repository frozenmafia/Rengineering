package com.clevertap.android.sdk.pushnotification;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import o.AccessibilityNodeProviderCompat;
import o.getTargetForRegion;
import o.setBoundsInScreen;
import o.setFocusable;
import o.setFullScreen;
@Deprecated(since = "4.3.0")
/* loaded from: classes4.dex */
public class CTNotificationIntentService extends IntentService {
    public static final String MAIN_ACTION = "com.clevertap.PUSH_EVENT";
    public static final String TYPE_BUTTON_CLICK = "com.clevertap.ACTION_BUTTON_CLICK";
    private getTargetForRegion mActionButtonClickHandler;

    public CTNotificationIntentService() {
        super("CTNotificationIntentService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16 accessibilityNodeProviderApi16;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        accessibilityNodeProviderApi16 = CleverTapAPI.valueOf;
        if (setFullScreen.toString(extras) && accessibilityNodeProviderApi16 != null) {
            this.mActionButtonClickHandler = (getTargetForRegion) accessibilityNodeProviderApi16;
        } else {
            this.mActionButtonClickHandler = (getTargetForRegion) setFullScreen.ag$a();
        }
        if (TYPE_BUTTON_CLICK.equals(extras.getString("ct_type"))) {
            setBoundsInScreen.values("CTNotificationIntentService handling com.clevertap.ACTION_BUTTON_CLICK");
            handleActionButtonClick(extras);
            return;
        }
        setBoundsInScreen.values("CTNotificationIntentService: unhandled intent " + intent.getAction());
    }

    private void handleActionButtonClick(Bundle bundle) {
        Intent launchIntentForPackage;
        NotificationManager notificationManager;
        try {
            boolean z = bundle.getBoolean("autoCancel", false);
            int i = bundle.getInt("notificationId", -1);
            String string = bundle.getString("dl");
            Context applicationContext = getApplicationContext();
            if (!this.mActionButtonClickHandler.ag$a(applicationContext, bundle, i) && Build.VERSION.SDK_INT < 31) {
                if (string != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(string));
                    setFocusable.valueOf(applicationContext, launchIntentForPackage);
                } else {
                    launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
                }
                if (launchIntentForPackage == null) {
                    setBoundsInScreen.values("CTNotificationService: create launch intent.");
                    return;
                }
                launchIntentForPackage.setFlags(872415232);
                launchIntentForPackage.putExtras(bundle);
                launchIntentForPackage.removeExtra("dl");
                String string2 = bundle.getString("pt_dismiss_on_click", "");
                if (z && i > -1 && string2.isEmpty() && (notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification")) != null) {
                    notificationManager.cancel(i);
                }
                sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                startActivity(launchIntentForPackage);
            }
        } catch (Throwable th) {
            setBoundsInScreen.values("CTNotificationService: unable to process action button click:  " + th.getLocalizedMessage());
        }
    }
}
