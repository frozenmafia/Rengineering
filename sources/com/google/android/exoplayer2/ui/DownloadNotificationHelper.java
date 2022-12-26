package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;
/* loaded from: classes7.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list) {
        return buildProgressNotification(context, i, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Notification buildProgressNotification(android.content.Context r22, int r23, android.app.PendingIntent r24, java.lang.String r25, java.util.List<com.google.android.exoplayer2.offline.Download> r26, int r27) {
        /*
            r21 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
        La:
            int r10 = r26.size()
            if (r3 >= r10) goto L4a
            r10 = r26
            java.lang.Object r11 = r10.get(r3)
            com.google.android.exoplayer2.offline.Download r11 = (com.google.android.exoplayer2.offline.Download) r11
            int r12 = r11.state
            if (r12 == 0) goto L46
            r13 = 2
            if (r12 == r13) goto L28
            r13 = 5
            if (r12 == r13) goto L26
            r13 = 7
            if (r12 == r13) goto L28
            goto L47
        L26:
            r6 = 1
            goto L47
        L28:
            float r4 = r11.getPercentDownloaded()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L34
            float r2 = r2 + r4
            r8 = 0
        L34:
            long r11 = r11.getBytesDownloaded()
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            r9 = r9 | r4
            int r7 = r7 + 1
            r4 = 1
            goto L47
        L46:
            r5 = 1
        L47:
            int r3 = r3 + 1
            goto La
        L4a:
            if (r4 == 0) goto L4f
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_downloading
            goto L6a
        L4f:
            if (r5 == 0) goto L66
            if (r27 == 0) goto L66
            r3 = r27 & 2
            if (r3 == 0) goto L5a
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi
            goto L63
        L5a:
            r3 = r27 & 1
            if (r3 == 0) goto L61
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network
            goto L63
        L61:
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_paused
        L63:
            r15 = r3
            r3 = 0
            goto L6f
        L66:
            if (r6 == 0) goto L6d
            int r3 = com.google.android.exoplayer2.core.R.string.exo_download_removing
        L6a:
            r15 = r3
            r3 = 1
            goto L6f
        L6d:
            r3 = 1
            r15 = 0
        L6f:
            r5 = 100
            if (r3 == 0) goto L8c
            if (r4 == 0) goto L85
            float r3 = (float) r7
            float r2 = r2 / r3
            int r2 = (int) r2
            if (r8 == 0) goto L7d
            if (r9 == 0) goto L7d
            goto L7e
        L7d:
            r0 = 0
        L7e:
            r18 = r0
            r17 = r2
            r16 = 100
            goto L92
        L85:
            r16 = 100
            r17 = 0
            r18 = 1
            goto L92
        L8c:
            r16 = 0
            r17 = 0
            r18 = 0
        L92:
            r19 = 1
            r20 = 0
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            android.app.Notification r0 = r10.buildNotification(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DownloadNotificationHelper.buildProgressNotification(android.content.Context, int, android.app.PendingIntent, java.lang.String, java.util.List, int):android.app.Notification");
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        return this.notificationBuilder.build();
    }
}
