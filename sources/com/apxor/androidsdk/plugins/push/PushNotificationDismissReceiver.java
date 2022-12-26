package com.apxor.androidsdk.plugins.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.apxor.androidsdk.core.ApxorSDK;
import com.apxor.androidsdk.core.Attributes;
import com.facebook.react.uimanager.UIManagerModuleConstants;
/* loaded from: classes6.dex */
public class PushNotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String string;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.size() <= 0 || !extras.getBoolean(UIManagerModuleConstants.ACTION_DISMISSED) || !extras.containsKey("notification_id") || (string = extras.getString("notification_id")) == null) {
            return;
        }
        Attributes attributes = new Attributes();
        attributes.putAttribute("notification_id", string);
        attributes.putAttribute("apx_notification_name", extras.getString("apx_notification_name"));
        ApxorSDK.logAppEvent("apx_notification_dismissed", attributes);
    }
}
