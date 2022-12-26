package com.appsamurai.storyly.util.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import o.canScrollVertically;
/* loaded from: classes3.dex */
public final class StorylyNotificationReceiver extends BroadcastReceiver {
    public static final toString toString = new toString();

    /* loaded from: classes3.dex */
    public static final class toString {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent launchIntentForPackage;
        if (intent == null) {
            return;
        }
        Object systemService = context == null ? null : context.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName())) == null) {
            return;
        }
        launchIntentForPackage.setPackage(context.getPackageName());
        launchIntentForPackage.setAction("com.appsamurai.storyly.ACTION_COUNTDOWN_NOTIFICATION");
        Bundle extras = intent.getExtras();
        launchIntentForPackage.putExtra("storyly-notification-outlink", extras == null ? null : extras.getString("storyly-notification-outlink"));
        launchIntentForPackage.setFlags(launchIntentForPackage.getFlags() | 32);
        Parcelable parcelableExtra = intent.getParcelableExtra("notification");
        Notification notification = parcelableExtra instanceof Notification ? (Notification) parcelableExtra : null;
        if (notification == null) {
            return;
        }
        notification.contentIntent = PendingIntent.getActivity(context, intent.getIntExtra("storyly-notification-id", 0), launchIntentForPackage, canScrollVertically.ag$a(C.BUFFER_FLAG_FIRST_SAMPLE));
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("storyly-notification-channel-id", "storyly-notification-channel-name", 4));
        }
        notificationManager.notify(intent.getIntExtra("storyly-notification-id", 0), notification);
    }
}
