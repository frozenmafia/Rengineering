package com.clevertap.android.sdk.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import o.setBoundsInScreen;
import o.setFocusable;
@Deprecated(since = "4.3.0")
/* loaded from: classes4.dex */
public class CTPushNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent launchIntentForPackage;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("wzrk_dl")) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("wzrk_dl")));
                setFocusable.valueOf(context, launchIntentForPackage);
            } else {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    return;
                }
            }
            CleverTapAPI.values(context, extras);
            launchIntentForPackage.setFlags(872415232);
            launchIntentForPackage.putExtras(extras);
            launchIntentForPackage.putExtra("wzrk_from", "CTPushNotificationReceiver");
            if (extras.containsKey("close_system_dialogs") && extras.getBoolean("close_system_dialogs")) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            context.startActivity(launchIntentForPackage);
            setBoundsInScreen.ag$a("CTPushNotificationReceiver: handled notification: " + extras.toString());
        } catch (Throwable th) {
            setBoundsInScreen.valueOf("CTPushNotificationReceiver: error handling notification", th);
        }
    }
}
