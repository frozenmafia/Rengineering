package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzm;
import com.google.android.gms.internal.gtm.zzo;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class zzco extends zzm implements zzcm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzo.zza(obtainAndWriteInterfaceToken, bundle);
        obtainAndWriteInterfaceToken.writeLong(j);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final Map zzib() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
        HashMap zzb = zzo.zzb(transactAndReadException);
        transactAndReadException.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void zza(zzcj zzcjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzo.zza(obtainAndWriteInterfaceToken, zzcjVar);
        zza(21, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void zza(zzcg zzcgVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzo.zza(obtainAndWriteInterfaceToken, zzcgVar);
        zza(22, obtainAndWriteInterfaceToken);
    }
}
