package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes7.dex */
public interface zzcm extends IInterface {
    void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) throws RemoteException;

    void zza(zzcg zzcgVar) throws RemoteException;

    void zza(zzcj zzcjVar) throws RemoteException;

    Map zzib() throws RemoteException;
}
