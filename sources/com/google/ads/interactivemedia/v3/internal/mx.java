package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class mx extends Handler {
    final /* synthetic */ nf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(nf nfVar, Looper looper) {
        super(looper);
        this.a = nfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<mu> list;
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        list = this.a.j;
        for (mu muVar : list) {
            if (muVar.n(bArr)) {
                muVar.i(message.what);
                return;
            }
        }
    }
}
