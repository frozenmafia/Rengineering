package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ms extends Handler {
    final /* synthetic */ mu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(mu muVar, Looper looper) {
        super(looper);
        this.a = muVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 0) {
            mu.g(this.a, obj, obj2);
        } else if (i != 1) {
        } else {
            mu.f(this.a, obj, obj2);
        }
    }
}
