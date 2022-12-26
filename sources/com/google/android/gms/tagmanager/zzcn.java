package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzn;
import com.google.android.gms.internal.gtm.zzo;
import java.util.Map;
/* loaded from: classes7.dex */
public abstract class zzcn extends zzn implements zzcm {
    public zzcn() {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.gtm.zzn
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            logEventInternalNoInterceptor(parcel.readString(), parcel.readString(), (Bundle) zzo.zza(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
            return true;
        } else if (i == 11) {
            Map zzib = zzib();
            parcel2.writeNoException();
            parcel2.writeMap(zzib);
            return true;
        } else {
            zzcj zzcjVar = null;
            zzcg zzcgVar = null;
            if (i == 21) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                    if (queryLocalInterface instanceof zzcj) {
                        zzcjVar = (zzcj) queryLocalInterface;
                    } else {
                        zzcjVar = new zzcl(readStrongBinder);
                    }
                }
                zza(zzcjVar);
                parcel2.writeNoException();
                return true;
            } else if (i != 22) {
                return false;
            } else {
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
                    if (queryLocalInterface2 instanceof zzcg) {
                        zzcgVar = (zzcg) queryLocalInterface2;
                    } else {
                        zzcgVar = new zzci(readStrongBinder2);
                    }
                }
                zza(zzcgVar);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
