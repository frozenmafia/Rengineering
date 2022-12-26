package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;
/* loaded from: classes7.dex */
final class zzbh implements AppMeasurement.EventInterceptor {
    private final /* synthetic */ zzcj zzagq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbh(zzbg zzbgVar, zzcj zzcjVar) {
        this.zzagq = zzcjVar;
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.EventInterceptor, com.google.android.gms.measurement.internal.zzgr
    public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.zzagq.interceptEvent(str, str2, bundle, j);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
