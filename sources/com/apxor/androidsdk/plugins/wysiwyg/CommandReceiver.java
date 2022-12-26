package com.apxor.androidsdk.plugins.wysiwyg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes6.dex */
public class CommandReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || action.isEmpty()) {
            return;
        }
        if (action.equals("com.apxor.androidsdk.actions.ENABLE_OVERLAY")) {
            e.b().a(true);
        } else if (action.equals("com.apxor.androidsdk.actions.DISABLE_OVERLAY")) {
            e.b().a(false);
        }
    }
}
