package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.ah;
import com.google.android.exoplayer2.ExoPlayer;
/* loaded from: classes6.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (Throwable th) {
            AFLogger.values("error in BroadcastReceiver ", th);
            str = null;
        }
        if (str != null && ah.values(context).getString("referrer", null) != null) {
            ah.AFInAppEventParameterName().AFInAppEventParameterName(context, str);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            AFLogger.valueOf("SingleInstallBroadcastReceiver called");
            ah.AFInAppEventParameterName().AFInAppEventParameterName(context, intent);
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
