package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class eg extends BroadcastReceiver implements Runnable {
    final /* synthetic */ ei a;

    /* renamed from: b  reason: collision with root package name */
    private final eh f1026b;
    private final Handler c;

    public eg(ei eiVar, Handler handler, eh ehVar) {
        this.a = eiVar;
        this.c = handler;
        this.f1026b = ehVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
