package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ck implements bt {
    private Message a;

    private ck() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ck(byte[] bArr) {
    }

    private final void d() {
        this.a = null;
        cl.k(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bt
    public final void a() {
        Message message = this.a;
        af.s(message);
        message.sendToTarget();
        d();
    }

    public final boolean b(Handler handler) {
        Message message = this.a;
        af.s(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        d();
        return sendMessageAtFrontOfQueue;
    }

    public final void c(Message message) {
        this.a = message;
    }
}
