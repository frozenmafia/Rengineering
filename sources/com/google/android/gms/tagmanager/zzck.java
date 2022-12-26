package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzn;
import com.google.android.gms.internal.gtm.zzo;
/* loaded from: classes7.dex */
public abstract class zzck extends zzn implements zzcj {
    public zzck() {
        super("com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    @Override // com.google.android.gms.internal.gtm.zzn
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            interceptEvent(parcel.readString(), parcel.readString(), (Bundle) zzo.zza(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
