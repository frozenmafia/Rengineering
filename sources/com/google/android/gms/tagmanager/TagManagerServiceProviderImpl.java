package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzer;
import com.google.android.gms.internal.gtm.zzgl;
/* loaded from: classes7.dex */
public class TagManagerServiceProviderImpl extends zzct {
    private static volatile zzgl zzalk;

    @Override // com.google.android.gms.tagmanager.zzcs
    public zzer getService(IObjectWrapper iObjectWrapper, zzcm zzcmVar, zzcd zzcdVar) throws RemoteException {
        zzgl zzglVar = zzalk;
        if (zzglVar == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                zzglVar = zzalk;
                if (zzglVar == null) {
                    zzglVar = new zzgl((Context) ObjectWrapper.unwrap(iObjectWrapper), zzcmVar, zzcdVar);
                    zzalk = zzglVar;
                }
            }
        }
        return zzglVar;
    }
}
