package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzfs implements zzfr {
    private Handler handler;
    final /* synthetic */ zzfo zzapm;

    private zzfs(zzfo zzfoVar) {
        Context context;
        this.zzapm = zzfoVar;
        context = zzfoVar.zzako;
        this.handler = new zzdj(context.getMainLooper(), new zzft(this));
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final void zzjt() {
        Object obj;
        Handler handler = this.handler;
        obj = zzfo.zzakn;
        handler.removeMessages(1, obj);
        this.handler.sendMessage(obtainMessage());
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final void cancel() {
        Object obj;
        Handler handler = this.handler;
        obj = zzfo.zzakn;
        handler.removeMessages(1, obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final void zzh(long j) {
        Object obj;
        Handler handler = this.handler;
        obj = zzfo.zzakn;
        handler.removeMessages(1, obj);
        this.handler.sendMessageDelayed(obtainMessage(), j);
    }

    private final Message obtainMessage() {
        Object obj;
        Handler handler = this.handler;
        obj = zzfo.zzakn;
        return handler.obtainMessage(1, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfs(zzfo zzfoVar, zzfp zzfpVar) {
        this(zzfoVar);
    }
}
