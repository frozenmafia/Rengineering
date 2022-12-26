package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzft implements Handler.Callback {
    private final /* synthetic */ zzfs zzapn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzft(zzfs zzfsVar) {
        this.zzapn = zzfsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        boolean isPowerSaveMode;
        int i;
        if (1 == message.what) {
            obj = zzfo.zzakn;
            if (obj.equals(message.obj)) {
                this.zzapn.zzapm.dispatch();
                isPowerSaveMode = this.zzapn.zzapm.isPowerSaveMode();
                if (!isPowerSaveMode) {
                    zzfs zzfsVar = this.zzapn;
                    i = zzfsVar.zzapm.zzakr;
                    zzfsVar.zzh(i);
                }
            }
        }
        return true;
    }
}
