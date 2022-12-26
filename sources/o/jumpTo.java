package o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes5.dex */
public final class jumpTo {
    private static int HaptikSDK$c = 1;
    private static char ag$a;
    private static char ah$a;
    private static int invoke;
    private static final AtomicInteger toString;
    private static char valueOf;
    private static char values;

    /* loaded from: classes5.dex */
    public static class values {
        public final String toString;
        public final int valueOf;
        public final NotificationCompat.Builder values;

        values(NotificationCompat.Builder builder, String str, int i) {
            this.values = builder;
            this.toString = str;
            this.valueOf = i;
        }
    }

    static void valueOf() {
        valueOf = (char) 30960;
        ah$a = (char) 52892;
        values = (char) 33175;
        ag$a = (char) 57446;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static values toString(Context context, willRunSimpleAnimations willrunsimpleanimations) {
        int i = HaptikSDK$c + 17;
        invoke = i % 128;
        int i2 = i % 2;
        Bundle values2 = values(context.getPackageManager(), context.getPackageName());
        values ah$a2 = ah$a(context, context.getPackageName(), willrunsimpleanimations, ah$a(context, willrunsimpleanimations.ag$a(), values2), context.getResources(), context.getPackageManager(), values2);
        int i3 = invoke + 105;
        HaptikSDK$c = i3 % 128;
        if ((i3 % 2 == 0 ? 'M' : Soundex.SILENT_MARKER) != '-') {
            Object[] objArr = null;
            int length = objArr.length;
            return ah$a2;
        }
        return ah$a2;
    }

    public static values ah$a(Context context, String str, willRunSimpleAnimations willrunsimpleanimations, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str2);
        String ag$a2 = willrunsimpleanimations.ag$a(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(ag$a2)) {
            builder.setContentTitle(ag$a2);
        }
        String ag$a3 = willrunsimpleanimations.ag$a(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(ag$a3)) {
            try {
                builder.setContentText(ag$a3);
                builder.setStyle(new NotificationCompat.BigTextStyle().bigText(ag$a3));
            } catch (Exception e) {
                throw e;
            }
        }
        builder.setSmallIcon(values(packageManager, resources, str, willrunsimpleanimations.HaptikSDK$b("gcm.n.icon"), bundle));
        Uri valueOf2 = valueOf(str, willrunsimpleanimations, resources);
        if (valueOf2 != null) {
            int i = invoke + 49;
            HaptikSDK$c = i % 128;
            if (i % 2 == 0) {
                builder.setSound(valueOf2);
                Object obj = null;
                super.hashCode();
            } else {
                builder.setSound(valueOf2);
            }
            int i2 = HaptikSDK$c + 115;
            invoke = i2 % 128;
            int i3 = i2 % 2;
        }
        builder.setContentIntent(valueOf(context, willrunsimpleanimations, str, packageManager));
        PendingIntent ah$a2 = ah$a(context, willrunsimpleanimations);
        if (!(ah$a2 == null)) {
            builder.setDeleteIntent(ah$a2);
        }
        Integer jumpto = toString(context, willrunsimpleanimations.HaptikSDK$b("gcm.n.color"), bundle);
        if ((jumpto != null ? 'J' : (char) 30) == 'J') {
            builder.setColor(jumpto.intValue());
        }
        builder.setAutoCancel(!willrunsimpleanimations.values("gcm.n.sticky"));
        builder.setLocalOnly(willrunsimpleanimations.values("gcm.n.local_only"));
        String HaptikSDK$b = willrunsimpleanimations.HaptikSDK$b("gcm.n.ticker");
        if (HaptikSDK$b != null) {
            builder.setTicker(HaptikSDK$b);
        }
        Integer ah$b = willrunsimpleanimations.ah$b();
        if (ah$b != null) {
            try {
                int i4 = HaptikSDK$c + 19;
                invoke = i4 % 128;
                int i5 = i4 % 2;
                builder.setPriority(ah$b.intValue());
            } catch (Exception e2) {
                throw e2;
            }
        }
        Integer invoke2 = willrunsimpleanimations.invoke();
        if (invoke2 != null) {
            builder.setVisibility(invoke2.intValue());
        }
        Integer valueOf3 = willrunsimpleanimations.valueOf();
        if (!(valueOf3 == null)) {
            builder.setNumber(valueOf3.intValue());
        }
        Long HaptikSDK$a = willrunsimpleanimations.HaptikSDK$a("gcm.n.event_time");
        if (HaptikSDK$a != null) {
            builder.setShowWhen(true);
            builder.setWhen(HaptikSDK$a.longValue());
        }
        long[] HaptikSDK$b2 = willrunsimpleanimations.HaptikSDK$b();
        if (HaptikSDK$b2 != null) {
            builder.setVibrate(HaptikSDK$b2);
        }
        int[] values2 = willrunsimpleanimations.values();
        if (values2 != null) {
            builder.setLights(values2[0], values2[1], values2[2]);
        }
        builder.setDefaults(toString(willrunsimpleanimations));
        values valuesVar = new values(builder, ah$a(willrunsimpleanimations), 0);
        int i6 = invoke + 123;
        HaptikSDK$c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
            return valuesVar;
        }
        return valuesVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ((r5.values("gcm.n.default_vibrate_timings") ? 'X' : org.apache.commons.codec.language.Soundex.SILENT_MARKER) != 'X') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if ((r5.values("gcm.n.default_vibrate_timings")) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        r0 = r0 | true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r5.values("gcm.n.default_light_settings") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        r5 = o.jumpTo.invoke + 113;
        o.jumpTo.HaptikSDK$c = r5 % 128;
        r5 = r5 % 2;
        r0 = (r0 ? 1 : 0) | true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        r5 = o.jumpTo.invoke + 43;
        o.jumpTo.HaptikSDK$c = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int toString(o.willRunSimpleAnimations r5) {
        /*
            int r0 = o.jumpTo.HaptikSDK$c     // Catch: java.lang.Exception -> L61
            int r0 = r0 + 119
            int r1 = r0 % 128
            o.jumpTo.invoke = r1     // Catch: java.lang.Exception -> L61
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            java.lang.String r3 = "gcm.n.default_vibrate_timings"
            java.lang.String r4 = "gcm.n.default_sound"
            if (r0 == 0) goto L2b
            boolean r0 = r5.values(r4)
            boolean r1 = r5.values(r3)
            r2 = 88
            if (r1 == 0) goto L26
            r1 = 88
            goto L28
        L26:
            r1 = 45
        L28:
            if (r1 == r2) goto L3c
            goto L3e
        L2b:
            boolean r0 = r5.values(r4)     // Catch: java.lang.Exception -> L61
            boolean r3 = r5.values(r3)     // Catch: java.lang.Exception -> L5f
            r4 = 40
            int r4 = r4 / r1
            if (r3 == 0) goto L39
            r1 = 1
        L39:
            if (r1 == r2) goto L3c
            goto L3e
        L3c:
            r0 = r0 | 2
        L3e:
            java.lang.String r1 = "gcm.n.default_light_settings"
            boolean r5 = r5.values(r1)
            if (r5 == 0) goto L52
            int r5 = o.jumpTo.invoke
            int r5 = r5 + 113
            int r1 = r5 % 128
            o.jumpTo.HaptikSDK$c = r1
            int r5 = r5 % 2
            r0 = r0 | 4
        L52:
            int r5 = o.jumpTo.invoke
            int r5 = r5 + 43
            int r1 = r5 % 128
            o.jumpTo.HaptikSDK$c = r1
            int r5 = r5 % 2
            return r0
        L5d:
            r5 = move-exception
            throw r5
        L5f:
            r5 = move-exception
            throw r5
        L61:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jumpTo.toString(o.willRunSimpleAnimations):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if ((android.os.Build.VERSION.SDK_INT == 26) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean toString(android.content.res.Resources r6, int r7) {
        /*
            java.lang.String r0 = "FirebaseMessaging"
            int r1 = o.jumpTo.invoke
            int r1 = r1 + 13
            int r2 = r1 % 128
            o.jumpTo.HaptikSDK$c = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L20
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L75
            r4 = 47
            r5 = 80
            if (r1 == r4) goto L1b
            r1 = 54
            goto L1d
        L1b:
            r1 = 80
        L1d:
            if (r1 == r5) goto L2b
            goto L68
        L20:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L75
            r4 = 26
            if (r1 == r4) goto L28
            r1 = 0
            goto L29
        L28:
            r1 = 1
        L29:
            if (r1 == 0) goto L68
        L2b:
            r1 = 0
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7, r1)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            boolean r6 = r6 instanceof android.graphics.drawable.AdaptiveIconDrawable     // Catch: android.content.res.Resources.NotFoundException -> L4c
            if (r6 == 0) goto L4b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L4c
            r1 = 77
            r6.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            java.lang.String r1 = "Adaptive icons cannot be used in notifications. Ignoring icon id: "
            r6.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            r6.append(r7)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            java.lang.String r6 = r6.toString()     // Catch: android.content.res.Resources.NotFoundException -> L4c
            android.util.Log.e(r0, r6)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            return r2
        L4b:
            return r3
        L4c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r1 = 66
            r6.<init>(r1)
            java.lang.String r1 = "Couldn't find resource "
            r6.append(r1)
            r6.append(r7)
            java.lang.String r7 = ", treating it as an invalid icon"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r0, r6)
            return r2
        L68:
            int r6 = o.jumpTo.invoke
            int r6 = r6 + 89
            int r7 = r6 % 128
            o.jumpTo.HaptikSDK$c = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L74
        L74:
            return r3
        L75:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jumpTo.toString(android.content.res.Resources, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
        if (toString(r5, r8) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        if (toString(r5, r8) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int values(android.content.pm.PackageManager r4, android.content.res.Resources r5, java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            int r0 = o.jumpTo.HaptikSDK$c
            int r0 = r0 + 91
            int r1 = r0 % 128
            o.jumpTo.invoke = r1
            int r0 = r0 % 2
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 60
            if (r0 != 0) goto L15
            r0 = 60
            goto L17
        L15:
            r0 = 46
        L17:
            java.lang.String r2 = "FirebaseMessaging"
            if (r0 == r1) goto L1c
            goto L6f
        L1c:
            java.lang.String r0 = "drawable"
            int r0 = r5.getIdentifier(r7, r0, r6)
            if (r0 == 0) goto L35
            int r1 = o.jumpTo.invoke
            int r1 = r1 + 97
            int r3 = r1 % 128
            o.jumpTo.HaptikSDK$c = r3
            int r1 = r1 % 2
            boolean r1 = toString(r5, r0)
            if (r1 == 0) goto L35
            return r0
        L35:
            java.lang.String r0 = "mipmap"
            int r0 = r5.getIdentifier(r7, r0, r6)
            r1 = 61
            if (r0 == 0) goto L4d
            boolean r3 = toString(r5, r0)
            if (r3 == 0) goto L48
            r3 = 43
            goto L4a
        L48:
            r3 = 61
        L4a:
            if (r3 == r1) goto L4d
            return r0
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r7)
            int r3 = r3.length()
            int r3 = r3 + r1
            r0.<init>(r3)
            java.lang.String r1 = "Icon resource "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " not found. Notification will use default icon."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.w(r2, r7)
        L6f:
            r7 = 0
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r8 = r8.getInt(r0, r7)
            r0 = 1
            if (r8 == 0) goto L7b
            r1 = 1
            goto L7c
        L7b:
            r1 = 0
        L7c:
            if (r1 == 0) goto La0
            int r1 = o.jumpTo.invoke
            int r1 = r1 + 51
            int r3 = r1 % 128
            o.jumpTo.HaptikSDK$c = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L8b
            goto L8c
        L8b:
            r0 = 0
        L8c:
            if (r0 == 0) goto L9a
            boolean r0 = toString(r5, r8)
            r1 = 9
            int r1 = r1 / r7
            if (r0 != 0) goto Lca
            goto La0
        L98:
            r4 = move-exception
            throw r4
        L9a:
            boolean r0 = toString(r5, r8)
            if (r0 != 0) goto Lca
        La0:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            int r8 = r4.icon     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La7
            goto Lca
        La7:
            r4 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r7 = r7.length()
            int r7 = r7 + 35
            r6.<init>(r7)
            java.lang.String r7 = "Couldn't get own application info: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.w(r2, r4)
        Lca:
            if (r8 == 0) goto Ld2
            boolean r4 = toString(r5, r8)
            if (r4 != 0) goto Ld5
        Ld2:
            r8 = 17301651(0x1080093, float:2.4979667E-38)
        Ld5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jumpTo.values(android.content.pm.PackageManager, android.content.res.Resources, java.lang.String, java.lang.String, android.os.Bundle):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 21) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        r0 = o.jumpTo.HaptikSDK$c + 47;
        o.jumpTo.invoke = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        r5 = java.lang.Integer.valueOf(android.graphics.Color.parseColor(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        r6 = 32 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        return java.lang.Integer.valueOf(android.graphics.Color.parseColor(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        r0 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 56);
        r0.append("Color is invalid: ");
        r0.append(r6);
        r0.append(". Notification will use default color.");
        android.util.Log.w("FirebaseMessaging", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        r6 = r7.getInt("com.google.firebase.messaging.default_notification_color", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r6 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        r0 = '3';
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        r0 = 'T';
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r0 != 'T') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
        return java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(r5, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
        android.util.Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        r5 = o.jumpTo.invoke + 27;
        o.jumpTo.HaptikSDK$c = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if ((r5 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (android.os.Build.VERSION.SDK_INT < 57) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Integer toString(android.content.Context r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            int r0 = o.jumpTo.HaptikSDK$c
            int r0 = r0 + 29
            int r1 = r0 % 128
            o.jumpTo.invoke = r1
            int r0 = r0 % 2
            r1 = 64
            if (r0 == 0) goto L11
            r0 = 91
            goto L13
        L11:
            r0 = 64
        L13:
            r2 = 0
            r3 = 0
            if (r0 == r1) goto L1f
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 57
            if (r0 >= r1) goto L2a
            goto L98
        L1f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L27
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 == 0) goto L98
        L2a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = "FirebaseMessaging"
            if (r0 != 0) goto L78
            int r0 = o.jumpTo.HaptikSDK$c
            int r0 = r0 + 47
            int r4 = r0 % 128
            o.jumpTo.invoke = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L4c
            int r5 = android.graphics.Color.parseColor(r6)     // Catch: java.lang.IllegalArgumentException -> L55
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 32
            int r6 = r6 / r3
            return r5
        L4a:
            r5 = move-exception
            throw r5
        L4c:
            int r5 = android.graphics.Color.parseColor(r6)     // Catch: java.lang.IllegalArgumentException -> L55
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r6)
            int r4 = r4.length()
            int r4 = r4 + 56
            r0.<init>(r4)
            java.lang.String r4 = "Color is invalid: "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r6 = ". Notification will use default color."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r1, r6)
        L78:
            java.lang.String r6 = "com.google.firebase.messaging.default_notification_color"
            int r6 = r7.getInt(r6, r3)
            r7 = 84
            if (r6 == 0) goto L85
            r0 = 51
            goto L87
        L85:
            r0 = 84
        L87:
            if (r0 == r7) goto L97
            int r5 = androidx.core.content.ContextCompat.getColor(r5, r6)     // Catch: android.content.res.Resources.NotFoundException -> L92
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L92:
            java.lang.String r5 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r1, r5)
        L97:
            return r2
        L98:
            int r5 = o.jumpTo.invoke
            int r5 = r5 + 27
            int r6 = r5 % 128
            o.jumpTo.HaptikSDK$c = r6
            int r5 = r5 % 2
            if (r5 != 0) goto Laa
            super.hashCode()     // Catch: java.lang.Throwable -> La8
            return r2
        La8:
            r5 = move-exception
            throw r5
        Laa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jumpTo.toString(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Integer");
    }

    private static Uri valueOf(String str, willRunSimpleAnimations willrunsimpleanimations, Resources resources) {
        int i = HaptikSDK$c + 31;
        invoke = i % 128;
        int i2 = i % 2;
        String HaptikSDK$c2 = willrunsimpleanimations.HaptikSDK$c();
        if ((TextUtils.isEmpty(HaptikSDK$c2) ? (char) 30 : 'C') != 'C') {
            int i3 = HaptikSDK$c + 113;
            invoke = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 64 / 0;
                return null;
            }
            return null;
        }
        if (ag$a(new char[]{6192, 12896, 35878, 19801, 63105, 21964, 9391, 2544}, 7 - TextUtils.indexOf("", "", 0, 0)).intern().equals(HaptikSDK$c2) ? false : true) {
            int i5 = invoke + 81;
            HaptikSDK$c = i5 % 128;
            int i6 = i5 % 2;
            if (resources.getIdentifier(HaptikSDK$c2, "raw", str) != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(HaptikSDK$c2).length());
                sb.append("android.resource://");
                sb.append(str);
                sb.append("/raw/");
                sb.append(HaptikSDK$c2);
                Uri parse = Uri.parse(sb.toString());
                int i7 = HaptikSDK$c + 79;
                invoke = i7 % 128;
                int i8 = i7 % 2;
                return parse;
            }
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static PendingIntent valueOf(Context context, willRunSimpleAnimations willrunsimpleanimations, String str, PackageManager packageManager) {
        Intent jumpto = toString(str, willrunsimpleanimations, packageManager);
        if (jumpto != null) {
            jumpto.addFlags(67108864);
            jumpto.putExtras(willrunsimpleanimations.getInitSettings());
            PendingIntent activity = PendingIntent.getActivity(context, ah$a(), jumpto, 1073741824);
            if ((values(willrunsimpleanimations) ? 'Y' : ';') == 'Y') {
                activity = ag$a(context, willrunsimpleanimations, activity);
            }
            int i = invoke + 7;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            return activity;
        }
        int i3 = invoke + 61;
        HaptikSDK$c = i3 % 128;
        Object[] objArr = null;
        if ((i3 % 2 == 0 ? (char) 20 : '8') != '8') {
            int length = objArr.length;
        }
        int i4 = HaptikSDK$c + 103;
        invoke = i4 % 128;
        if (i4 % 2 != 0) {
            super.hashCode();
            return null;
        }
        return null;
    }

    private static Intent toString(String str, willRunSimpleAnimations willrunsimpleanimations, PackageManager packageManager) {
        String HaptikSDK$b = willrunsimpleanimations.HaptikSDK$b("gcm.n.click_action");
        if (!TextUtils.isEmpty(HaptikSDK$b)) {
            Intent intent = new Intent(HaptikSDK$b);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri ah$a2 = willrunsimpleanimations.ah$a();
        if (ah$a2 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(ah$a2);
            int i = HaptikSDK$c + 11;
            invoke = i % 128;
            if (i % 2 == 0) {
                return intent2;
            }
            int i2 = 76 / 0;
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if ((launchIntentForPackage == null ? (char) 27 : '0') == 27) {
            int i3 = invoke + 89;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static Bundle values(PackageManager packageManager, String str) {
        int i = HaptikSDK$c + 33;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if ((applicationInfo != null ? (char) 7 : '\f') != '\f') {
                if (applicationInfo.metaData != null) {
                    int i3 = invoke + 3;
                    HaptikSDK$c = i3 % 128;
                    int i4 = i3 % 2;
                    return applicationInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf2);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0.getNotificationChannel(r8) != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        r7 = o.jumpTo.HaptikSDK$c + 95;
        o.jumpTo.invoke = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if ((r7 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        r7 = 17 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r8).length() + 122);
        r1.append("Notification Channel requested (");
        r1.append(r8);
        r1.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
        android.util.Log.w("FirebaseMessaging", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String ah$a(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jumpTo.ah$a(android.content.Context, java.lang.String, android.os.Bundle):java.lang.String");
    }

    private static int ah$a() {
        int i = HaptikSDK$c + 97;
        invoke = i % 128;
        if ((i % 2 != 0 ? ':' : '1') != '1') {
            int incrementAndGet = toString.incrementAndGet();
            Object obj = null;
            super.hashCode();
            return incrementAndGet;
        }
        return toString.incrementAndGet();
    }

    private static PendingIntent ag$a(Context context, willRunSimpleAnimations willrunsimpleanimations, PendingIntent pendingIntent) {
        try {
            PendingIntent ah$a2 = ah$a(context, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_OPEN).putExtras(willrunsimpleanimations.HaptikSDK$a()).putExtra(CloudMessagingReceiver.IntentKeys.PENDING_INTENT, pendingIntent));
            int i = HaptikSDK$c + 11;
            invoke = i % 128;
            if (!(i % 2 == 0)) {
                Object obj = null;
                super.hashCode();
                return ah$a2;
            }
            return ah$a2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        if ((!values(r4) ? 19 : 'E') != 19) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        r3 = ah$a(r3, new android.content.Intent(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(r4.HaptikSDK$a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        r4 = o.jumpTo.HaptikSDK$c + 99;
        o.jumpTo.invoke = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r3 = o.jumpTo.invoke + 5;
        o.jumpTo.HaptikSDK$c = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r3 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r3 = 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        r3 = org.apache.http.message.TokenParser.SP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r3 == ' ') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.PendingIntent ah$a(android.content.Context r3, o.willRunSimpleAnimations r4) {
        /*
            int r0 = o.jumpTo.invoke     // Catch: java.lang.Exception -> L69
            int r0 = r0 + 51
            int r1 = r0 % 128
            o.jumpTo.HaptikSDK$c = r1
            int r0 = r0 % 2
            r1 = 95
            if (r0 != 0) goto L11
            r0 = 81
            goto L13
        L11:
            r0 = 95
        L13:
            r2 = 0
            if (r0 == r1) goto L20
            boolean r0 = values(r4)
            int r1 = r2.length     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L2f
            goto L4d
        L1e:
            r3 = move-exception
            throw r3
        L20:
            boolean r0 = values(r4)
            r1 = 19
            if (r0 != 0) goto L2b
            r0 = 19
            goto L2d
        L2b:
            r0 = 69
        L2d:
            if (r0 == r1) goto L4d
        L2f:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L69
            android.os.Bundle r4 = r4.HaptikSDK$a()     // Catch: java.lang.Exception -> L69
            android.content.Intent r4 = r0.putExtras(r4)     // Catch: java.lang.Exception -> L69
            android.app.PendingIntent r3 = ah$a(r3, r4)     // Catch: java.lang.Exception -> L69
            int r4 = o.jumpTo.HaptikSDK$c
            int r4 = r4 + 99
            int r0 = r4 % 128
            o.jumpTo.invoke = r0
            int r4 = r4 % 2
            return r3
        L4d:
            int r3 = o.jumpTo.invoke
            int r3 = r3 + 5
            int r4 = r3 % 128
            o.jumpTo.HaptikSDK$c = r4
            int r3 = r3 % 2
            r4 = 32
            if (r3 != 0) goto L5e
            r3 = 27
            goto L60
        L5e:
            r3 = 32
        L60:
            if (r3 == r4) goto L68
            super.hashCode()     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r3 = move-exception
            throw r3
        L68:
            return r2
        L69:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jumpTo.ah$a(android.content.Context, o.willRunSimpleAnimations):android.app.PendingIntent");
    }

    private static PendingIntent ah$a(Context context, Intent intent) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, ah$a(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), 1073741824);
        int i = HaptikSDK$c + 69;
        invoke = i % 128;
        if ((i % 2 != 0 ? 'S' : 'Z') != 'S') {
            return broadcast;
        }
        int i2 = 3 / 0;
        return broadcast;
    }

    static boolean values(willRunSimpleAnimations willrunsimpleanimations) {
        int i = invoke + 125;
        HaptikSDK$c = i % 128;
        char c = i % 2 == 0 ? '@' : (char) 4;
        boolean values2 = willrunsimpleanimations.values("google.c.a.e");
        if (c == '@') {
            Object[] objArr = null;
            int length = objArr.length;
        }
        return values2;
    }

    private static String ah$a(willRunSimpleAnimations willrunsimpleanimations) {
        try {
            int i = invoke + 33;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            String HaptikSDK$b = willrunsimpleanimations.HaptikSDK$b("gcm.n.tag");
            if (!(!TextUtils.isEmpty(HaptikSDK$b))) {
                long uptimeMillis = SystemClock.uptimeMillis();
                StringBuilder sb = new StringBuilder(37);
                sb.append("FCM-Notification:");
                sb.append(uptimeMillis);
                String sb2 = sb.toString();
                try {
                    int i3 = HaptikSDK$c + 125;
                    invoke = i3 % 128;
                    if ((i3 % 2 != 0 ? 'I' : ')') != 'I') {
                        return sb2;
                    }
                    Object[] objArr = null;
                    int length = objArr.length;
                    return sb2;
                } catch (Exception e) {
                    throw e;
                }
            }
            return HaptikSDK$b;
        } catch (Exception e2) {
            throw e2;
        }
    }

    static {
        valueOf();
        toString = new AtomicInteger((int) SystemClock.elapsedRealtime());
        int i = HaptikSDK$c + 45;
        invoke = i % 128;
        int i2 = i % 2;
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$a)) ^ ((cArr3[0] >>> 5) + values)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ag$a)) ^ ((cArr3[1] >>> 5) + valueOf)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
