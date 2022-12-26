package com.apxor.androidsdk.plugins.push;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.utils.Logger;
/* loaded from: classes6.dex */
public class ActionButtonReceiver extends BroadcastReceiver {
    private static final String a = "ActionButtonReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("apx_notification_id", 0);
        try {
            Intent intent2 = new Intent(context, Class.forName(intent.getStringExtra(Constants.ACTIVITY)));
            intent2.putExtra("notification_id", intent.getStringExtra("notification_id"));
            intent2.putExtra("apx_notification_id", intent.getIntExtra("apx_notification_id", 0));
            intent2.putExtra("apx_action_name", intent.getStringExtra("apx_action_name"));
            intent2.setFlags(335544320);
            context.startActivity(intent2);
        } catch (ClassNotFoundException unused) {
            Logger.e(a, "Class not found");
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(intExtra);
        } else {
            Logger.w(a, "Couldn't cancel notification as notification manager was null");
        }
    }
}
