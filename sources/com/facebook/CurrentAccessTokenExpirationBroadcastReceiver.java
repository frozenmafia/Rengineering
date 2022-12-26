package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.DefaultSpecialEffectsController;
import o.executeOperations;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z;
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(intent, "intent");
        if (runAnimators.values((Object) "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", (Object) intent.getAction())) {
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            z = DefaultSpecialEffectsController.AnonymousClass8.ak$a.get();
            if (z) {
                executeOperations.valueOf.values().values();
            }
        }
    }
}
