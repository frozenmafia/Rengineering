package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfy;
/* loaded from: classes7.dex */
public class TagManagerApiImpl extends zzcq {
    private zzfy zzalj;

    @Override // com.google.android.gms.tagmanager.zzcp
    public void initialize(IObjectWrapper iObjectWrapper, zzcm zzcmVar, zzcd zzcdVar) throws RemoteException {
        zzfy zza = zzfy.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzcmVar, zzcdVar);
        this.zzalj = zza;
        zza.zzb((String[]) null);
    }

    @Override // com.google.android.gms.tagmanager.zzcp
    @Deprecated
    public void preview(Intent intent, IObjectWrapper iObjectWrapper) {
        zzev.zzac("Deprecated. Please use previewIntent instead.");
    }

    @Override // com.google.android.gms.tagmanager.zzcp
    public void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzcm zzcmVar, zzcd zzcdVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfy zza = zzfy.zza(context, zzcmVar, zzcdVar);
        this.zzalj = zza;
        new zzfb(intent, context, (Context) ObjectWrapper.unwrap(iObjectWrapper2), zza).zzkq();
    }
}
