package com.app.dream11.chat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public class NotificationDeleteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ChatNotificationHelper.clearNotifications(context);
    }
}
