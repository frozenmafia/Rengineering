package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class qq extends Handler {
    final /* synthetic */ qs a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq(qs qsVar, Looper looper) {
        super(looper);
        this.a = qsVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qs.a(this.a, message);
    }
}
