package com.apxor.androidsdk.plugins.push;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.apxor.androidsdk.core.utils.Logger;
import com.google.firebase.messaging.RemoteMessage;
/* loaded from: classes6.dex */
public class ApxorPushAPI {
    private static final String a = "ApxorPushAPI";

    public static void createNotificationChannel(Context context, String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            notificationChannel.setDescription(str3);
            notificationChannel.setImportance(5);
            try {
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
            } catch (Exception e) {
                Logger.e(a, "createNotificationChannel", e);
            }
        }
    }

    public static void createNotificationChannel(Context context, String str, String str2, String str3, String str4) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            notificationChannel.setDescription(str3);
            notificationChannel.setImportance(5);
            notificationChannel.setGroup(str4);
            try {
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
            } catch (Exception e) {
                Logger.e(a, "createNotificationChannel", e);
            }
        }
    }

    public static void createNotificationChannelGroup(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannelGroup(new NotificationChannelGroup(str, str2));
            } catch (Exception e) {
                Logger.e(a, "createNotificationChannelGroup", e);
            }
        }
    }

    public static void deleteNotificationChannel(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel(str);
            } catch (Exception e) {
                Logger.e(a, "deleteNotificationChannel", e);
            }
        }
    }

    public static void deleteNotificationChannelGroup(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannelGroup(str);
            } catch (Exception e) {
                Logger.e(a, "deleteNotificationChannelGroup", e);
            }
        }
    }

    public static void handleNotification(RemoteMessage remoteMessage, Context context) {
        new a().a(remoteMessage, context);
    }

    public static boolean isApxorNotification(RemoteMessage remoteMessage) {
        if (remoteMessage.values() == null || !remoteMessage.values().equals(PushPlugin.SENDER_ID) || remoteMessage.ag$a().size() <= 0) {
            return false;
        }
        return !Boolean.valueOf(remoteMessage.ag$a().get("silent")).booleanValue();
    }

    public static boolean isApxorSilentNotification(RemoteMessage remoteMessage) {
        if (remoteMessage.values() == null || !remoteMessage.values().equals(PushPlugin.SENDER_ID) || remoteMessage.ag$a().size() <= 0) {
            return false;
        }
        return Boolean.valueOf(remoteMessage.ag$a().get("silent")).booleanValue();
    }
}
