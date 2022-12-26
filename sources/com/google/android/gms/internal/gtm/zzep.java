package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes7.dex */
public abstract class zzep extends zzn implements zzeo {
    public zzep() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // com.google.android.gms.internal.gtm.zzn
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza(zzo.zza(parcel), parcel.readString());
            return true;
        }
        return false;
    }
}
