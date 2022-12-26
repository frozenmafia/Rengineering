package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import o.addCancellationSignal;
import o.runAnimators;
/* loaded from: classes6.dex */
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    protected void ag$a(String str, String str2, Bundle bundle) {
        runAnimators.ag$a(str, "appCallId");
        runAnimators.ag$a(str2, "action");
        runAnimators.ag$a(bundle, "extras");
    }

    protected void toString(String str, String str2, Bundle bundle) {
        runAnimators.ag$a(str, "appCallId");
        runAnimators.ag$a(str2, "action");
        runAnimators.ag$a(bundle, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(intent, "intent");
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        addCancellationSignal addcancellationsignal = addCancellationSignal.ag$a;
        if (addCancellationSignal.HaptikSDK$a(intent)) {
            toString(stringExtra, stringExtra2, extras);
        } else {
            ag$a(stringExtra, stringExtra2, extras);
        }
    }
}
