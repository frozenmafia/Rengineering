package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes7.dex */
public abstract class zzes extends zzn implements zzer {
    public zzes() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    public static zzer zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        if (queryLocalInterface instanceof zzer) {
            return (zzer) queryLocalInterface;
        }
        return new zzet(iBinder);
    }

    @Override // com.google.android.gms.internal.gtm.zzn
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzeo zzeqVar;
        if (i == 1) {
            zzc(parcel.readString(), parcel.readString(), parcel.readString());
        } else if (i == 2) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzeqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                if (queryLocalInterface instanceof zzeo) {
                    zzeqVar = (zzeo) queryLocalInterface;
                } else {
                    zzeqVar = new zzeq(readStrongBinder);
                }
            }
            zza(readString, readString2, readString3, zzeqVar);
        } else if (i == 3) {
            zzkm();
        } else if (i == 101) {
            zza(parcel.readString(), (Bundle) zzo.zza(parcel, Bundle.CREATOR), parcel.readString(), parcel.readLong(), zzo.zza(parcel));
        } else if (i != 102) {
            return false;
        } else {
            dispatch();
        }
        parcel2.writeNoException();
        return true;
    }
}
