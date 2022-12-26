package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class anq extends BroadcastReceiver {
    final /* synthetic */ anr a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public anq(anr anrVar) {
        this.a = anrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.f();
    }
}
