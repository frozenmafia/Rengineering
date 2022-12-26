package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationReceiver;
import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public class setParcelableData {
    public static PendingIntent ah$a(Bundle bundle, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ag$a(bundle, context);
        }
        Intent intent = new Intent(context, CTPushNotificationReceiver.class);
        intent.putExtras(bundle);
        intent.removeExtra("wzrk_acts");
        int i = C.BUFFER_FLAG_FIRST_SAMPLE;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        }
        return PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent, i);
    }

    public static PendingIntent ag$a(Bundle bundle, Context context) {
        Intent launchIntentForPackage;
        if (bundle.containsKey("wzrk_dl") && bundle.getString("wzrk_dl") != null) {
            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(bundle.getString("wzrk_dl")));
            setFocusable.valueOf(context, launchIntentForPackage);
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return null;
            }
        }
        launchIntentForPackage.setFlags(872415232);
        launchIntentForPackage.putExtras(bundle);
        launchIntentForPackage.removeExtra("wzrk_acts");
        int i = C.BUFFER_FLAG_FIRST_SAMPLE;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        }
        return PendingIntent.getActivity(context, (int) System.currentTimeMillis(), launchIntentForPackage, i);
    }
}
