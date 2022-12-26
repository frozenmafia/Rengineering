package com.google.ads.interactivemedia.v3.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class agt extends BroadcastReceiver {
    final /* synthetic */ agu a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public agt(agu aguVar) {
        this.a = aguVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            agu.b(this.a, true);
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            agu.b(this.a, false);
        } else if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
        } else {
            agu.b(this.a, false);
        }
    }
}
