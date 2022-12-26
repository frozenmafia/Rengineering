package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
/* loaded from: classes7.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements ICancelToken {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
