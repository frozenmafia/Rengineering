package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes4.dex */
final class hq extends BroadcastReceiver {
    final /* synthetic */ hr a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ hq(hr hrVar) {
        this.a = hrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final hr hrVar = this.a;
        hr.c(hrVar).post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.hp
            @Override // java.lang.Runnable
            public final void run() {
                hr.d(hr.this);
            }
        });
    }
}
