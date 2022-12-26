package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes7.dex */
public final class zzeq extends zzm implements zzeo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // com.google.android.gms.internal.gtm.zzeo
    public final void zza(boolean z, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzo.writeBoolean(obtainAndWriteInterfaceToken, z);
        obtainAndWriteInterfaceToken.writeString(str);
        zzb(1, obtainAndWriteInterfaceToken);
    }
}
